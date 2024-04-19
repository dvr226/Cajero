package Cajero;

import java.util.Scanner;

public class Aplicacion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido al cajero automático");
		
		Scanner scanner = new Scanner(System.in);
		Cajero cajero= new Cajero();
		cajero.setNombre("Banco");
		cajero.setIdCajero(123456);
		System.out.println(cajero.getNombre()+": "+cajero.getIdCajero());
		
		System.out.println("Ingrese su tarjeta: ");
	    String numeroTarjeta = scanner.nextLine();
	    
	    System.out.println("Ingrese su clave secreta: ");
	    String clave = scanner.nextLine();
	    
	    System.out.println("Seleccione su tipo de tarjata: \n1. Debito \n2. Credito");
	    String tipoTarjeta = scanner.nextLine();
	}
	    String tarjetaGuardada = "1234567890";             
	    String claveGuardada = "secreto987";
	
	    if(numeroTarjeta.equals(tarjetaGuardada)&&clave.equals(claveGuardada)) {
                System.out.println("Acceso exitoso");                                                                                       
                mostrarMenu();                                              
		    } else {                                                        
		        System.out.println("Acceso denegado. Intente nuevamente."); 
		    }                                                                                                                                  
	 }
		   		   

	 CuentaBancaria info = new CuentaBancaria();
	 int op =0;
	 {
	 do{
		switch(op){
		case 1:  info.consultarsaldo();break;
		case 2:  info.depositar(op);break;
		case 3:  info.retirar(op);break;
		case 4:  info.ejecutarTransaccion();break;
		case 5:  System.exit(0); break;
		default: System.out.println("Opcion no valida");
		
		}
		}while(op != 5);
	
	 public  void mostrarMenu() {
		    
		    System.out.println("Menú principal:");
		    System.out.println("1. Consultar saldo ");
		    System.out.println("2. Depositar efectivo");
		    System.out.println("3. Retirar efectivo");
		    System.out.println("4. Transferir fondos");
		    System.out.println("5. Salir");

		    System.out.println("Seleccione una opción: ");
		}
	 //depositar
	 CuentaBancaria cuenta= new CuentaBancaria();

	 {
	 System.out.print("Introduce la cantidad a depositar: ");
     Scanner scanner = null;
	 double cantidad = scanner.nextDouble(); 
	 boolean bDeposito = cuenta.depositar(cantidad);

     if (bDeposito) {
         System.out.println("Depósito exitoso. Saldo actual: " + cuenta.getSaldo());
     } else {
         System.out.println("No se pudo realizar el depósito. Cantidad inválida.");
     }
	 
}
	 
	 }	 
}
