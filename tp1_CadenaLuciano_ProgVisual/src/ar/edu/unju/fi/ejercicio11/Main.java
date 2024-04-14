package ar.edu.unju.fi.ejercicio11;

public class Main {
	
	/*
	 *	Dentro del paquete creado para el ejercicio crear la clase Main que contenga al método main().
		Utilice la estructura de control iterativa for para mostrar por consola la secuencia numérica:
		80 117 152 185 216 245 272 297 320 341 360 377 392 405 416 425 432 437 440 441 440 
		437 432 425 416 405 392 377 360 341 320 297 272 245 216 185 152 117 80 41
		Las únicas variables que se utilizan son i, j tanto en la sección de inicialización e incremento.
		j inicia en 40 e i inicia en 2.
		Si el valor de j es negativo se finaliza.
		La serie de números se imprime en una sola línea
	 */

	public static void main(String[] args) {
		
		for(int j=40 ,i=2; j>0; i++, j--) {
			
			System.out.print(i*j + " ");
			
		}
		
	}

}

