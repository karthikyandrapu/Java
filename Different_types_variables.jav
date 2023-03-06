class Different_types_variables{
  int x=10;
  static int y=20;
  public static void main(String args[]) {
   System.out.println("Instance/ Reference Variables:");
   Different_types_variables obj1=new Different_types_variables();
   System.out.println(obj1.x);
   System.out.println("Static Variables:");
   System.out.println(y);
   Different_types_variables obj2=new Different_types_variables();
   System.out.println(obj2.y);
   System.out.println(Different_types_variables.y);
   System.out.println("Local Variables:");
   int z=30;
   System.out.println(z);
  }
}
