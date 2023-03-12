public class Armstrong_number {
 public static void main(String args[]) {
	 int num, n=371, d,sum=0;
	 num=n;
	 while(n!=0)
	 {
		 d=n%10;
		 sum=sum+(d*d*d);
		 n=n/10;
	 }
	     if(num==sum)
	         System.out.print(num+" is an Armstrong Number");
	     else
	         System.out.print(num+" is not an Armstrong Number");
 }
}
