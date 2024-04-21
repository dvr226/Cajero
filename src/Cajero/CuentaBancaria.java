package Cajero;

import java.util.Scanner;

public class CuentaBancaria {
	private String numeroCuenta = "0001";
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
	
	public CuentaBancaria(String numeroCuenta, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	
	public void consultarsaldo() {
		if (saldo>=0) {
			System.out.println("Saldo total en la cuenta: $" + getSaldo());
		}   
	}
	
	public double retirar(Transaccion transaccion) {
		double monto;
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Ingrese el monto a retirar");
		monto = entrada.nextDouble();
		
		
		if (saldo >= monto && monto >= 0) {
            saldo -= monto;
            System.out.println("El saldo disponible es: " + getSaldo());
            return saldo;
        } else {
        	System.out.println("La cantidad indicada no es válida.");
        	return 0;
        }	
	}
	public double depositar(Transaccion transaccion) {
		double monto;
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Ingrese el monto a depositar");
		monto = entrada.nextDouble();
		
		 if (monto >= 0) {
	         saldo += monto;
	         System.out.println("El saldo disponible es: " + getSaldo());
	         return saldo;
	        } else {
	        	System.out.println("La cantidad indicada no es válida.");
	        	return 0;
	        }
	} 
	
}
