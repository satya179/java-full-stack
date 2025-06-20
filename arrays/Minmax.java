class Minmax{
static void min(int a[])
{
int min=a[0];
for(int i=1;i<a.length;i++){
if(min>a[i])
{
min=a[i];
}
}
System.out.println("the minimum number is:"+min);
}
static void max(int a[])
{
int max=a[0];
for(int i=1;i<a.length;i++){
if(max<a[i])
{
max=a[i];
}
}
System.out.println("the maximum number is:"+max);
}
public static void main(String args[]){
int a[]={1,2,3,4,5,6};
min(a);
max(a);
}
}

output:
the minimum number is:1
the maximum number is:6
