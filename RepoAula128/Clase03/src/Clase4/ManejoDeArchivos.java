package Clase4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ManejoDeArchivos {

	public static void main(String[] args) {
		String ruta="C:\\ArchivosEjemplo\\Grupos_128.txt";
	//	String local=".//Archivos//prueba.txt";
		
		try {
//			for (String linea : Files.readAllLines(Paths.get(local),StandardCharsets.ISO_8859_1)) {
			for (String linea : Files.readAllLines(Paths.get("src\\Archivos\\","prueba.txt"),StandardCharsets.ISO_8859_1)) {
				//System.out.println(linea.split(";")[2]);
				System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en la lectura del archivo");
		}
 
	/*	try {
			Files.writeString(Paths.get(ruta),"22;demicheri solesas; etc",StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en la escritura del archivo");
		}*/
	}

}
