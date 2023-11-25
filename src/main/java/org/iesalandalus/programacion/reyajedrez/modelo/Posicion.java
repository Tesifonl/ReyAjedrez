package org.iesalandalus.programacion.reyajedrez.modelo;

import java.util.Objects;

public class Posicion {

	private int fila;
	private char columna;
	
	
	public int getFila() {
		return fila;
	}
	
	public void setFila(int fila) {	
		if(fila<1||fila>8) {
			throw new IllegalArgumentException("El valor permitido solo debe estar comprendido entre 1 y 8");
		}
		this.fila = fila;
	}
	
	public char getColumna() {
		return columna;
	}
	
	public void setColumna(char columna) {
		if((int)columna<97 ||(int)columna>104 ) {
				throw new IllegalArgumentException("El valor permitido solo debe estar comprendido entre a y h");
		}
		this.columna = columna;	
	}
	
	public Posicion(int fila,char columna) {
		setFila(fila);
		setColumna(columna);
	}

	public Posicion (Posicion cop) {
		setFila(cop.getFila());
		setColumna(cop.getColumna());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}
	
	@Override
	public String toString() {
		return "Posicion [fila=" + fila + ", columna=" + columna + "]";
	}
		
}
