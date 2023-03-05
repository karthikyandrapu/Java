public class Factorial_number {
	public static void main(String[] args) {
		int i, n=10, fact = 1;
		for (i = 1; i <= n; i++)
		{
			fact = fact * i;
		}
		    System.out.print("Factorial of "+n+"is: "+fact);
	}
}
