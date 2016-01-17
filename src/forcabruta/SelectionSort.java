package forcabruta;

import java.util.Arrays;

public class SelectionSort {	
	private int[] array;
	
	public SelectionSort(int[] array) {
		this.array = array;
	}
	
	/**
	 * Retorna uma String contendo todos os valores do array.
	 */
	
	@Override
	public String toString(){
		return "SelectionSort [array=" + Arrays.toString(array) + "]";
	}
	
	/**
	 * Realiza a troca entre valores de dois elementos de um array.
	 * @param array
	 * @param i
	 * @param j
	 */
	private void swap(int i, int j){
		int temp;
		temp = this.array[i];
		this.array[i] = this.array[j];
		this.array[j] = temp;	
	}
	
	public void sort(){
		int min;
		for (int i = 0; i < this.array.length-1; i++) {
			min = i;
			/**
			 * É percorrida a lista, começando pelo segundo elemento, para encontrar
			 * o menor dentre os n-1 ultimos elementos.  
			 */
			for (int j = i+1; j < this.array.length; j++) {
				if(this.array[j] < this.array[min]){
					min = j;					
				}
			}					
			
			swap(i, min);
			System.out.println(toString());
		}			
	}
		
	public static void main(String[] args) {
		int array[] ={89, 90, 68, 45, 29, 34, 17};		
		SelectionSort selectionSort = new SelectionSort(array);
		System.out.println(selectionSort.toString()); 
		selectionSort.sort();
		System.out.println(selectionSort.toString());
		
	}
	
}
