package pe.edu.upc.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "mascotas")
public class Pet implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPet;

	@Column(name = "nombre_raza", length = 60, nullable = false)
	private String namePet;

	@Column(name = "fecha_nac_mascota")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthDatePet;

	@ManyToOne
	@JoinColumn(name = "idRace", nullable = false)
	private Race race;
	
	@ManyToOne
	@JoinColumn(name = "idDueno", nullable = false)
	private Dueno dueno;

	public int getIdPet() {
		return idPet;
	}

	public void setIdPet(int idPet) {
		this.idPet = idPet;
	}

	public String getNamePet() {
		return namePet;
	}

	public void setNamePet(String namePet) {
		this.namePet = namePet;
	}

	public Date getBirthDatePet() {
		return birthDatePet;
	}

	public void setBirthDatePet(Date birthDatePet) {
		this.birthDatePet = birthDatePet;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public Dueno getDueno() {
		return dueno;
	}

	public void setDueno(Dueno dueno) {
		this.dueno = dueno;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pet(int idPet, String namePet, Date birthDatePet, Race race, Dueno dueno) {
		super();
		this.idPet = idPet;
		this.namePet = namePet;
		this.birthDatePet = birthDatePet;
		this.race = race;
		this.dueno = dueno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDatePet == null) ? 0 : birthDatePet.hashCode());
		result = prime * result + ((dueno == null) ? 0 : dueno.hashCode());
		result = prime * result + idPet;
		result = prime * result + ((namePet == null) ? 0 : namePet.hashCode());
		result = prime * result + ((race == null) ? 0 : race.hashCode());
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
		Pet other = (Pet) obj;
		if (birthDatePet == null) {
			if (other.birthDatePet != null)
				return false;
		} else if (!birthDatePet.equals(other.birthDatePet))
			return false;
		if (dueno == null) {
			if (other.dueno != null)
				return false;
		} else if (!dueno.equals(other.dueno))
			return false;
		if (idPet != other.idPet)
			return false;
		if (namePet == null) {
			if (other.namePet != null)
				return false;
		} else if (!namePet.equals(other.namePet))
			return false;
		if (race == null) {
			if (other.race != null)
				return false;
		} else if (!race.equals(other.race))
			return false;
		return true;
	}

}
