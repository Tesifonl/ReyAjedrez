package org.iesalandalus.programacion.reyajedrez.modelo;

public enum Color {
	BLANCO ("Blanco"),NEGRO ("Negro");

	
    private String cadenaColor;
    
    private Color(String cadenaColor)
    {
        this.cadenaColor=cadenaColor;
    }

    @Override
    public String toString() {
        return cadenaColor;
    }
}
