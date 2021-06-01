package pe.edu.upc.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "razas")
public class Race {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRace;

	@Column(name = "nombreRaza", length = 60, nullable = false)
	private String nameRace;

	public Race(int idRace, String nameRace) {
		super();
		this.idRace = idRace;
		this.nameRace = nameRace;
	}

	public Race() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdRace() {
		return idRace;
	}

	public void setIdRace(int idRace) {
		this.idRace = idRace;
	}

	public String getNameRace() {
		return nameRace;
	}

	public void setNameRace(String nameRace) {
		this.nameRace = nameRace;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idRace;
		result = prime * result + ((nameRace == null) ? 0 : nameRace.hashCode());
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
		Race other = (Race) obj;
		if (idRace != other.idRace)
			return false;
		if (nameRace == null) {
			if (other.nameRace != null)
				return false;
		} else if (!nameRace.equals(other.nameRace))
			return false;
		return true;
	}

	
}
