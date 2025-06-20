
/*import java.util.Scanner;

class Main 
{
    
public static void main(String[] args)
{
 
Scanner sc=new Scanner(System.in);
      
System.out.println("enter number of elemnts");
       
int n=sc.nextInt();
       
for(int i=0;i<n;i++)
       
{
           
or(int j=0;j<n;j++)
          
 {
               
System.out.print("*");
          
}
           
System.out.println(' ');
      
 }

    
}

}
output:
enter number of elemnts

6

****** 

****** 

****** 

****** 

****** 

****** 
*/

/*import java.util.Scanner;

class Main 
{
    
public static void main(String[] args)
{
 
Scanner sc=new Scanner(System.in);
      
System.out.println("enter number of elemnts");
       
int n=sc.nextInt();
       
for(int i=0;i<n;i++)
       
{
           
or(int j=0;j<n;j++)
          
 {
               
System.out.print(i+1);
          
}
           
System.out.println(' ');
      
 }

    
}

}
output:enter number of elemnts

5
111111 
222222 

333333 

444444 

555555 

*/



/*import java.util.Scanner;

class Main 
{
    
public static void main(String[] args)
{
 
Scanner sc=new Scanner(System.in);
      
System.out.println("enter number of elemnts");
       
int n=sc.nextInt();
       
for(int i=0;i<n;i++)
       
{
           
or(int j=0;j<n;j++)
          
 {
               
System.out.print(j+1+" ");
          
}
           
System.out.println(' ');
      
 }

    
}

}
output:
enter number of elemnts

5

1 2 3 4 5  

1 2 3 4 5  

1 2 3 4 5  

1 2 3 4 5  

1 2 3 4 5  
*/
/*import java.util.Scanner;

class Main {
    
public static void main(String[] args) {
      
 Scanner sc=new Scanner(System.in);
       
System.out.println("enter number of elemnts");
       
int n=sc.nextInt();
       
int a=0;
      
 for(int i=0;i<n;i++)
       
{
           
for(int j=0;j<n;j++)
           
{
               
System.out.print(a+1
+" ");
               
++a;
           
}
           
System.out.println(' ');
       
}
output:
enter number of elemnts

5

1 2 3 4 5  

6 7 8 9 10  

11 12 13 14 15  

16 17 18 19 20  

21 22 23 24 25  */

/*import java.util.Scanner;

class Main {
    
public static void main(String[] args) {
      
 Scanner sc=new Scanner(System.in);
       
System.out.println("enter number of elemnts");
       
int n=sc.nextInt();
       
int a=0;
      
 for(int i=0;i<n;i++)
       
{
           
for(int j=0;j<n;j++)
           
{
               
System.out.print(a+1
+" ");
               
a=a+2;
           
}
           
System.out.println(' ');
       
}
output:
enter number of elemnts

5

1 3 5 7 9  

11 13 15 17 19  

21 23 25 27 29  

31 33 35 37 39  

41 43 45 47 49  
*/

/*import java.util.Scanner;

class Main {
    
public static void main(String[] args) {
       
Scanner sc=new Scanner(System.in);
       
System.out.println("enter number of elemnts");
       
int n=sc.nextInt();
       
       
for(int i=1;i<n;i++)
       
{
           
for(int j=0;j<n-i;j++)
           
{
               
System.out.print(" ");
           
}
           
for(int k=0;k<i;k++)
           
{
          
System.out.print("*"+" ");
           
}
           
System.out.println("");
       
}
    
}

    
}
output:
enter number of elemnts

5

    * 
 
   * * 
  
  * * * 
 
 * * * * 
*/
/*import java.util.Scanner;

class Main {
   
 public static void main(String[] args) {
       
Scanner sc=new Scanner(System.in);
       
System.out.println("enter number of elemnts");
       
int n=sc.nextInt();
       
       
for(int i=1;i<=n;i++)
      
{
          
 for(int j=1;j<=n-i;j++)
           
{
               
System.out.print(" ");
           
}
           
for(int k=1;k<=i;k++)
           
{
          
System.out.print((k*2)+" ");
           
}
          
 System.out.println("");
       
}
    
}
}
output:
enter number of elemnts

5

    2 
 
   2 4 

  2 4 6 

 2 4 6 8 

2 4 6 8 10 */
/*

import java.util.Scanner;

class Main {
    
public static void main(String[] args) {
       
Scanner sc=new Scanner(System.in);
       
System.out.println("enter number of elemnts");
       
int n=sc.nextInt();
       
int a=1;
       
for(int i=1;i<=n;i++)
      
 {
           
for(int j=1;j<=n;j++)
           
{
               
System.out.print(a+" ");
              
a++;
               
if(a==10)
           
{
              
 a=1;
           
}
           
}
           
System.out.println("");
      
 }
   
}


    

}
output:
enter number of elemnts

5

1 2 3 4 5

6 7 8 9 1

2 3 4 5 6

7 8 9 1 2
3 4 5 6 7*/

