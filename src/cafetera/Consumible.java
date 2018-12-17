package cafetera;

public class Consumible{
	
	private int tiempo;
	private double precio;
	private double agua;
	private String tipo;

	/**
	 * @param tiempo
	 * @param precio
	 * @param agua
	 * @param tipo
	 */
	public Consumible(int tiempo, double precio, double agua, String tipo) {
		this.tiempo = tiempo;
		this.precio = precio;
		this.agua = agua;
		this.tipo = tipo;
	}

	/**
	 * @return the tipo
	 */
	public String getTipos() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setCapsulas(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the tiempo
	 */
	public int getTiempo() {
		return tiempo;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @return the agua
	 */
	public double getAgua() {
		return agua;
	}

}
