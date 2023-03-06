class Demo {
int id;
String name;
Demo()
{
System.out.println("Default Constructor");
}
Demo(int id,String name)
{
this();
this.id=id;
this.name=name;
this.display();
}
void display()
{
System.out.println(id+" "+name);
}
}
class This_pointer{
public static void main(String args[])
{
Demo s=new Demo(111,"srkr");
}
} 
