public class Palindrome {
	public static void main(String args[])
	{
	int number=101,rem, n, result= 0;
	n = number;
	while(number>0)
	 {
	  rem = number%10;
	  number = (number/10);
	  result = result*10+rem;
	 }
	if(result==n)
	 {
	 System.out.print(n+" is Palindrome");
	 }
	else
	 {
	 System.out.print(n+" is not Palindrome");
	 }
	}
} 
