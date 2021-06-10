package pe.edu.upc.spring.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Editorial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy = "editorial", cascade = CascadeType.ALL)
	private Set<Libro_Editorial> libroEditoriales;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Libro_Editorial> getLibroEditoriales() {
		return libroEditoriales;
	}

	public void setLibroEditoriales(Set<Libro_Editorial> libroEditoriales) {
		this.libroEditoriales = libroEditoriales;
	}
	
}
