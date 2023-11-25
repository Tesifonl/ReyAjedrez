package org.iesalandalus.programacion.reyajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Rey {
	
	private Color color;
	private Posicion posicion;
	private Direccion direccion;
	private int totalMovimientos;
	
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		if(color==null) {
			throw new NullPointerException("ERROR: No se puede establecer un color vacio");
		}
		this.color = color;
	}
	
	public Posicion getPosicion() {
		return posicion;
	}
	
	public void setPosicion(Posicion posicion) {
		if(posicion==null) {
			throw new NullPointerException("ERROR: No se puede establecer una posicion vacia");
		}
		this.posicion = posicion;
	}
	
	public Rey(){
		setColor(Color.BLANCO);
		setPosicion(new Posicion(1,'e'));
	}

	public Rey(Color color){
		setColor(color);
		
		if (color.equals(Color.BLANCO)) {
		setPosicion(new Posicion(1,'e'));
		}
		setPosicion(new Posicion(8,'e'));
	}
	
	public int getTotalMovimientos() {
		return(totalMovimientos);
	}
	
	public void mover(Direccion direccion){

		
		if (direccion==null) {
			throw new NullPointerException("ERROR: No se puede establecer una direccion vacia");	
		}else
		
		Try {
		
			if (direccion.equals(Direccion.NORTE)) {
				int f;
				
				f=posicion.getFila();
				posicion.setFila(f+1);
				totalMovimientos++;	
			}
		
		
			if (direccion.equals(Direccion.NORESTE)) {
				
				int f;
				char c1;
				int c2=0;
				
				f=posicion.getFila();
				posicion.setFila(f+1);
				
				c1=posicion.getColumna();
				c2=c1+1;
				posicion.setColumna((char)c2);
				
				totalMovimientos++;	
			}
		
			if (direccion.equals(Direccion.NOROESTE)) {
				int f;
				char c1;
				int c2=0;
				
				f=posicion.getFila();
				posicion.setFila(f+1);
				
				c1=posicion.getColumna();
				c2=c1-1;
				posicion.setColumna((char)c2);
				
				totalMovimientos++;	
			}
		
			if (direccion.equals(Direccion.SUR)) {
				int f;
				
				f=posicion.getFila();
				posicion.setFila(f-1);
				
				totalMovimientos++;	
			}
		
			if (direccion.equals(Direccion.SURESTE)) {
				int f;
				char c1;
				int c2=0;
				
				f=posicion.getFila();
				posicion.setFila(f-1);
				
				c1=posicion.getColumna();
				c2=c1+1;
				posicion.setColumna((char)c2);
				
				totalMovimientos++;	
			}
		
			if (direccion.equals(Direccion.SUROESTE)) {
				int f;
				char c1;
				int c2=0;
				
				f=posicion.getFila();
				posicion.setFila(f-1);
				
				c1=posicion.getColumna();
				c2=c1-1;
				posicion.setColumna((char)c2);
				
				totalMovimientos++;	
			}
		
			if (direccion.equals(Direccion.ESTE)) {
	
				char c1;
				int c2=0;
	
				c1=posicion.getColumna();
				c2=c1+1;
				posicion.setColumna((char)c2);
				
				totalMovimientos++;	
			}
		
			if (direccion.equals(Direccion.OESTE)) {
	
				char c1;
				int c2=0;
	
				c1=posicion.getColumna();
				c2=c1+1;
				posicion.setColumna((char)c2);
				
				totalMovimientos++;	
			}
		
			if (direccion.equals(Direccion.ENROQUE_CORTO)) {
				posicion.setColumna('h');
				totalMovimientos++;
			}
			if (direccion.equals(Direccion.ENROQUE_LARGO)) {
				posicion.setColumna('a');
				totalMovimientos++;
			}	
	}
	
	private void comprobarEnroque() {
		boolean comproEnroque=false;
		if (totalMovimientos==0) {comproEnroque=true;}
	}

	@Override
	public String toString() {
		return "Rey [color=" + color + ", posicion=" + posicion + "]";
	}

	
}



