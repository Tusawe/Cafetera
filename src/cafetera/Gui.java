package cafetera;

import java.util.Scanner;

public class Gui { 
	
	// Creamos el objeto Scanner para leer datos.
	static Scanner sc = new Scanner(System.in);
	
	// Creamos el objeto cafetera.
	static Cafetera cafetera = new Cafetera();
	
	// Creamos una coleccion de objetos consumibles para poder acceder a ellos.
	static Consumible [] consumibles = cafetera.getConsumibles();
	
	public static void main(String[] args) {
		// Variable para apagar la cafetera.
		boolean apagar = false;
		
		// Creamos los consumibles.
		cafetera.insertarConsumible(0, 2, 1.00, 0.15, "Café solo");
		cafetera.insertarConsumible(1, 3, 1.25, 0.20, "Café con leche");
		cafetera.insertarConsumible(2, 4, 1.50, 0.20, "Capuccino");
		cafetera.insertarConsumible(3, 10, 1.00, 0.25, "Té rojo");
		cafetera.insertarConsumible(4, 10, 1.00, 0.25, "Té verde");
		
		// Inicimos la maquina.
		while (!apagar) {
		
			// Pantalla de inicio.
			inicio();
		
			// Menú de inicio.
			menu();
			
			// Pedimos la opción.
			int op  = sc.nextInt();
			while (!(op >= 1 && op <= 2)) {
				
				System.out.println("ERROR: Opción incorrecta.");
				menu();
				op  = sc.nextInt();
				
			}
			
			// Y ejecutamos esa opción.
			switch (op) {
			
				case 1:
					// Mostramos cafés y tés disponibles.
					System.out.println("Opción 1 elegida.");
					
					break;
					
				default:
					// Comprobamos si es el administrador.
					if (!(inicarSesionAdministrador())) {
						
						break;
						
					}
					
					boolean salir = false;
					
					while (!salir) {
						//Mostramos menú del administrador.
						menuAdministrador();
						
						// Pedimos la opción.
						int opAdmin  = sc.nextInt();
						while (!(opAdmin >= 1 && opAdmin <= 9)) {
							
							System.out.println("ERROR: Opción incorrecta.");
							menu();
							opAdmin  = sc.nextInt();
							
						}
						
						// Y ejecutamos esa opción.
						switch (opAdmin) {
						
							case 1: 
								// Mostramos recaudación
								System.out.printf("El dinero recaudado es %.2f%n%n",cafetera.getDinero());
								
								break;
								
							case 2: 
								// Recogemos el direno.
								cafetera.recaudarDinero();
								System.out.println("Ya no hay dinero recaudado.\n");
								
								break;
							
							case 3: 
								// Mostramos los utiles que quedan.
								System.out.printf("Quedan %d vasos%n", cafetera.getVasos());
								System.out.printf("Quedan %d palitos%n", cafetera.getPalitos());
								System.out.printf("Quedan %d terrones de azucar%n", cafetera.getAzucar());
								System.out.printf("Quedan %.2f litros de agua%n", cafetera.getAgua());
								
								break;
							
							case 4: 
								// Recargamos los vasos.
								cafetera.recargarVasos();
								System.out.printf("Vasos recargados. Actualmente hay %d vasos.%n%n",cafetera.getVasos());
								
								break;
								
							case 5:
								// Recargamos los palitos.
								cafetera.recargarPalitos();
								System.out.printf("Palitos recargados. Actualmente hay %d palitos.%n%n",cafetera.getPalitos());
								
								break;
								
							case 6:
								// Recargamos el azucar.
								cafetera.recargarAzucar();
								System.out.printf("Azucar recargado. Actualmente hay %d terrones de azucar.%n%n",cafetera.getAzucar());
								
								break;
								
							case 7:
								// Recargamos el agua.
								cafetera.recargarAgua();
								System.out.printf("Agua recargada. Actualmente hay %.2f litros de agua.%n%n",cafetera.getAgua());
								
								break;
								
							case 8: 
								// Apagamos la máquina.
								salir = true;
								apagar = true;
								System.out.println("Apagando máquina...");
								
								break;
								
							default: 
								// Cerramos sesión.
								salir = true;
								System.out.println("Cerrando sesión...\n\n");
								
								break;
						
						}
					
					}
					
					break;
			
			}
			
		
		}
		
		sc.close();
		System.out.println("Apagando máquina...");
		System.out.println("HASTA OTRA :)");

	}
	
	public static void inicio() {
		
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("******* Máquina Café y Té *******");
		System.out.println("********** Firware 1.0 **********");
		System.out.println("** Programador José Luis Gómez **");
		System.out.println("*********************************");
		System.out.println("*********************************");
		
		
	}
	
	public static void menu() {

		System.out.println("\n\n     INTRODUCIR OPCIÓN     \n");
		System.out.println("(1) Pedir café o té.");
		System.out.println("(2) Administrar la máquina.");		
		
	}

	public static void seleccionarProductos() {

		System.out.println("\n\n     ELIJA UN PRODUCTO   \n");
		System.out.printf("(1) %s ----------- %.2f €%n",consumibles[0].getTipo(),consumibles[0].getPrecio());
		System.out.printf("(2) %s ----------- %.2f €%n",consumibles[1].getTipo(),consumibles[1].getPrecio());	
		System.out.printf("(3) %s ----------- %.2f €%n",consumibles[2].getTipo(),consumibles[2].getPrecio());
		System.out.printf("(4) %s ----------- %.2f €%n",consumibles[3].getTipo(),consumibles[3].getPrecio());
		System.out.printf("(5) %s ----------- %.2f €%n",consumibles[4].getTipo(),consumibles[4].getPrecio());
		System.out.println("(6) CANCELAR.");
	
	}
	
	public static void introducirMoneda() {

		System.out.println("\n\nINTRODUZCA MONEDAS:");
		System.out.println("(1) Moneda de 5 céntimos.");
		System.out.println("(2) Moneda de 10 céntimos.");	
		System.out.println("(3) Moneda de 20 céntimos.");
		System.out.println("(4) Moneda de 50 céntimos.");
		System.out.println("(5) Moneda de 1 euro.");
		System.out.println("(6) CANCELAR.");
	
	}
	
	public static boolean inicarSesionAdministrador() {

		System.out.println("\n\nBIENVENIDO Señor Administrador.");
		System.out.println("INTRODUZCA Usuario:");
		String usuario = sc.next();
		System.out.println("INTRODUZCA Contraseña:");
		String contraseña = sc.next();
		if ("Admin".equals(usuario) && "1234".equals(contraseña)) {
			
			System.out.println("Iniciado sesión...");
			return true;
			
		} else {
			
			System.out.println("ERROR. Usuario o contraseña invalido.");
			return false;
			
		}
	
	}
	
	public static void menuAdministrador() {

		System.out.println("\n\nINTRODUCIR OPCIÓN:");
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
