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

	
	public static void ejecutarOpcion(int opcion) throws OperationNotSupportedException {	

    	switch (opcion) {
		
		case (1):{crearReyDefecto();break;}
		case (2):{crearReyColor();break;}
		case (3):{mover();break;}
		case (0):{System.out.println (" Salir ");break;}
    	}
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
	
	public static void mover () throws OperationNotSupportedException {
		
	
			int pasos;

			Consola.mostrarMenu();
			Direccion direccionElegida=Consola.elegirDireccion();/*INTERESANTE REVISAR COMO ASIGNAR UN ENUN
			A UNA VARIABLE OBJETO PARA DESPUES UTILIZARLA*/
			System.out.println("Introduce el numero de pasos a mover");
			pasos=Entrada.entero();
			
			try {
			rey.mover(direccionElegida, pasos);
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("Movimiento no válido: " + e.getMessage());
			}
		}
	
	public Rey mostrarRey() {
		
		if(rey==null) {
			System.out.println("No existe el rey");
			}
		 return rey;
		}


    public static void main(String[] args) throws OperationNotSupportedException {
    	
    	int opcion;
    	do { 
    		Consola.mostrarMenu();
    		opcion=Consola.elegirOpcionMenu();
    		ejecutarOpcion(opcion);
    	}while (opcion!=0);
    	}
	}
