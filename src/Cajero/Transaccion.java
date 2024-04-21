package Cajero;

public class Transaccion {
	private int idTransaccion;
	private double monto;
	
	public int getIdTransaccion() {
		return idTransaccion;
	}
	public void setIdTransaccion(int idTransaccion) {
		this.idTransaccion = idTransaccion;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	public Transaccion(int idTransaccion, double monto) {
		super();
		this.idTransaccion = idTransaccion;
		this.monto = monto;
	}
}
