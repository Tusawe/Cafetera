package cafetera;

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

	/**
	 * @param vasos the vasos to set
	 */
	public void setVasos(int vasos) {
		this.vasos = vasos;
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

	/**
	 * @param palitos the palitos to set
	 */
	public void setPalitos(int palitos) {
		this.palitos = palitos;
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

	/**
	 * @param azucar the azucar to set
	 */
	public void setAzucar(int azucar) {
		this.azucar = azucar;
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

	/**
	 * @param agua the agua to set
	 */
	public void setAgua(double agua) {
		this.agua = agua;
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
