package EjercicioPractica;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import Modelo.Compra;
import Modelo.Item;
import Modelo.NoHayStockExcepcion;
import Modelo.Producto;

public class CargaCompra {

	public static void main(String[] args) {
		try {
			Compra compra = new Compra();
			int i=0;
			for(String linea : Files.readAllLines(Paths.get("src\\Archivos\\itemsCompra.txt"))){
				//System.out.println(linea);
				String nombre =linea.split(";")[0];
				int cantidad=Integer.parseInt(linea.split(";")[1]);
				double precio = Double.parseDouble(linea.split(";")[2]);
				
				Producto producto = new Producto(nombre, precio);
				
				Item item = new Item(producto, cantidad);
				
				compra.getItems()[i]=item;
				i++;
			}
			try {
				System.out.println(compra.calcularTotalCompra());
				System.out.println("Aca paso si esta todo bien!!!!");
			} catch (NoHayStockExcepcion e) {
				System.out.println("No hay stock por eso no puedo calcular el precio");
			} catch (NullPointerException e) {
				System.out.println("Ojo hay valores nulos");
			} catch (Exception e) {
				System.out.println("Error");
			}finally {
				System.out.println("Gracias!!!!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.toString();
		}

	}

}
