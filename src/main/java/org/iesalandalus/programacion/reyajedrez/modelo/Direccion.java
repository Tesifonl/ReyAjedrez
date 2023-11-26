package org.iesalandalus.programacion.reyajedrez.modelo;

public enum Direccion {
	NORTE ("Norte"),NORESTE("Noreste"), NOROESTE("Noroeste"),ESTE("Este"),SURESTE("Sureste"),SUR("Sur"),
	SUROESTE("Suroeste"),OESTE("Oeste"),ENROQUE_CORTO("Enroque corto"),ENROQUE_LARGO("Enroque largo");
	// FALTA METERLE LA CADENA.
	
    private String cadenaDireccion;
    
    private Direccion(String cadenaDireccion)
    {
        this.cadenaDireccion=cadenaDireccion;
    }

    @Override
    public String toString() {
        return cadenaDireccion;
    }
}
