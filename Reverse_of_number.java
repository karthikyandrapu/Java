
public class Reverse_of_number {

	public static void main(String[] args) {
		int n=9876,num, reverse=0,remainder;
		num=n;
		while (n!=0)
		{
			remainder=n%10;
		    n/=10;
		    reverse=reverse*10+remainder;
		}
		System.out.print("Reverse Number of "+num+" is: "+reverse);
	}
}
