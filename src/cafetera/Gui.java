package cafetera;

import java.util.Scanner;

public class Gui { 
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		

	}
	
	public static void inicioGui() {
		
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("******* Máquina Café y Té *******");
		System.out.println("********** Firware 1.0 **********");
		System.out.println("** Programador José Luis Gómez **");
		System.out.println("*********************************");
		System.out.println("*********************************");
		
		
	}
	
	public static void menuGui() {

		System.out.println("\n\n     INTRODUCIR OPCIÓN     \n");
		System.out.println("(1) Pedir café o té.");
		System.out.println("(2) Administrar la máquina.");		
		
	}

	public static void seleccionarProductosGui() {

		System.out.println("\n\n     ELIJA UN PRODUCTO   \n");
		System.out.println("(1) Café solo ----------- 1.00€");
		System.out.println("(2) Café con leche ------ 1.25€");	
		System.out.println("(3) Capuccino ----------- 1.50€");
		System.out.println("(4) Té rojo ------------- 1.00€");
		System.out.println("(5) Té verde ------------ 1.00€");
	
	}
	
	public static void introducirMonedaGui() {

		System.out.println("INTRODUZCA MONEDAS:");
		System.out.println("(1) Moneda de 5 céntimos.");
		System.out.println("(2) Moneda de 10 céntimos.");	
		System.out.println("(3) Moneda de 20 céntimos.");
		System.out.println("(4) Moneda de 50 céntimos.");
		System.out.println("(5) Moneda de 1 euro.");
		System.out.println("(6) CANCELAR.");
	
	}

	public static boolean inicarSesionAdministradorGui() {

		System.out.println("BIENVENIDO Señor Administrador.");
		System.out.println("INTRODUZCA Usuario:");
		String usuario = sc.next();
		System.out.println("INTRODUZCA Contraseña:");
		String contraseña = sc.next();
		if ("JoseLuis".equals(usuario) && "1234".equals(contraseña)) {
			
			System.out.println("Iniciado sesión...");
			return true;
			
		} else {
			
			System.out.println("ERROR. Usuario o contraseña invalido.");
			return false;
			
		}
	
	}
	
	public static void menuAdministradorGui() {

		System.out.println("INTRODUCIR OPCIÓN:");
		System.out.println("(1) Ver recaudación.");
		System.out.println("(2) Recoger recaudación.");
		System.out.println("(3) Revisar utiles y consumibles.");	
		System.out.println("(4) Añadir vasos.");
		System.out.println("(5) Añadir palitos.");
		System.out.println("(6) Añadir azucar.");
		System.out.println("(7) Añadir agua.");
		System.out.println("(8) Apagar máquina.");
		System.out.println("(9) SALIR.");
	
	}
	
}
