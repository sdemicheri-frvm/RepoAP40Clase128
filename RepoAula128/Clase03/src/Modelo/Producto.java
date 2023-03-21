package Modelo;

public class Producto implements Comparable{

	private String nombre;
	private double precio;
	private int stock;
	
	public Producto() {
		this.setStock(0);
	}

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public boolean hasStock() {
		return true;
	//	return this.getStock()>0;
	}

	@Override
	public int compareTo(Object o) {
		Producto p = (Producto) o;
		return this.getNombre().compareTo(p.getNombre());
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
}