/*import java.util.Scanner

class Main {
    
public static void main(String[] args) {
       
Scanner sc=new Scanner(System.in);
       
System.out.println("enter number of elemnts");
       
int n=sc.nextInt();
       
       
for(int i=0;i<n;i++)
       
{
           
for(int j=0;j<n;j++)
           
{
               
System.out.print((j%2==0)?"1":"0");
              
              
           
}
           
System.out.println("");
       
}
    
}

output:

enter number of elemnts

5

10101

10101

10101

10101

10101
*/
/*import java.util.Scanner;

class Main {
    
public static void main(String[] args) {
       
Scanner sc=new Scanner(System.in);
       
System.out.println("enter the string");
       
String s=sc.next();
       
int len=s.length();
       
for(int i=1;i<=len;i++)
       
{
        
System.out.println(s.substring(0,i));
       
}
   
 }

}

OUTPUT:
enter the string

INDIA

I

IN

IND

INDI

INDIA*/

/*import java.util.Scanner;

class Main {
    
public static void main(String[] args) {
       
Scanner sc=new Scanner(System.in);
       
System.out.println("enter no of elements");
       
int n=sc.nextInt();
       
       
for(int i=1;i<=n;i++)
       
{
            
for(int j=i;j<n;j++)
       
{
        
System.out.print(" ");
       
}
        
for(int k=1;k<=(2*i-1);k++)
        
{
               
System.out.print("*");
        
}
           
System.out.println(" ");
    
}
    
}


}
output;
enter no of elements

5

    * 
 
   *** 

  ***** 

 ******* 

*********   
*/
/*
import java.util.Scanner;
class Patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
     for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=n-i;j++)
         {
            System.out.print(" "); 
         }
         
         for(int k=1;k<=(2*i-1);k++)
         {
            System.out.print("*"); 
         }
         System.out.println(" "); 
         
     }
       for(int i=n-1;i>=1;--i)
     {
         for(int j=n;j>i;j--)
         {
            System.out.print(" "); 
         }
         
         for(int k=1;k<=(2*i-1);k++)
         {
            System.out.print("*"); 
         }
         System.out.println(" "); 
         
     }
    }
}
output:
enter size:
7
      * 
     *** 
    ***** 
   ******* 
  ********* 
 *********** 
************* 
 *********** 
  ********* 
   ******* 
    ***** 
     *** 
      * 

*/

/*
import java.util.Scanner;
class Patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
        
     for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=n;j++)
         {
            if(i==1 || i==n||j==1||j==n)
            {
            System.out.print("*"); 
             }
             else{
               System.out.print("  "); 
             }
         }
         System.out.println(" "); 
         
     }
       
    }
}
output:
enter size:
5
* * * * * 
*       * 
*       * 
*       * 
* * * * *  

*/

/*
import java.util.Scanner;
class Patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
        
     for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=n;j++)
         {
            if(i==1 || i==n||j==1||j==n||j==(n+1)/2||i==(n+1)/2)
            {
            System.out.print("* "); 
             }
             else{
               System.out.print("  "); 
             }
         }
         System.out.println(" "); 
         
     }
       
    }
}

output:
enter size:
7
* * * * * * * 
*     *     * 
*     *     * 
* * * * * * * 
*     *     * 
*     *     * 
* * * * * * * 
*/
/*import java.util.Scanner;
class Patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
        
     for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=n;j++)
         {
            if(j==(n+1)/2||i==(n+1)/2)
            {
            System.out.print("* "); 
             }
             else{
               System.out.print("  "); 
             }
         }
         System.out.println(" "); 
         
     }
       
    }
}
output:
enter size:
7
      *        
      *        
      *        
* * * * * * *  
      *        
      *        
      *   
*/
/*import java.util.Scanner;

class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars and inner spaces
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars and inner spaces
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
output:
Enter size: 
7
      *
     * *
    *   *
   *     *
  *       *
 *         *
*           *
 *         *
  *       *
   *     *
    *   *
     * *
      *
*/

/*import java.util.Scanner;

class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n; j++)
            {
                if (i==j|| i+j == (n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
    }
}

output:
Enter size: 
7
*     *
 *   * 
  * *  
   *   
  * *  
 *   * 
*     *
*/
