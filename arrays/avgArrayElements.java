import java.util.Scanner;
class avgArrayElements{
static void avg(int a[],int n)
{
int sum=0;
int avg=0;
for(int b:a)
{
sum=sum+b;
}
avg=sum/n;
System.out.print("the average of array elements are  "+avg);
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
avg(a,n);
}
output:
enter the size of array:
5
enter the elements of array:
10
20
30
40
50
the average of array elemnte are 30
}