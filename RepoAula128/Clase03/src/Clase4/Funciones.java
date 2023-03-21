package Clase4;

public class Funciones {

	public static void main(String[] args) {
		
		int numeros[] = new int[] {1,37,16};
		
		System.out.println("La sumatoria es: "+sumatoria(numeros));
		System.out.println("El promedio es: "+sumatoria(numeros)/numeros.length);
		
		int numeros2[] = new int[] {1,3,1};
		
		System.out.println(sumatoria(numeros2));
		
		int numeros3[] = new int[] {10,3,1};
		
		System.out.println(sumatoria(numeros3));
		
		String cadena="hola mUndo";
		cadena.concat("Chau");

	}
	
	private static int sumatoria(int[] numerosAsumar) {
		int resultado=0;
		for (int i=0;i<numerosAsumar.length;i++) {
			resultado=resultado+numerosAsumar[i];
			//resultado+=numerosAsumar[i];
		}
		return resultado;
	}

}
