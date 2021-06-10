package pe.edu.upc.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Licence {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_licencia;

	private String categoria;
	private String fechaEmision;

	@OneToOne
	@JoinColumn(name = "id_persona", nullable = false)
	private Person person;

	public int getId_licencia() {
		return id_licencia;
	}

	public void setId_licencia(int id_licencia) {
		this.id_licencia = id_licencia;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
