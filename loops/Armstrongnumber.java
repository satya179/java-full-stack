import java.util.Scanner;
import java.lang.Math;
class Armstrongnumber{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a   number:");
int n1=sc.nextInt();
int temp=n1;
int r;
int sum=0;
int len = String.valueOf(n1).length();
while(temp!=0)
{
r=temp%10;
sum+=Math.pow(r,len);
 temp=temp/10;
}
if(sum==n1)
{
System.out.println(n1+" is a armstrong number");
}
else
{
System.out.println(n1+" is not a armstrong number");
}
}
}
output:
enter a   number:
370
370 is a armstrong number

