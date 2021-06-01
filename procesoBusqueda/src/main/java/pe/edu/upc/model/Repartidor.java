package pe.edu.upc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "repartidores")
public class Repartidor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRepartidor;
	
	@Column(name = "nameRepartidor", length = 30, nullable = false)
	private String nameRepartidor;
	
	@Column(name = "ruc", length = 11, nullable = false)
	private String ruc;
	
	@Column(name = "cantidad", nullable = false)
	private int cantidad;
	
	@Column(name = "montoPagar", nullable = false)
	private int montoPagar;
	
	@Transient
	private double netoPagar;

	public Repartidor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Repartidor(int idRepartidor, String nameRepartidor, String ruc, int cantidad, int montoPagar,
			double netoPagar) {
		super();
		this.idRepartidor = idRepartidor;
		this.nameRepartidor = nameRepartidor;
		this.ruc = ruc;
		this.cantidad = cantidad;
		this.montoPagar = montoPagar;
		this.netoPagar = netoPagar;
	}

	public int getIdRepartidor() {
		return idRepartidor;
	}

	public void setIdRepartidor(int idRepartidor) {
		this.idRepartidor = idRepartidor;
	}

	public String getNameRepartidor() {
		return nameRepartidor;
	}

	public void setNameRepartidor(String nameRepartidor) {
		this.nameRepartidor = nameRepartidor;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getMontoPagar() {
		return montoPagar;
	}

	public void setMontoPagar(int montoPagar) {
		this.montoPagar = montoPagar;
	}

	public double getNetoPagar() {
		return netoPagar;
	}

	public void setNetoPagar(double netoPagar) {
		this.netoPagar = netoPagar;
	}
	
}
