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
		
		if(color==null) {
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}else 
		
			setColor(color);
			
			if (color.equals(Color.BLANCO)) {
			setPosicion(new Posicion(1,'e'));
			}else{setPosicion(new Posicion(8,'e'));}
		}
	
	
	
	public void mover(Direccion direccion) throws OperationNotSupportedException{
		
		
		if (direccion==null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");	
		}else {
		
		if (direccion.equals(Direccion.NORTE)) {
				int f;
				f=posicion.getFila();
				if(f<8) {
				posicion.setFila(f+1);
				totalMovimientos=totalMovimientos+1;
					}else{
						posicion.setFila(f);
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
						}
			}
			
		if (direccion.equals(Direccion.NORESTE)) {
				int f;
				char c1;
				int c2=0;
					
				f=posicion.getFila();
				c1=posicion.getColumna();
				if (f<8 && c1<104) {
				posicion.setFila(f+1);		
				c2=c1+1;
				posicion.setColumna((char)c2);
				totalMovimientos=totalMovimientos+1;
			 		} else{
			 			posicion.setFila(f);		
			 			posicion.setColumna((char)c1);
			 			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			 		}
			}
		
		if (direccion.equals(Direccion.NOROESTE)) {
		 	int f;
			char c1;
			int c2=0;
				
			f=posicion.getFila();
			c1=posicion.getColumna();
			if (f<8 && c1>97) {
			posicion.setFila(f+1);		
			c2=c1-1;
			posicion.setColumna((char)c2);
			totalMovimientos=totalMovimientos+1;
		 		} else{
		 			posicion.setFila(f);		
		 			posicion.setColumna((char)c1);
		 			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		 		}
			}
		
		
		if (direccion.equals(Direccion.SUR)) {
			int f;
			f=posicion.getFila();
			if(f>1) {
			posicion.setFila(f-1);
			totalMovimientos=totalMovimientos+1;
				}else{
					posicion.setFila(f);
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
					}
			}
		
			
		if (direccion.equals(Direccion.SURESTE)) {
			int f;
			char c1;
			int c2=0;
				
			f=posicion.getFila();
			c1=posicion.getColumna();
			if (f>1 && c1<104) {
			posicion.setFila(f-1);		
			c2=c1+1;
			posicion.setColumna((char)c2);
			totalMovimientos=totalMovimientos+1;
		 		} else{
		 			posicion.setFila(f);		
		 			posicion.setColumna((char)c1);
		 			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		 		}
			}
			
		
		if (direccion.equals(Direccion.SUROESTE)) {
			int f;
			char c1;
			int c2=0;
				
			f=posicion.getFila();
			c1=posicion.getColumna();
			if (f>1 && c1>97) {
			posicion.setFila(f-1);		
			c2=c1-1;
			posicion.setColumna((char)c2);
			totalMovimientos=totalMovimientos+1;
		 		} else{
		 			posicion.setFila(f);		
		 			posicion.setColumna((char)c1);
		 			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		 		}
			}
		
			
		if (direccion.equals(Direccion.ESTE)) {
				char c1;
				int c2=0;
	
				c1=posicion.getColumna();
				if(c1<104) {
				c2=c1+1;
				posicion.setColumna((char)c2);
				totalMovimientos=totalMovimientos+1;
			 	} else{	
		 			posicion.setColumna((char)c1);
		 			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		 		}
			}
		
			
		if (direccion.equals(Direccion.OESTE)) {
			char c1;
			int c2=0;

			c1=posicion.getColumna();
			if(c1>97) {
			c2=c1-1;
			posicion.setColumna((char)c2);
			totalMovimientos=totalMovimientos+1;
		 	} else{	
	 			posicion.setColumna((char)c1);
	 			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
	 			}
			}
		
		if (direccion.equals(Direccion.ENROQUE_CORTO)) {
			int f;
			char c1;
			int c2;
			f=posicion.getFila();
			c1=posicion.getColumna();
			c2=c1+0;
			
			if (totalMovimientos!=0){
				throw new OperationNotSupportedException("ERROR: El rey ya se ha movido antes.");
				}else if((f==1 && c2==101) ||(f==8 && c2==101)){
					posicion.setColumna((char)103);
					totalMovimientos=totalMovimientos+1;}else {
						throw new OperationNotSupportedException("ERROR: El rey no está en su posición inicial.");
					}
			}
		
		if (direccion.equals(Direccion.ENROQUE_LARGO)) {
			int f;
			char c1;
			int c2;
			f=posicion.getFila();
			c1=posicion.getColumna();
			c2=c1+0;
			
			if (totalMovimientos!=0){
				throw new OperationNotSupportedException("ERROR: El rey ya se ha movido antes.");
				}else if((f==1 && c2==101) ||(f==8 && c2==101)){
					posicion.setColumna((char)99);
					totalMovimientos=totalMovimientos+1;}else {
						throw new OperationNotSupportedException("ERROR: El rey no está en su posición inicial.");
					}
			}
		}
	}
			
	
	/*private boolean comprobarEnroque(){
		boolean comproEnroque=false;
		if ((posicion.getFila()==1 && posicion.getColumna()=='e') ||
			(posicion.getFila()==8 && posicion.getColumna()=='e' )) {
				if (totalMovimientos==0) {
						comproEnroque=true;}else 
							{throw new IllegalArgumentException("ERROR: El rey ya se ha movido antes.");}
		}throw new IllegalArgumentException("ERROR: El rey no está en su posición inicial.");
	}*/

	@Override
	public String toString() {
		return "color="+ color+", posicion=("+ posicion + ")";
		
	}

	
}



