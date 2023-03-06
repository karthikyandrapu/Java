class Maximum_Minimum {
static void max_min(int a[]) {
int i;
int max=a[0],min=a[0];
for(i=0;i<a.length;i++)
{
if(min>a[i])
{
min=a[i];
}
if(max<a[i])
{
max=a[i];
}
}
System.out.println("Maximum Element is:"+max);
System.out.println("Minimum Element is:"+min);
}
public static void main(String args[])
{
int a[]={33,11,44,88,77};
max_min(a);
}
}
