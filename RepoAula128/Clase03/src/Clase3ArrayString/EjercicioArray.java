package Clase3ArrayString;

public class EjercicioArray {
	public static void main(String[] args) throws Exception {
        int numero[] = new int[5]; //declarando e inicializando
        int suma = 0;
        int cont = 0;
        
        numero[0]=25;
        numero[4]=10;
        numero[2]=5;
        
       // System.out.println(numero[4]);
        
        for (int i=0;i<numero.length;i++) { //itero el array
        	if(i%2==0) { // consultando si la posicion es par
        		//System.out.println(numero[i]);
        		suma=suma+numero[i]; //acumulador
        		cont = cont + 1; // contador
        	}
        }
        System.out.println(suma);
        System.out.println(cont);
        
    }
}
