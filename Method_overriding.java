class A {
	void compute(double x)	{
		System.out.println("Square:"+x*x);
	}
}
class B extends A{
	void compute(double x)	{
		System.out.println("Square Root:"+Math.sqrt(x));
	}
}
public class Method_overriding {
	public static void main(String[] args) {
		B obj = new B();
		obj.compute(25);
	}
}
