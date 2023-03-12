class Test	{
	int a,b;
	Test()
	{
		a=10;
		b=20;
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
	}
	Test(int x, int y)
	{
		a=x;
		b=y;
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
	}
}
public class Constructor_overloading {
	public static void main(String[] args) {
		Test T1 = new Test();
		Test T2 = new Test(30,40);
	}
}
