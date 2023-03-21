package Modelo;

public class NoHayStockExcepcion extends Exception{
	
	private Producto prodcuto;

	public NoHayStockExcepcion(Producto prodcuto) {
		this.prodcuto = prodcuto;
	}

	public Producto getProdcuto() {
		return prodcuto;
	}

	public void setProdcuto(Producto prodcuto) {
		this.prodcuto = prodcuto;
	}
	
	

}
