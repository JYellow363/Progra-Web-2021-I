package pe.edu.upc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPais;

	@Column(length = 60, nullable = false)
	private String namePais;

	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pais(int idPais, String namePais) {
		super();
		this.idPais = idPais;
		this.namePais = namePais;
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public String getNamePais() {
		return namePais;
	}

	public void setNamePais(String namePais) {
		this.namePais = namePais;
	}

}
