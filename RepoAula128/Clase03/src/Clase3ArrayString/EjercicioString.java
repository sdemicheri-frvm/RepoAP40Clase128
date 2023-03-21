package Clase3ArrayString;

public class EjercicioString {
	public static void main(String[] args) throws Exception {
		String texto1="Hola Mundo";
		System.out.println(texto1.toUpperCase());
		System.out.println(texto1);
		String textNuevo=texto1.replace("Hola", "Chau");
		System.out.println(textNuevo);
		System.out.println(texto1);
		
		System.out.println(texto1.toUpperCase().replace("HOLA", "Chau"));
		
		String TextoEspecial= "Hola Gente\nComo estan?";
		System.out.println(TextoEspecial);
		System.out.println("Hola \nComo estan?");
	}
}
