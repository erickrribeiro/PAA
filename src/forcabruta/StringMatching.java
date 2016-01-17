package forcabruta;

public class StringMatching {
	private String text;
	
	public StringMatching(String text) {
		this.text = text;
	}
	
	public int stringMathing(String subText){
		for (int i = 0; i < (this.text.length() - subText.length()); i++) {
			int j = 0;
			while(j < subText.length() && subText.charAt(j) == this.text.charAt(i+j)){
				j += 1;
			}
			if(j == subText.length())return i;
	
		}
		return -1;
	}
	
	public static void main(String[] args) {		
		StringMatching matching = new StringMatching("NOBODY_NOTICED_HIM");
		System.out.println(matching.stringMathing("NOT"));
		System.out.println(matching.stringMathing("ZZZ"));
	}
}
