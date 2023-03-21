package Modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Compra {
	
	private LocalDateTime fecha;
	
	private Item[] items;
	
	private List<Item> detalles;
	
	private Set<Item> detallesH;
	
	private Set<Item> detallesT;

	public Compra() {
		this.fecha = LocalDateTime.now(); 
		this.items = new Item[10];// inicializo el vector
		
		this.detalles = new ArrayList<Item>();
		
		this.detallesH = new HashSet<Item>();
		
		this.detallesT = new TreeSet<Item>();
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}
	
	public void agregarDatos(Item it) {
		this.detalles.add(it);
	}
	
	public void removerDatos(Item it) {
		this.detalles.remove(it);
	}
	
	public List<Item> getDetalles(){
		return this.detalles;
	}
	
	public void agregarDatosT(Item it) {
		this.detallesT.add(it);
	}
	
	public void removerDatosT(Item it) {
		this.detallesT.remove(it);
	}
	
	public Set<Item> getDetallesT(){
		return this.detallesT;
	}
	
	public double calcularTotalCompra() throws NoHayStockExcepcion {
		double total=0;
		for(int i=0;i<10;i++) {
			Item it = items[i];
			if(it!=null) {
				total+=it.calcularTotal();
			}
		}
		return total;
	}

	public double calcularTotalCompraLista() throws NoHayStockExcepcion {
		double total=0;
		Iterator ite = this.getDetalles().iterator();
		while(ite.hasNext()) {
			Item it = (Item) ite.next();
			total+=it.calcularTotal();			
		}
		
		return total;
	}
	
}
