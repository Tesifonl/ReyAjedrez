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
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
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
	
	
	public void mover(Direccion direccion) throws OperationNotSupportedException{
		
		
		if (direccion==null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");	
		}else {
		
		if (direccion.equals(Direccion.NORTE)) {
			try {
				int f;
				f=posicion.getFila();
				posicion.setFila(f+1);
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
				posicion.setFila(f+1);	
				c1=posicion.getColumna();
				c2=c1+1;
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
				posicion.setFila(f+1);
				c1=posicion.getColumna();
				c2=c1-1;
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
				posicion.setFila(f-1);
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
				posicion.setFila(f-1);	
				c1=posicion.getColumna();
				c2=c1+1;
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
				posicion.setFila(f-1);		
				c1=posicion.getColumna();
				c2=c1-1;
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
				c2=c1+1;
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
				c2=c1+1;
				posicion.setColumna((char)c2);
				totalMovimientos++;
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("Movimiento no válido: " + e.getMessage());
				}
			}
		
			
		if (direccion.equals(Direccion.ENROQUE_CORTO)) {
			
			if (posicion.getFila()==1 && posicion.getColumna()=='e' ||
					posicion.getFila()==8 && posicion.getColumna()=='e' ) {
						if (totalMovimientos==0) {
							posicion.setColumna('h');}else 
									{throw new OperationNotSupportedException("ERROR: El rey ya se ha movido antes.");}
				}throw new OperationNotSupportedException("ERROR: El rey no está en su posición inicial.");
		}
		
			
			
		if (direccion.equals(Direccion.ENROQUE_LARGO)) {
			if (posicion.getFila()==1 && posicion.getColumna()=='e' ||
					posicion.getFila()==8 && posicion.getColumna()=='e' ) {
						if (totalMovimientos==0) {
							posicion.setColumna('a');}else 
									{throw new OperationNotSupportedException("ERROR: El rey ya se ha movido antes.");}
				}throw new OperationNotSupportedException("ERROR: El rey no está en su posición inicial.");
			}
		}
	}

	
	
	private void comprobarEnroque() throws OperationNotSupportedException {
		boolean comproEnroque=false;
		if (posicion.getFila()==1 && posicion.getColumna()=='e' ||
			posicion.getFila()==8 && posicion.getColumna()=='e' ) {
				if (totalMovimientos==0) {
						comproEnroque=true;}else 
							{throw new OperationNotSupportedException("ERROR: El rey ya se ha movido antes.");}
		}throw new OperationNotSupportedException("ERROR: El rey no está en su posición inicial.");
	}

	@Override
	public String toString() {
		return "color="+ color+", posicion=("+ posicion + ")";
		
	}

	
}



