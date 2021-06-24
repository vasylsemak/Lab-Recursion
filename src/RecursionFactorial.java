public class RecursionFactorial {
	
	public static void main(String[] args) {
		int n = 4;
		
		RecursionFactorial rf = new RecursionFactorial();
		System.out.println("Factorial of " + n + " is: " + rf.findFactorial(n));
		
	}
	
	public int findFactorial(int num) {
		if(num <= 0) return 0;
		if( num == 1) return 1;
		else return num * findFactorial(num -1);
	}
}
