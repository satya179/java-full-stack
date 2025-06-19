import java.util.Scanner;
class Specificindex{
static void index(int a[],int n,int el,int id)
{
System.out.println("the elements of array before insertion is:");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
for(int i=0;i<n;i++)
{
if(i==id)
{
a[i]=el;
}
}
System.out.println("the elements of array after insertion is:");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
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
System.out.println("enter a element :");
int el=sc.nextInt();
System.out.println("enter a specific index :");
int id=sc.nextInt();
index(a,n,el,id);
}
}
output:
enter the size of array:
5
enter the elements of array:
1
2
3
4
5
enter a element :
50
enter a specific index :
3
the elements of array before insertion is:
1
2
3
4
5
the elements of array after insertion is:
1
2
3
50
5
