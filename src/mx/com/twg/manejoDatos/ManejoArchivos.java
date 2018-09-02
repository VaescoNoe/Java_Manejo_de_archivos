package mx.com.twg.manejoDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejoArchivos {

	public static void creacionArchivo(){
		File archivo = new File("C:\\workspace\\ArchivosGenerados\\archivo.txt");
		try{
			PrintWriter salida = new PrintWriter(new FileWriter(archivo));
			salida.close();
		}catch(IOException ex){
			ex.printStackTrace();
		}
		System.out.println("El archivo fue creado");
	}
	
	public static void lecturaArchivo(){	
		try{
			File archivo = new File("C:\\workspace\\ArchivosGenerados\\archivoLectura.txt");
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String lectura = null;
			lectura = entrada.readLine();
			while(lectura!=null){
				System.out.println("Lectura: "+lectura);
				lectura = entrada.readLine();
			}
			entrada.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException  ex){
			ex.printStackTrace();
		}
	}
	
	public static void anexarInformacion(){
		File archivo = new File("C:\\workspace\\ArchivosGenerados\\archivo.txt");
		try{
			PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
			String contenido = "De aquí se anexa información al archivo";
			salida.println(contenido);
			salida.println();
			salida.println("Fin de enexar");
			salida.close();
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Se anexo la información correctamente");
	}
	
	public static void escribirInformacion(){
		File archivo = new File("C:\\workspace\\ArchivosGenerados\\archivo.txt");
		try{
			PrintWriter salida = new PrintWriter(new FileWriter(archivo));
			String contenido = "De aquí se escribe información al archivo";
			salida.println(contenido);
			salida.println();
			salida.println("Fin de escribir");
			salida.close();
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Se escribio la información correctamente");
	}
}
