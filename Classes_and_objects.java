public class Classes_and_objects {
	int a=10,b=5,c,d;
	String s="Hello World";
	void add()
	  {
		c=a+b;
		System.out.println("Add="+c);
	  }
	void sub()
	  {
		d=a-b;
		System.out.println("Sub="+d);
	  }
	public static void main(String[] args) {
		Classes_and_objects obj1=new Classes_and_objects();
		Classes_and_objects obj2=new Classes_and_objects();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.s);
		obj2.add();
		obj2.sub();
	}
}
