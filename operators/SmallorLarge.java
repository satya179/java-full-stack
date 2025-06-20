import java.util.Scanner;
class SmallorLarge{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a>b){
	    System.out.println(+a +" is larger");
	    System.out.println(+b +" is smaller");
	}
        else{
	    System.out.println(+b +" is larger");
	    System.out.println(+a +" is smaller");
	}
    }
}
	
