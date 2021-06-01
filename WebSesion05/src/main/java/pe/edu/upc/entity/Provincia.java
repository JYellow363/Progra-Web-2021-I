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
@Table(name="Provincia")
public class Provincia implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProvincia;
	
	@Column(name="descripcionProvincia", nullable=false, length=45)
	private String descripcionProvincia;
	
	@ManyToOne
	@JoinColumn(name="idDepartamento", nullable=false)
	private Departamento departamento;

	public Provincia() {
		super();
	}

	public Provincia(int idProvincia, String descripcionProvincia, Departamento departamento) {
		super();
		this.idProvincia = idProvincia;
		this.descripcionProvincia = descripcionProvincia;
		this.departamento = departamento;
	}

	public int getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getDescripcionProvincia() {
		return descripcionProvincia;
	}

	public void setDescripcionProvincia(String descripcionProvincia) {
		this.descripcionProvincia = descripcionProvincia;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
}
