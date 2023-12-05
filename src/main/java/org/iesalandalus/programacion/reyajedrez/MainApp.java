package org.iesalandalus.programacion.reyajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;
import org.iesalandalus.programacion.utilidades.Entrada;


public class MainApp {
	
	private static Rey rey; 
	private static Color color;
	private static Direccion direccion;

	
	public static void ejecutarOpcion(int opcion) {	

    	switch (opcion) {
		
		case (1):{crearReyDefecto();break;}
		case (2):{crearReyColor();break;}
		case (3):{mover();break;}
		case (0):{System.out.println (" Salir ");break;}
    	}
	}	
	
	public static void crearReyDefecto() {
		
		 try {
			 String resumen;
			 rey=new Rey();
	         System.out.println("Rey creado correctamente");
	         resumen=rey.toString();
	         System.out.println(resumen);
	        }
	        catch(NullPointerException e)
	        {
	         System.out.println(e.getMessage());
	        }
		 }
	
	public static void crearReyColor() {
		try {
			String resumen;
			Color colorElegido=Consola.elegirColor();
			rey=new Rey(colorElegido);
	        System.out.println("Rey creado correctamente");
	        System.out.println("-------------------------------");
	        System.out.println("");
	        System.out.println("");
	         resumen=rey.toString();
	         System.out.println(resumen);
	        }
        catch( NullPointerException e)
        {
         System.out.println(e.getMessage());
        }
	}
	
	public static void mover () {
		
	

			Consola.mostrarMenuDirecciones();;
			Direccion direccionElegida=Consola.elegirDireccion();

			
			try {
			rey.mover(direccionElegida);
	        System.out.println("Movimiento realizado correctamente");
	        System.out.println("Posicion= "+rey.getPosicion());
			} catch (OperationNotSupportedException e) {
				System.out.println(e.getMessage());
			}
		}
	
	public Rey mostrarRey() {
		
		if(rey==null) {
			System.out.println("No existe el rey");
			}
		 return rey;
		}


    public static void main(String[] args) {
    	
    	int opcion;
    	do { 
    		Consola.mostrarMenu();
    		opcion=Consola.elegirOpcionMenu();
    		ejecutarOpcion(opcion);
    	}while (opcion!=0);
    	}
	}
