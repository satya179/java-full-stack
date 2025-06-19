import java.util.Scanner;
class addArrayElements{
static void add(int a[])
{
int sum=0;
for(int b:a)
{
sum=sum+b;
}
System.out.print(sum);
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
add(a);
}
output:
enter the size of array:
6
enter the elements of array:
10
20
30
40
50
60
210
}