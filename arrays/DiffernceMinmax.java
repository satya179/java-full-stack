class DiffernceMinmax{
static int min(int a[])
{
    int min=a[0];
for(int i=1;i<a.length;i++){
if(min>a[i])
{
min=a[i];
}
}
return min;
}
static int max(int a[])
{
int max=a[0];
for(int i=1;i<a.length;i++){
    
if(max<a[i])
{
max=a[i];
}
}
return max;
}
public static void main(String args[]){
int a[]={1,2,3,4,5,6};
int smallest=min(a);
int largest=max(a);
System.out.println("difference between largest and smallest numbers is :"+(largest-smallest));
}
}
output:
difference between largest and smallest numbers is :5
