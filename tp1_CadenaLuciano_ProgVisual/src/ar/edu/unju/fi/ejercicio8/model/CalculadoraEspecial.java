package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	
	private int n;
	
	public CalculadoraEspecial() {
		
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public double calcularSumatoria() {
		
		double sumatoria = 0;
		
		for(int k=1; k<=n; k++) {
			
			double termino = Math.pow(k * (k+1) / 2.0, 2);
			sumatoria += termino;
			
		}
		
		return sumatoria;
		
	}
	
	public long calcularProductoria() {
		
		long productoria = 1;
		
		for(int k=1; k<=n; k++) {
			
			productoria *= k * (k+4);
			
		}
		
		return productoria;
		
	}
	
}
