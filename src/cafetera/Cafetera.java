package cafetera;

/**
 * @author José Luis Gómez López
 * @version 1.0
 */
public class Cafetera {
	
	private double dinero;
	private int vasos;
	private int palitos;
	private int azucar;
	private double agua;
	private Consumible consumibles[];
	
	public Cafetera() {
		this.dinero = 0.0;
		this.vasos = 10;
		this.palitos = 10;
		this.azucar = 10;
		this.agua = 5.0;
		this.consumibles = new Consumible[5];
	}
	
	/**
	 * @return the dinero
	 */
	public double getDinero() {
		return dinero;
	}

	/**
	 * @param dinero the dinero to set
	 */
	public void sumarDinero(double dinero) {
		this.dinero += dinero;
	}
	
	public void recaudarDinero() {
		this.dinero = 0.0;
	}

	/**
	 * @return the vasos
	 */
	public int getVasos() {
		return vasos;
	}

	public void recargarVasos() {
		this.vasos = 10;
	}
	
	public void gastarVasos() {
		this.vasos -= 1;
	}

	/**
	 * @return the palitos
	 */
	public int getPalitos() {
		return palitos;
	}

	public void recargarPalitos() {
		this.palitos = 10;
	}
	
	public void gastarPalitos() {
		this.palitos -= 1;
	}

	/**
	 * @return the azucar
	 */
	public int getAzucar() {
		return azucar;
	}

	public void recargarAzucar() {
		this.azucar = 10;
	}
	
	/**
	 * @param terrones de azucar
	 */
	public void gastarAzucar(int terrones) {
		this.azucar -= terrones ;
	}

	/**
	 * @return the agua
	 */
	public double getAgua() {
		return agua;
	}

	public void recargarAgua() {
		this.agua = 5.00;
	}
	
	/**
	 * @param agua gastada.
	 */
	public void gastarAgua(double agua) {
		this.agua -= agua;
	}

	/**
	 * @return the consumibles
	 */
	public Consumible[] getConsumibles() {
		return consumibles;
	}
	
	public void insertarConsumible(int i, int tiempo, double precio, double agua, String tipo) {
		
		this.consumibles[i] = new Consumible(tiempo, precio, agua, tipo);
		
	}
	
}
