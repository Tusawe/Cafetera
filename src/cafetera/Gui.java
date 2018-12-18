package cafetera;

import java.util.Scanner;

public class Gui { 
	
	// Creamos el objeto Scanner para leer datos.
	static Scanner sc = new Scanner(System.in);
	
	// Creamos el objeto cafetera.
	static Cafetera cafetera = new Cafetera();
	
	// Creamos una coleccion de objetos consumibles para poder acceder a ellos.
	static Consumible [] consumibles = cafetera.getConsumibles();
	
	public static void main(String[] args) throws InterruptedException {
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
					seleccionarProductos();
					
					// Pedimos la opción.
					int opCliente = sc.nextInt();
					while (!(opCliente >= 1 && opCliente <= 6)) {
						
						System.out.println("ERROR: Opción incorrecta.");
						seleccionarProductos();
						opCliente  = sc.nextInt();
						
					}
					
					// Y ejecutamos esa opción.
					switch (opCliente) {
					
						case 1:
							// Comprobamos si se puede producir ese consumible o no por falta e utiles.
							if (!(cafetera.esPosible(0))) {
								
								System.out.println("ERROR: No Disponible.");
								break;
								
							}
							
							// Comprobamos si ha pagado con el dinero justo.
							if (!estaPagado(0))	{
								
								break;
								
							}			
							
							// Restamos los utiles gastados.
							cafetera.gastarAzucar(preguntarCantidadAzucar());							
							cafetera.gastarAgua(consumibles[0].getAgua());
							cafetera.gastarPalitos();
							cafetera.gastarVasos();
							consumibles[0].gastarCapsulas();
							
							// Producimos el consumible.
							System.out.printf("Sirviendo %S. Espere %d segundos.%n",consumibles[0].getTipo(),consumibles[0].getTiempo());
							Thread.sleep((consumibles[0].getTiempo()) * 1000);
							
							System.out.printf("LISTO, ya puede recoger su %S.%n%n",consumibles[0].getTipo());
							
							break;
							
						case 2:	
							// Comprobamos si se puede producir ese consumible o no por falta e utiles.
							if (!(cafetera.esPosible(1))) {
								
								System.out.println("ERROR: No Disponible.");
								break;
								
							}
							
							// Comprobamos si ha pagado con el dinero justo.
							if (!estaPagado(1))	{
								
								break;
								
							}
							
							// Restamos los utiles gastados.
							cafetera.gastarAzucar(preguntarCantidadAzucar());							
							cafetera.gastarAgua(consumibles[1].getAgua());
							cafetera.gastarPalitos();
							cafetera.gastarVasos();
							consumibles[1].gastarCapsulas();
							
							// Producimos el consumible.
							System.out.printf("Sirviendo %S. Espere %d segundos.%n",consumibles[1].getTipo(),consumibles[1].getTiempo());
							Thread.sleep((consumibles[1].getTiempo()) * 1000);
							
							System.out.printf("LISTO, ya puede recoger su %S.%n%n",consumibles[1].getTipo());
							
							break;
							
						case 3:
							// Comprobamos si se puede producir ese consumible o no por falta e utiles.
							if (!(cafetera.esPosible(2))) {
								
								System.out.println("ERROR: No Disponible.");
								break;
								
							}
							
							// Comprobamos si ha pagado con el dinero justo.
							if (!estaPagado(2))	{
								
								break;
								
							}
							
							// Restamos los utiles gastados.
							cafetera.gastarAzucar(preguntarCantidadAzucar());							
							cafetera.gastarAgua(consumibles[2].getAgua());
							cafetera.gastarPalitos();
							cafetera.gastarVasos();
							consumibles[1].gastarCapsulas();
							
							// Producimos el consumible.
							System.out.printf("Sirviendo %S. Espere %d segundos.%n",consumibles[2].getTipo(),consumibles[2].getTiempo());
							Thread.sleep((consumibles[2].getTiempo()) * 1000);
							
							System.out.printf("LISTO, ya puede recoger su %S.%n%n",consumibles[2].getTipo());
							
							break;
							
						case 4:
							// Comprobamos si se puede producir ese consumible o no por falta e utiles.
							if (!(cafetera.esPosible(3))) {
								
								System.out.println("ERROR: No Disponible.");
								break;
								
							}
							
							// Comprobamos si ha pagado con el dinero justo.
							if (!estaPagado(3))	{
								
								break;
								
							}
							
							// Restamos los utiles gastados.
							cafetera.gastarAzucar(preguntarCantidadAzucar());							
							cafetera.gastarAgua(consumibles[3].getAgua());
							cafetera.gastarPalitos();
							cafetera.gastarVasos();
							consumibles[3].gastarCapsulas();
							
							// Producimos el consumible.
							System.out.printf("Sirviendo %S. Espere %d segundos.%n",consumibles[3].getTipo(),consumibles[3].getTiempo());
							Thread.sleep((consumibles[3].getTiempo()) * 1000);
							
							System.out.printf("LISTO, ya puede recoger su %S.%n%n",consumibles[3].getTipo());
							
							break;
							
						case 5:
							// Comprobamos si se puede producir ese consumible o no por falta e utiles.
							if (!(cafetera.esPosible(4))) {
								
								System.out.println("ERROR: No Disponible.");
								break;
								
							}
							
							// Comprobamos si ha pagado con el dinero justo.
							if (!estaPagado(4))	{
								
								break;
								
							}
							
							// Restamos los utiles gastados.
							cafetera.gastarAzucar(preguntarCantidadAzucar());							
							cafetera.gastarAgua(consumibles[4].getAgua());
							cafetera.gastarPalitos();
							cafetera.gastarVasos();
							consumibles[4].gastarCapsulas();
							
							// Producimos el consumible.
							System.out.printf("Sirviendo %S. Espere %d segundos.%n",consumibles[4].getTipo(),consumibles[4].getTiempo());
							Thread.sleep((consumibles[4].getTiempo()) * 1000);
							
							System.out.printf("LISTO, ya puede recoger su %S.%n%n",consumibles[4].getTipo());
							
							break;
							
						default:
							
							break;
					
					}
					
					break;
					
				default:
					
					boolean salir = false;
					boolean sesion = false;
					
					while (!salir) {
						//Comprobamos si ya ha iniciado sesión.
						if (sesion == false) {
							
							// Comprobamos si es el administrador.
							if (!(inicarSesionAdministrador())) {								
								
								break;
								
							}
							
							sesion = true;
						
						}
						
						//Mostramos menú del administrador.
						menuAdministrador();
						
						// Pedimos la opción.
						int opAdmin  = sc.nextInt();
						while (!(opAdmin >= 1 && opAdmin <= 10)) {
							
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
								// Mostramos los utiles y consumibles que quedan.
								System.out.printf("Quedan %d VASOS%n", cafetera.getVasos());
								System.out.printf("Quedan %d PALITOS%n", cafetera.getPalitos());
								System.out.printf("Quedan %d terrones de AZUCAR%n", cafetera.getAzucar());
								System.out.printf("Quedan %.2f litros de AGUA%n", cafetera.getAgua());
								System.out.printf("Quedan %d capsulas de %S%n", consumibles[0].getCapsulas(), consumibles[0].getTipo());
								System.out.printf("Quedan %d capsulas de %S%n", consumibles[1].getCapsulas(), consumibles[1].getTipo());
								System.out.printf("Quedan %d capsulas de %S%n", consumibles[2].getCapsulas(), consumibles[2].getTipo());
								System.out.printf("Quedan %d capsulas de %S%n", consumibles[3].getCapsulas(), consumibles[3].getTipo());
								System.out.printf("Quedan %d capsulas de %S%n", consumibles[4].getCapsulas(), consumibles[4].getTipo());
								
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
								// Preguntamos que consumible desea recargar.
								menuRecargarCapsulas();
								
								// Pedimos la opción.
								int opCapsu  = sc.nextInt();
								while (!(opCapsu >= 1 && opCapsu <= 7)) {
									
									System.out.println("ERROR: Opción incorrecta.");
									menu();
									opCapsu  = sc.nextInt();
									
								}
								
								// Y ejecutamos esa opción.
								switch (opCapsu) {
								
									case 1:
										//Recargamos Café solo.
										consumibles[0].recargarCapsulas();
										System.out.println("Capsulas recargadas.");
										
										break;
									
									case 2:
										//Recargamos Café con leche.
										consumibles[1].recargarCapsulas();
										System.out.println("Capsulas recargadas.");
										
										break;
										
									case 3:
										//Recargamos Capuccino.
										consumibles[2].recargarCapsulas();
										System.out.println("Capsulas recargadas.");
										
										break;
										
									case 4:
										//Recargamos Té rojo.
										consumibles[3].recargarCapsulas();
										System.out.println("Capsulas recargadas.");
										
										break;
										
									case 5:
										//Recargamos Té verde.
										consumibles[4].recargarCapsulas();
										System.out.println("Capsulas recargadas.");
										
										break;
										
									case 6:
										//Recargamos todos los consumibles.
										consumibles[0].recargarCapsulas();
										consumibles[1].recargarCapsulas();
										consumibles[2].recargarCapsulas();
										consumibles[3].recargarCapsulas();
										consumibles[4].recargarCapsulas();
										System.out.println("Todas las capsulas han sido recargadas.");
										
										break;
										
									default:
										
										break;
									
								
								}
								
								break;
								
							case 9: 
								// Apagamos la máquina.
								salir = true;
								apagar = true;								
								
								break;
								
							default: 
								// Cerramos sesión.
								salir = true;
								sesion = false;
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
		System.out.println("(8) Recargar capsulas.");
		System.out.println("(9) Apagar máquina.");
		System.out.println("(10) SALIR.");
	
	}
	
	public static void menuRecargarCapsulas() {

		System.out.println("\n\n¿Qué consumible desea recargas?");
		System.out.printf("(1) %s.%n",consumibles[0].getTipo());
		System.out.printf("(2) %s.%n",consumibles[1].getTipo());
		System.out.printf("(3) %s.%n",consumibles[2].getTipo());
		System.out.printf("(4) %s.%n",consumibles[3].getTipo());
		System.out.printf("(5) %s.%n",consumibles[4].getTipo());
		System.out.println("(6) TODOS.");
		System.out.println("(7) CANCELAR.");
	
	}
	
	public static int preguntarCantidadAzucar() {

		System.out.println("\n\n¿Cuánto azucar desea?");
		System.out.println("(1) Nada.");
		System.out.println("(2) Poco.");
		System.out.println("(3) Mucho.");
		
		// Pedimos la opción.
		int opAzucar  = sc.nextInt();
		while (!(opAzucar >= 1 && opAzucar <= 3)) {
			
			System.out.println("ERROR: Opción incorrecta.");
			System.out.println("\n\n¿Cuánto azucar desea?");
			System.out.println("(1) Nada.");
			System.out.println("(2) Poco.");
			System.out.println("(3) Mucho.");
			opAzucar  = sc.nextInt();
			
		}
		
		// Y ejecutamos esa opción.
		switch (opAzucar) {
		
			case 1:
				// Sin azucar
				return 0;
				
			case 2:
				// Un terrón de azucar.
				return 1;
				
			default:
				// Dos terrones de azucar.
				return 2;
		
		}
	
	}
	
	public static boolean estaPagado(int consumible) {
		
		// Pedimos el dinero.			
		double dinero = 0.0;
		boolean cancelar = false;
		
		do {
			// Comprobamos opción.
			introducirMoneda();
			int opMoneda = sc.nextInt();
			while (!(opMoneda >= 1 && opMoneda <= 6)) {
				
				System.out.println("ERROR: Opción incorrecta.");
				introducirMoneda();
				opMoneda  = sc.nextInt();
				
			}
			
			switch (opMoneda) {
			
				case 1:
					// Moneda de 5 centimos.
					dinero += 0.05;
					System.out.printf("Ha insertado %.2f €%n",dinero);
					break;
					
				case 2:
					// Moneda de 10 centimos.
					dinero += 0.10;
					System.out.printf("Ha insertado %.2f €%n",dinero);
					break;
					
				case 3:
					// Moneda de 20 centimos.
					dinero += 0.20;
					System.out.printf("Ha insertado %.2f €%n",dinero);
					break;
					
				case 4:	
					// Moneda de 50 centimos.
					dinero += 0.50;
					System.out.printf("Ha insertado %.2f €%n",dinero);
					break;
					
				case 5:	
					// Moneda de 1 euro.
					dinero += 1.00;
					System.out.printf("Ha insertado %.2f €%n",dinero);
					break;
					
				default:
					cancelar = true;
					System.out.printf("Devolviendo sus %.2f €...%n",dinero);
					break;							
			
			}					
			
		} while (dinero < consumibles[consumible].getPrecio() && cancelar == false);
		
		// Comprobamos que no se pase.
		if (dinero > consumibles[consumible].getPrecio()) {
			
			System.out.printf("ERROR. No hay cambio. Devolviendo sus %.2f €%n%n",dinero);
			return false;
			
		}
		
		cafetera.sumarDinero(dinero);
		
		return true;
		
	}
	
}
	

