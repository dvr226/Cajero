package Cajero;

public class Cajero {
	private int idCajero;
	private String nombreC;

	public int getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	} 
	
	public String getNombreC() {
		return nombreC;
	}

	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}

	public Cajero(int idCajero, String nombreC) {
		super();
		this.idCajero = idCajero;
		this.nombreC = nombreC;
	}
}
