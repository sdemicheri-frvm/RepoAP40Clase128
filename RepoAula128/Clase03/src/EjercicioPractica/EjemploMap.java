package EjercicioPractica;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Modelo.Producto;

public class EjemploMap {
	
	public static void main(String[] args) {
		
		Map <Integer, String> map = new HashMap<Integer, String>();
		
		Map <String, Producto> map2 = new HashMap<String, Producto>();
		
		map.put(1, "lunes");
		map.put(2, "martes");
		map.put(3, "miercoles");
		map.put(4, "jueves");
		map.put(5, "Viernes");
		
		map2.put("C12", new Producto("Cepillo",115));
		
		System.out.println(map2.get("C12"));
		
		System.out.println(map.get(3));
		System.out.println(map.size());
		
		Iterator ite = map.keySet().iterator();
		while(ite.hasNext()) {
			Integer key = (Integer) ite.next();
			System.out.println(map.get(key));
		}
		
	}
	

}
