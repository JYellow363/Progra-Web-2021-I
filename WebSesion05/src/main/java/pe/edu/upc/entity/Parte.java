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
@Table(name="Parte")
public class Parte implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idParte;
	
	@Column(name="descripcionParte", nullable=false, length=50)
	private String descripcionParte;
		
	@ManyToOne
	@JoinColumn(name="id", nullable=false)
	private Tormo motor;

	public Parte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parte(int idParte, String descripcionParte, Tormo motor) {
		super();
		this.idParte = idParte;
		this.descripcionParte = descripcionParte;
		this.motor = motor;
	}

	public int getIdParte() {
		return idParte;
	}

	public void setIdParte(int idParte) {
		this.idParte = idParte;
	}

	public String getDescripcionParte() {
		return descripcionParte;
	}

	public void setDescripcionParte(String descripcionParte) {
		this.descripcionParte = descripcionParte;
	}

	public Tormo getMotor() {
		return motor;
	}

	public void setMotor(Tormo motor) {
		this.motor = motor;
	}
			
}
