package forcabruta;

import java.util.Arrays;

public class ClosestPair {
	private Coordenada[] pontos;
	private Coordenada result[];
		
	public ClosestPair(Coordenada[] pontos) {
		this.pontos = pontos;
		this.result = new Coordenada[2];
	}

	
	@Override
	public String toString() {
		return "ClosestPair [result=" + Arrays.toString(result) + "]";
	}

	private double euclideanDistance(Coordenada pontoA, Coordenada pontoB ){
		return Math.sqrt(Math.pow(pontoB.x - pontoA.x, 2) + Math.pow(pontoB.y - pontoA.y, 2));		
	}
	
	public void closestPair(){
		double shortestDistance, newDistance;		
		
		shortestDistance = Double.MAX_VALUE;
		
		for (int i = 0; i < this.pontos.length-1; i++) {
			for (int j = i+1; j < this.pontos.length; j++) {
				newDistance = euclideanDistance(this.pontos[i], this.pontos[j]);
				if(newDistance < shortestDistance){
					shortestDistance = newDistance;
					result[0] = this.pontos[i];
					result[1] = this.pontos[j];
					
					System.out.println(result[0]);
					System.out.println(result[1]);
					System.out.println("-------------------");
				}											
			}			
			
		}		
		
	}
	public static void main(String[] args) {		
		Coordenada pontos[] = {
				new Coordenada(2, 7),
				new Coordenada(4, 13),
				new Coordenada(5, 7),
				new Coordenada(10, 5),
				new Coordenada(13, 9),
				new Coordenada(15, 5),
				new Coordenada(17, 7),
				new Coordenada(19, 10),
				new Coordenada(22, 7),
				new Coordenada(25, 10),
				new Coordenada(29, 14),
				new Coordenada(30, 2),
		};
		
		ClosestPair closestPair = new ClosestPair(pontos);
		closestPair.closestPair();
		
		System.out.println(closestPair.toString());
	}
	
	}

class Coordenada{
	public double x;
	public double y;
	
	public Coordenada(){
		this(0, 0);
	}
	
	public Coordenada(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Coordenada [x=" + x + ", y=" + y + "]";
	}
	
	
	
}