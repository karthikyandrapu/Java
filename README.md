class static classobj{
int a=10,b=5;
String s="Hello World";
static void add()
{
System.out.println("Add="+(a+b));
}
static void sub()
{
System.out.println("Sub="+(a-b));
}
public static void main(String args[])
{
class_obj obj1=new class_obj();
class_obj obj2=new class_obj();
System.out.println(obj1.a);
System.out.println(obj1.b);
System.out.println(obj1.s);
System.out.println("Add:");
obj2.add();
System.out.println("Sub:");
obj2.sub();
}
}



public class classobj{
static int a=10,b=5,c,d;
String s="Hello World";
static void add()
{
c=a+b;
System.out.println("Add="+c);
}
static void sub()
{
d=a-b;
System.out.println("Sub="+d);
}
public static void main(String args[])
{
classobj obj1=new classobj();
classobj obj2=new classobj();
System.out.println(obj1.a);
System.out.println(obj1.b);
System.out.println(obj1.s);
obj2.add();
obj2.sub();
}
}




class datatypes{
public static void main( String[] args)
{
	int a=10;
	short b=1000;
	long c=900000000;
	double d=29999999999D;
	float e=10.5f;
	byte f=109;
	char g='K';
	boolean h=true;
	System.out.println("Int:"+a);
	System.out.println("Short:"+b);
	System.out.println("Long:"+c);
	System.out.println("Double:"+d);
	System.out.println("Float:"+e);
	System.out.println("Byte:"+f);
	System.out.println("Char:"+g);
	System.out.println("Boolean:"+h);
}
}
