package Cajero;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> dcajero = new ArrayList<>();
		
		
		System.out.println("Bienvenido al cajero automático");
		
		Scanner entrada = new Scanner(System.in);
		
		//Datos cajero
		Cajero cajero= new Cajero(0, null);
		cajero.setNombreC("Banco");
		dcajero.add("Banco:" + cajero.getNombreC() );
		cajero.setIdCajero(123456);
		dcajero.add("ID Cajero: #" + cajero.getIdCajero() );
		System.out.println("Cajero " + cajero.getNombreC()+" con ID: "+cajero.getIdCajero());
		
		//Datos usuario
		Cliente cliente1 = new Cliente(0, null, null);
		Tarjeta tarjeta1 = new Tarjeta(null, null);
		CuentaBancaria cuenta1 = new CuentaBancaria(null, 0);
		
		System.out.println("\nIngrese usuario");
		cliente1.setNombre(entrada.nextLine());
		dcajero.add("Usuario:" + cliente1.getNombre());
		System.out.println("Ingrese su tarjeta ");
	    String numeroTarjeta = entrada.nextLine();
	    dcajero.add("Numero de tarjeta: " + numeroTarjeta);
	    cliente1.setIdCliente(1345);
	    System.out.println("Ingrese su clave secreta: ");
	    cliente1.setClave(entrada.nextLine());
	    System.out.println("Seleccione su tipo de tarjata: \n1. Debito \n2. Credito");
	    String tipoTarjeta = entrada.next();
	    
	    //seguridad
	    String tGuardada = "1234567890";             
	    String claveG = "secreto987";
	
	    if(numeroTarjeta.equals(tGuardada)&&cliente1.getClave().equals(claveG)) {
                System.out.println("Acceso exitoso");                                                                                       
                mostrarMenu();                                              
		    } else {                                                        
		        System.out.println("Acceso denegado. Intente nuevamente."); 
		    } 
	    //Recibo
	    System.out.println("\tRECIBO CAJERO\t");
		System.out.println("\tID cajero: #" + cajero.getIdCajero());
		System.out.println("\tID cliente: #" + cliente1.getIdCliente());
		System.out.println("\tnumero de cuenta:" + cuenta1.getNumeroCuenta());
		dcajero.add(cuenta1.getNumeroCuenta());
		System.out.println("\tNumero de tarjeta:" + numeroTarjeta );
		System.out.println("\tTipo de tarjeta: " + tarjeta1.validarTarjeta(tipoTarjeta)); 
		dcajero.add(tarjeta1.validarTarjeta(tipoTarjeta));
		System.out.println("\tSaldo disponible:" + cuenta1.getSaldo());

		try {
			FileWriter fw = new FileWriter("datos.txt");
			for (String dato : dcajero) {
				fw.write(dato + "\n");
			}
			fw.close();
			System.out.println("Datos guardados en datos.txt");
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo");
			e.printStackTrace();
		}
}   
	
	 //menu
	 private static void mostrarMenu() {
		 CuentaBancaria info = new CuentaBancaria(null, 0);
		 Transaccion transaccion = new Transaccion(0, 0);
		 int op =0;
		 Scanner lectura = new Scanner(System.in);
		// TODO Auto-generated method stub
		 do {
		 	System.out.println("\nMenú principal:");
		    System.out.println("1. Consultar saldo ");
		    System.out.println("2. Depositar efectivo");
		    System.out.println("3. Retirar efectivo");
		    System.out.println("4. Salir");
		    System.out.println("Seleccione una opción: ");
		    op = lectura.nextInt();
		    
		    switch(op){
				case 1:  info.consultarsaldo(); break;
				case 2:  info.depositar(transaccion); break;
				case 3:  info.retirar(transaccion); break;
				case 4:  System.out.println("Saliendo del sistema..."); break;
				default: System.out.println("Opcion no valida"); break;
		    }
		}while(op <= 3); 
	}	 
}