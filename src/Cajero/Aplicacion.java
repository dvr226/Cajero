package Cajero;

import java.util.Scanner;

public class Aplicacion {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Bienvenido al cajero automático");

    System.out.print("Ingrese su tarjeta: ");
    String numeroTarjeta = scanner.nextLine();

    Sysout("Ingrese su clave secreta: ");
    String clave = scanner.nextLine();

    boolean accesoValido = validarAcceso(numeroTarjeta, clave){
    	
    if (accesoValido) {
        System.out.println("Acceso exitoso");
        mostrarMenuPrincipal();
    } else {
        System.out.println("Acceso denegado. Intente nuevamente.");
    }
}

private static boolean validarTarjeta(String tarjeta, String claveSecreta) {
    return true;
}

private static void mostrarMenuPrincipal() {
    
    System.out.println("Menú principal:");
    System.out.println("1. Consultar saldo ");
    System.out.println("2. Depositar efectivo");
    System.out.println("3. Retirar efectivo");
    System.out.println("4. Transferir fondos");
    System.out.println("5. Salir");

    System.out.print("Seleccione una opción: ");
}
}
