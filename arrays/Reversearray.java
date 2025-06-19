import java.util.Scanner;
class Reversearray{
static void reverse(int a[],int n){
int b[]=new int[n];
int j=n;
for (int i=0;i<n;i++)
{
b[j-1]=a[i];
j=j-1;
}
System.out.println("the reverse array is:");
for (int i=0;i<n;i++)
{
System.out.println(b[i]);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array:");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter elements of array:");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
reverse(a,n);
}
}

output:
enter size of array:
5
enter elements of array:
1
2
3
4
5
the reverse array is:
5
4
3
2
1