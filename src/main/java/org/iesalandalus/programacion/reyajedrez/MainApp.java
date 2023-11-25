package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;
import org.iesalandalus.programacion.utilidades.Entrada;

import src.poo.IllegalArgumentException;
import src.poo.NullPointerException;

public class MainApp {
	
	private static Rey rey; 
	private static Color color;
	private static Direccion direccion;

	
	public static void ejecutarOpcion(int opcion) {	
		Consola.mostrarMenu();
		Consola.elegirOpcionMenu();	
	}
	
	public static void crearReyDefecto() {
		
		 try {
			 rey=new Rey();
	         System.out.println("Rey creado correctamente");
	         System.out.println("-------------------------------");
	         System.out.println("");
	         System.out.println("");
	        }
	        catch(NullPointerException e)
	        {
	         System.out.println(e.getMessage());
	        }
		 }
	
	public static void crearReyColor() {
		try {
			Color colorElegido=Consola.elegirColor();/*INTERESANTE REVISAR COMO ASIGNAR UN ENUN
			A UNA VARIABLE OBJETO PARA DESPUES UTILIZARLA*/
			rey=new Rey(colorElegido);
	        System.out.println("Rey creado correctamente");
	        System.out.println("-------------------------------");
	        System.out.println("");
	        System.out.println("");
	        }
        catch( NullPointerException e)
        {
         System.out.println(e.getMessage());
        }
	}
	
	public static void mover () {
		
	
			int pasos;

			Consola.mostrarMenu();
			Direccion direccionElegida=Consola.elegirDireccion();/*INTERESANTE REVISAR COMO ASIGNAR UN ENUN
			A UNA VARIABLE OBJETO PARA DESPUES UTILIZARLA*/
			System.out.println("Introduce el numero de pasos a mover");
			pasos=Entrada.entero();
			
		
			
	}
		
	

    public static void main(String[] args) {
		
    	switch (opcion) {
		
		case (1):{rey=new Rey();break;}
		case (2):{rey=new Rey(color);break;}
		case (3):{rey.mover(direccion);break;}
		case (0): {System.out.println (" Salir ");break;}
    
    	
    	}
 
    }
