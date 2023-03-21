package Clase5;

import java.util.Scanner;

import Eshop.Persona;

public class EjercicioPractica {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la persona:");
		String nombreAsigando = scn.nextLine();
		
		Persona persona1 = new Persona(nombreAsigando, "Cualquiera");
		
		System.out.println(persona1);
		////persona1.setApellido("Lopez");
		
		//System.out.println("Los datos de la persona creada son:");
		//System.out.println(persona1.getNombreCompleto());
		/////System.out.println("Nombre: "+persona1.getNombre());
		//System.out.println("Apellido: "+persona1.getApellido());
	}

}
