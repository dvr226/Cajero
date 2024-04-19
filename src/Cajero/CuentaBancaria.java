package Cajero;

public class CuentaBancaria {
	private String numeroCuenta;
	private double saldo;
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String consultarsaldo() {
		System.out.println("Numero Cuenta " + numeroCuenta);
	    System.out.println("Nombre y Apellido del Cliente: " +  "Pepito " + "Perez");
	    System.out.println("Saldo total en la cuenta: $" + saldo);
		return null;
	}
	public boolean retirar(double cantidad) {
		if (saldo >= cantidad && cantidad >= 0) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
	}
	public boolean depositar(double cantidad) {
		 if (cantidad >= 0) {
	         saldo += cantidad;
	         return true;
	        } else {
	            return false;
	        }
	} 
	

	public void ejecutarTransaccion() {
		return ;
	}
	
}
