package org.iesalandalus.programacion.reyajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Rey {
	
	private Color color;
	private Posicion posicion;
	private Direccion direccion;
	private int totalMovimientos;
	private int numpasos;
	
	
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
	
	
	public void mover(Direccion direccion,int numpasos) throws OperationNotSupportedException{

		
		if (direccion==null) {
			throw new NullPointerException("ERROR: No se puede establecer una direccion vacia");	
		}else {
		
		
			if (direccion.equals(Direccion.NORTE)) {
				try {
					int f;
					
					f=posicion.getFila();
					posicion.setFila(f+numpasos);
					totalMovimientos++;
				
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("Movimiento no válido: " + e.getMessage());
				}
			}
			
		
		
			if (direccion.equals(Direccion.NORESTE)) {
			 try {	
					int f;
					char c1;
					int c2=0;
					
					f=posicion.getFila();
					posicion.setFila(f+numpasos);
					
					c1=posicion.getColumna();
					c2=c1+numpasos;
					posicion.setColumna((char)c2);
					
					totalMovimientos++;	
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("Movimiento no válido: " + e.getMessage());
				}
			}
		
			
			if (direccion.equals(Direccion.NOROESTE)) {
			 try {
					int f;
					char c1;
					int c2=0;
					
					f=posicion.getFila();
					posicion.setFila(f+numpasos);
					
					c1=posicion.getColumna();
					c2=c1-numpasos;
					posicion.setColumna((char)c2);
					
					totalMovimientos++;	
				
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("Movimiento no válido: " + e.getMessage());
				}	 
			}
		
			
			
			if (direccion.equals(Direccion.SUR)) {
			 try {
					int f;
					
					f=posicion.getFila();
					posicion.setFila(f-numpasos);
					
					totalMovimientos++;	
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("Movimiento no válido: " + e.getMessage());
				}
			}
		
			
			if (direccion.equals(Direccion.SURESTE)) {
			 try {
					int f;
					char c1;
					int c2=0;
					
					f=posicion.getFila();
					posicion.setFila(f-numpasos);
					
					c1=posicion.getColumna();
					c2=c1+numpasos;
					posicion.setColumna((char)c2);
					
					totalMovimientos++;	
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("Movimiento no válido: " + e.getMessage());
				}
			}
			
		
			if (direccion.equals(Direccion.SUROESTE)) {
			 try {
					int f;
					char c1;
					int c2=0;
					
					f=posicion.getFila();
					posicion.setFila(f-numpasos);
					
					c1=posicion.getColumna();
					c2=c1-numpasos;
					posicion.setColumna((char)c2);
					
					totalMovimientos++;	
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("Movimiento no válido: " + e.getMessage());
				}
			}
		
			
			if (direccion.equals(Direccion.ESTE)) {
			 try {
				char c1;
				int c2=0;
	
				c1=posicion.getColumna();
				c2=c1+numpasos;
				posicion.setColumna((char)c2);
				
				totalMovimientos++;	
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("Movimiento no válido: " + e.getMessage());
				}
			}
		
			
			if (direccion.equals(Direccion.OESTE)) {
			 try {
				char c1;
				int c2=0;
	
				c1=posicion.getColumna();
				c2=c1+numpasos;
				posicion.setColumna((char)c2);
				
				totalMovimientos++;	
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("Movimiento no válido: " + e.getMessage());
				}
			}
		
			
			if (direccion.equals(Direccion.ENROQUE_CORTO)) {
			 try {
					posicion.setColumna('h');
					totalMovimientos++;
			 } catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("Movimiento no válido: " + e.getMessage());
			 	}
			}
			
			
			if (direccion.equals(Direccion.ENROQUE_LARGO)) {
			 try {
				posicion.setColumna('a');
				totalMovimientos++;
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("Movimiento no válido: " + e.getMessage());
				}
			}
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



