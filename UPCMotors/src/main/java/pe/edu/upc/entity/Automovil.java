package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="automovil")
public class Automovil implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idAutomovil;
	
	@Column(name="placaAutomovil", nullable=false, length=6)
	private String placaAutomovil;
	
	@ManyToOne
	@JoinColumn(name="idPropietario", nullable=false)
	private Propietario propietario;

	public Automovil() {
		super();
	}

	public Automovil(int idAutomovil, String placaAutomovil, Propietario propietario) {
		super();
		this.idAutomovil = idAutomovil;
		this.placaAutomovil = placaAutomovil;
		this.propietario = propietario;
	}

	public int getIdAutomovil() {
		return idAutomovil;
	}

	public void setIdAutomovil(int idAutomovil) {
		this.idAutomovil = idAutomovil;
	}

	public String getPlacaAutomovil() {
		return placaAutomovil;
	}

	public void setPlacaAutomovil(String placaAutomovil) {
		this.placaAutomovil = placaAutomovil;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAutomovil;
		result = prime * result + ((placaAutomovil == null) ? 0 : placaAutomovil.hashCode());
		result = prime * result + ((propietario == null) ? 0 : propietario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automovil other = (Automovil) obj;
		if (idAutomovil != other.idAutomovil)
			return false;
		if (placaAutomovil == null) {
			if (other.placaAutomovil != null)
				return false;
		} else if (!placaAutomovil.equals(other.placaAutomovil))
			return false;
		if (propietario == null) {
			if (other.propietario != null)
				return false;
		} else if (!propietario.equals(other.propietario))
			return false;
		return true;
	}
}
