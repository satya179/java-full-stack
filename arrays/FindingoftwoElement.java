import java.util.Scanner;
class FindingoftwoElement{
static void find(int a[],int n,int el1,int el2){
int c1=0;
int c2=0;
for(int i=0;i<n;i++)
{
if(el1==a[i]){
 c1++;
}
if(el2==a[i])
{
c2++;
}
}
if(c1==1 && c2==1){
System.out.print("the element "+el1+" and "+el2+" are  present in array");
}
else if(c1==1 && c2!=1)
{
System.out.print("the element "+el1+" is present in array and "+el2+" is not present in array");
}
else if(c1!=1 && c2==1)
{
System.out.print("the element "+el1+" is not present in array and  "+el2+" is  present in array ");
}
else
{
System.out.print("the element "+el1+" and "+el2+" are not present in array");
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
System.out.println("enter the first element to find whether it is in array or not:");
int el1=sc.nextInt();
System.out.println("enter the second element to find whether it is in array or not:");
int el2=sc.nextInt();
find(a,n,el1,el2);
}
}

output:
enter the size of array:
7
enter the elements of array:
12
23
34
45
56
67
78
enter the first element to find whether it is in array or not:
23
enter the second element to find whether it is in array or not:
10
the element 23 is present in array and 10 is not present in array
