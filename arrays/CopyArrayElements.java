import java.util.Scanner;
class CopyArrayElements{
static void cop(int a[],int n)
{
int b[]=new int[n];
for(int i=0;i<n;i++)
{
b[i]=a[i];
}
for(int i=0;i<n;i++)
{
System.out.print(b[i]+" ");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array:");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the elements of array:");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
cop(a,n);
}
}
output:
enter the size of array:
6
enter the elements of array:
2
3
3
4
5
6
2 3 3 4 5 6


