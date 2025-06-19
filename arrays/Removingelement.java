import java.util.Scanner;
class Removingelement{
static void remove(int a[],int n,int el)
{
System.out.println("the elements of array before deletion is:");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
int id=-1;
for(int i=0;i<n;i++)
{
if(a[i]==el)
{
id=i;
break;
}
}
if(id==-1)
{
System.out.println("element is not found in array");
return;
}
int b[]=new int[n-1];
for(int i=0;i<id;i++)
{
b[i]=a[i];
}
for(int i=id;i<n-1;i++)
{
b[i]=a[i+1];
}
System.out.println("the elements of array after deletion is:");
for(int i=0;i<n-1;i++)
{
System.out.println(b[i]);
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
remove(a,n,el);
}
}
output:
enter the size of array:
4
enter the elements of array:
1
2
3
4
enter a element :
5
the elements of array before deletion is:
1
2
3
4
element is not found in array

enter the size of array:
4
enter the elements of array:
1
2
3
4
enter a element :
3
the elements of array before deletion is:
1
2
3
4
the elements of array after deletion is:
1
2
4

