package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="docenteCurso")
public class DocenteCurso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idDocenteCurso;
	
	private int numAniosExperiencia;
	
	@ManyToOne
	@JoinColumn(name="idDocente", nullable=false)
	private Docente docente;	
	
	@ManyToOne
	@JoinColumn(name="idCurso", nullable=false)
	private Curso curso;

	public DocenteCurso() {
		super();
	}

	public DocenteCurso(int idDocenteCurso, int numAniosExperiencia, Docente docente, Curso curso) {
		super();
		this.idDocenteCurso = idDocenteCurso;
		this.numAniosExperiencia = numAniosExperiencia;
		this.docente = docente;
		this.curso = curso;
	}

	public int getIdDocenteCurso() {
		return idDocenteCurso;
	}

	public void setIdDocenteCurso(int idDocenteCurso) {
		this.idDocenteCurso = idDocenteCurso;
	}

	public int getNumAniosExperiencia() {
		return numAniosExperiencia;
	}

	public void setNumAniosExperiencia(int numAniosExperiencia) {
		this.numAniosExperiencia = numAniosExperiencia;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((docente == null) ? 0 : docente.hashCode());
		result = prime * result + idDocenteCurso;
		result = prime * result + numAniosExperiencia;
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
		DocenteCurso other = (DocenteCurso) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (docente == null) {
			if (other.docente != null)
				return false;
		} else if (!docente.equals(other.docente))
			return false;
		if (idDocenteCurso != other.idDocenteCurso)
			return false;
		if (numAniosExperiencia != other.numAniosExperiencia)
			return false;
		return true;
	}
	
}
