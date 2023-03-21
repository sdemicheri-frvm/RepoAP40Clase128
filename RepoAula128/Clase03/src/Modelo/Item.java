package Modelo;

public class Item implements Comparable{

	private Producto producto;
	private int cantidad;
	
	public Item(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Item() {
		
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double calcularTotal() throws NoHayStockExcepcion {
		if(!producto.hasStock()) {
			throw new NoHayStockExcepcion(producto);
		}
		double total=0;
		if(cantidad==2) {
			total = producto.getPrecio();
		}else {
			if(cantidad>2) {
				total=cantidad*producto.getPrecio();
				total= total - (total*30/100);
			}
		}
		return total;
	}

	@Override
	public int compareTo(Object o) {
		Item item = (Item) o;
		
		if(this.getProducto().compareTo(item.getProducto())==0) {
			return this.getCantidad()-item.getCantidad();
		}
		return this.getProducto().compareTo(item.getProducto());
	}
	
	
	
	
	
}
