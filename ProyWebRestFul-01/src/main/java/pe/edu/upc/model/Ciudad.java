package pe.edu.upc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ciudad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCiudad;

	private String nameCiudad;

	private int nroPersonasCiudad;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Pais pais;

	public Ciudad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ciudad(int idCiudad, String nameCiudad, int nroPersonasCiudad, Pais pais) {
		super();
		this.idCiudad = idCiudad;
		this.nameCiudad = nameCiudad;
		this.nroPersonasCiudad = nroPersonasCiudad;
		this.pais = pais;
	}

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNameCiudad() {
		return nameCiudad;
	}

	public void setNameCiudad(String nameCiudad) {
		this.nameCiudad = nameCiudad;
	}

	public int getNroPersonasCiudad() {
		return nroPersonasCiudad;
	}

	public void setNroPersonasCiudad(int nroPersonasCiudad) {
		this.nroPersonasCiudad = nroPersonasCiudad;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
