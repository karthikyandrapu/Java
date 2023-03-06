import java.util. *;
class Matrixmultiplication {
public static void main(String args[]) {
int i,j,k,row1,row2,col1,col2;
Scanner s=new Scanner(System.in);
System.out.println("Enter no. of rows in 1st matrix:");
row1=s.nextInt();
System.out.println("Enter no. of rows in 2nd matrix:");
row2=s.nextInt();
System.out.println("Enter no. of columns in 1st matrix:");
col1=s.nextInt();
System.out.println("Enter no. of columns in 2nd matrix:");
col2=s.nextInt();
if(col1!=row2)
{
System.out.println("Matrix Multiplication is not possible");
}
else
{
int a[][]=new int [row1][col1];
int b[][]=new int [row2][col2];
int c[][]=new int [row1][col2];
System.out.println("Enter values for matrix A:");
for(i=0;i<row1;i++)
{
 for(j=0;j<col1;j++)
 {
   a[i][j]=s.nextInt();
 }
}
System.out.println("Enter values for matrix B:");
for(i=0;i<row2;i++)
{
 for(j=0;j<col2;j++)
 {
   b[i][j]=s.nextInt();
 }
}
System.out.println("Matrix Multiplication:");
for(i=0;i<row1;i++)
{
 for(j=0;j<col2;j++)
 {
   c[i][j]=0;
   for(k=0;k<col1;k++)
   {
    c[i][j]+=a[i][k]*b[k][j];
   }
   System.out.print(c[i][j]+" "); 
 }
 System.out.println();
}
}
}
}
