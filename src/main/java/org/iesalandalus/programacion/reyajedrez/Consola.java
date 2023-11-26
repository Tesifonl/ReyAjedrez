package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;


public class Consola {
	
	private Consola () {}
	
    public  static void mostrarMenu()
    {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Programa para mover el Rey");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("1.- Crear rey por defecto.");
        System.out.println("2.- Crear rey eligiendo el color.");
        System.out.println("3.- Mover.");      	 
        System.out.println("");
        System.out.println("0.- Salir.");
        System.out.println("");
    }
    
    public static int elegirOpcionMenu()
    {
        int opcion;
        
        do
        {
            System.out.println("Elige una opción (0-3): ");
            opcion=Entrada.entero();
        }while(opcion<0 || opcion>3);
        
        return opcion;
    }
    
    
    public static Color elegirColor()
    {
        int colorido;
        Color elegirColor=Color.BLANCO;
        
        do
        {
            System.out.println("Introduzca el color del rey  (1.BLANCO, 2.NEGRO): ");
            colorido=Entrada.entero();       
        }while (colorido<1 || colorido>2);
        
        switch (colorido)
        {
            case 1: 
            	elegirColor=Color.BLANCO;
                break;
            case 2: 
            	elegirColor=Color.NEGRO;
                break;
        }
        
        return elegirColor;
    }
    
    public  static void mostrarMenuDirecciones()
    {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Elige las direcciones para mover el rey");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("1.- Enroque corto.");
        System.out.println("2.- Enroque largo");
        System.out.println("3.- Este."); 
        System.out.println("4.- Noreste.");
        System.out.println("5.- Noroeste.");
        System.out.println("6.- Norte.");
        System.out.println("7.- Oeste.");
        System.out.println("8.- Sur.");        
        System.out.println("9.- Sureste.");
        System.out.println("10.- Suroeste.");
        System.out.println("");
        System.out.println("0.- Salir.");
        System.out.println("");
    }
    
    public static Direccion elegirDireccion()
    {
        int direccionado;
        Direccion elegirDireccion=Direccion.ENROQUE_CORTO;
        
        do
        {
            System.out.println("Introduzca la direccion del rey ");
            direccionado=Entrada.entero();       
        }while (direccionado<1 || direccionado>10);
        
        switch (direccionado)
        {
            case 1: 
            	elegirDireccion=Direccion.ENROQUE_CORTO;
                break;
            case 2: 
            	elegirDireccion=Direccion.ENROQUE_LARGO;
                break;
            case 3: 
            	elegirDireccion=Direccion.ESTE;
                break;
            case 4: 
            	elegirDireccion=Direccion.NORESTE;
                break;
            case 5: 
            	elegirDireccion=Direccion.NOROESTE;
                break;
            case 6: 
            	elegirDireccion=Direccion.NORTE;
                break;
            case 7: 
            	elegirDireccion=Direccion.OESTE;
                break;
            case 8: 
            	elegirDireccion=Direccion.SUR;
                break;
            case 9: 
            	elegirDireccion=Direccion.SURESTE;
                break;
            case 10: 
            	elegirDireccion=Direccion.SUROESTE;
                break;
                
        }
        
        return elegirDireccion;
    }
    
    public  static void despedirse()
    {
 
        System.out.println("");
    }
}
