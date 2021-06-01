package pe.edu.upc.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "duenos")
public class Dueno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDueno;
	
	@Column(name = "nombre_dueno", length = 60, nullable = false)
	private String nameDueno;

	public int getIdDueno() {
		return idDueno;
	}

	public void setIdDueno(int idDueno) {
		this.idDueno = idDueno;
	}

	public String getNameDueno() {
		return nameDueno;
	}

	public void setNameDueno(String nameDueno) {
		this.nameDueno = nameDueno;
	}

	public Dueno(int idDueno, String nameDueno) {
		super();
		this.idDueno = idDueno;
		this.nameDueno = nameDueno;
	}

	public Dueno() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDueno;
		result = prime * result + ((nameDueno == null) ? 0 : nameDueno.hashCode());
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
		Dueno other = (Dueno) obj;
		if (idDueno != other.idDueno)
			return false;
		if (nameDueno == null) {
			if (other.nameDueno != null)
				return false;
		} else if (!nameDueno.equals(other.nameDueno))
			return false;
		return true;
	}
	
}
