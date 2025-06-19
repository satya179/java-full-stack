import java.util.Scanner;
class FindingofElement{
static void find(int a[],int n,int el)
{
int count=0;
for(int i=0;i<n;i++)
{

if(el==a[i]){
 count++;
}
}
if(count==1){
System.out.print("the element "+el+" is  present in array");
}
else{
System.out.print("the element "+el+" is not present in array");
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
System.out.println("enter a element to find whether it is in array or not:");
int el=sc.nextInt();
find(a,n,el);
}
}
output:
enter the size of array:
6
enter the elements of array:
1
2
3
4
5
65
enter a element to find whether it is in array or not:
65
the element 65 is  present in array


enter the size of array:
5
enter the elements of array:
1
2
3
4
5
enter a element to find whether it is in array or not:
6
the element 6 is not present in array



