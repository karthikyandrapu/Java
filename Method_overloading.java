class x {
	void add(int a, int b) {
		int c;
		c=a+b;
		System.out.println("Addition is:"+c);
	}
	void add(double a, double b, double c) {
		double d;
		d=a+b+c;
		System.out.println("Addition is:"+d);
	}
}
public class Method_overloading {
	public static void main(String args[]) {
		x obj=new x();
		obj.add(10,16);
		obj.add(16.3,14.2,15.1);
	}
}
