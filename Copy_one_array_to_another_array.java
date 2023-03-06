class Copy_one_array_to_another_array {
 public static void main(String args[])
{
int i;
int a1[]=new int[]{1,2,3,4,5};
int a2[]=new int[a1.length];
for(i=0;i<a1.length;i++)
{
a2[i]=a1[i];
}
System.out.print("Elements of 1st array:");
for(i=0;i<a1.length;i++)
{
System.out.print(a1[i]+" ");
}
System.out.println();
for(i=0;i<a1.length;i++)
{
a2[i]=a1[i];
}
System.out.print("Elements of 2nd array:");
for(i=0;i<a2.length;i++)
{
System.out.print(a2[i]+" ");
}
}
}
