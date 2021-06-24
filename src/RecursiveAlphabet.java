public class RecursiveAlphabet {
	
	public static void main(String[] args) {
		char c = 'l';
		
		RecursiveAlphabet ra = new RecursiveAlphabet();
		System.out.println("   "+ ra.printAbcBackwards(c));
	}
	
		public String printAbcBackwards(char letter) {
			if(letter == 'a') return "a";
			else return letter + printAbcBackwards((char)(letter - 1));
		}

}
