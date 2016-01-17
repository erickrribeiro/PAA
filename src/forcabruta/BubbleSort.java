package forcabruta;

import java.util.Arrays;

public class BubbleSort {
	private int array[];
	
	public BubbleSort(int[] array) {
		this.array = array;
	}
	
	@Override
	public String toString() {
		return "BubbleSort [array=" + Arrays.toString(array) + "]";
	}


	private void swap(int i, int j){
		int temp;
		temp =  this.array[i];
		this.array[i] = this.array[j];
		this.array[j] = temp;
	}
	
	public void sort(){
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(this.array[j+1] < this.array[j]){
					swap(j, j+1);
				}
			}
			System.out.println(toString());
			
		}
	}
	
	public static void main(String[] args) {
		int array[] ={89, 90, 68, 45, 29, 34, 17};
		BubbleSort bubbleSort = new BubbleSort(array);
		System.out.println(bubbleSort.toString());
		bubbleSort.sort();
		System.out.println(bubbleSort.toString());
	}
}

