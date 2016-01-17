package forcabruta;

public class SequencialSearch {
	private int[] array;
	
	public SequencialSearch(int[] array) {
		this.array = array;
	}
	
	public int search(int k){
		int i = 0;
		while(i != this.array.length && this.array[i] != k){
			i += 1;
		}
		if(i < this.array.length) return i;
		else return -1;
	}
	public static void main(String[] args) {
		int array[] ={89, 90, 68, 45, 29, 34, 17};
		SequencialSearch search = new SequencialSearch(array);
		System.out.println(search.search(17));
		System.out.println(search.search(500));
	}
}
