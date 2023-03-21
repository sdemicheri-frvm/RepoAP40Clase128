package Modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemTest {
	Item objItemTest;
	
	@BeforeEach
	public void setUp() {
		objItemTest = new Item();
	}

	@Test
	void testCalcularTotal() {
		objItemTest.setCantidad(2);
		objItemTest.setProducto(new Producto("cepillo", 100));
		double total;
		try {
			total = objItemTest.calcularTotal();
			double totalEsperado = 100.0;
			boolean result = (total==totalEsperado);
			assertTrue(result);
		} catch (NoHayStockExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	void testFallaCalcularTotal() {
		objItemTest.setCantidad(2);
		objItemTest.setProducto(new Producto("cepillo", 100));
		double total;
		try {
			total = objItemTest.calcularTotal();
			double totalEsperado = 200.0;
			boolean result = (total==totalEsperado);
			assertFalse(result);
		} catch (NoHayStockExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
