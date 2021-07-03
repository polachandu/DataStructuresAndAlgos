package recursiveAlgorithm;

public class Factorial {
	
	public static int iterativeFactorial(int num) {
		if(num==0) {
			return 1;
		}
		int factorial = 1;
		for(int i=num;i>0;i--) {
			factorial*=i;
		}
		return factorial;
	}
	
	public static int recursiveFactorial(int num) {
		if(num ==0) {
			return 1;
		}
		return num*recursiveFactorial(num-1);
	}


	public static void main(String[] args) {
	
		System.out.println("The factorial of is: "+recursiveFactorial(5));
		
	}

}
