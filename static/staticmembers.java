class Staticmembers
{

static String sv1="static variable1";

static String sv2="static variable2";

String iv1="instance variable1";

String iv2="instance variable2";

static void smethod1()
{
    
System.out.println(sv1);

System.out.println("static method1");


}
static void smethod2()
{
    
System.out.println(sv2);

System.out.println("static method2");


}
void imethod1()
{
    
System.out.println(iv1);
System.out.println("instance method1");


}
void imethod2()
{
    
System.out.println(iv2);

System.out.println("instance method2");


}
public static void main(String[] args)

{
smethod1();

smethod2();

Staticmembers sm=new Staticmembers();

sm.imethod1();

sm.imethod2();

}

}
output:
static variable1

static method1

static variable2

static method2

instance variable1

instance method1

instance variable2

instance method2


class Staticmembers
{

String iv1="instance variable1";

String iv2="instance variable2";

static void smethod1()
{
    
System.out.println(iv1);

System.out.println("static method1");


}

static void smethod2()
{
    
System.out.println(iv2);

System.out.println("static method2");


}


public static void main(String[] args)
{
    
Staticmembers sm=new Staticmembers();

smethod1();

smethod2();

Staticmembers sm=new Staticmembers();


}

}
output:
ERROR!
/tmp/0ev953RIXX/Main.java:8: error: non-static variable iv1 cannot be referenced from a static context
    
System.out.println(iv1);
                       
^
ERROR!

/tmp/0ev953RIXX/Main.java:14: error: non-static variable iv2 cannot be referenced from a static context
    
System.out.println(iv2);
                       
^
ERROR!

/tmp/0ev953RIXX/Main.java:24: error: variable sm is already defined in method main(String[])
Staticmembers sm=new Staticmembers();
              
3 errors

ERROR!

error: compilation failed



class Staticmembers
{

static String sv1="static variable1";

static String sv2="static variable2";

void imethod1()
{
   

System.out.println("instance method1");
 
System.out.println(sv1);


}

void imethod2()
{

System.out.println("instance method2");
 
System.out.println(sv2);
}



public static void main(String[] args)
{

Staticmembers sm=new Staticmembers();

sm.imethod1();

sm.imethod2();




}
}
output:
instance method1

static variable1

instance method2

static variable2

class Staticmembers
{


static void smethod1()
{
  

System.out.println("static method1");



}

static void smethod2()
{
    

System.out.println("static method2");


}

void imethod1()
{


System.out.println("instance method1");


smethod1();

}

void imethod2()
{
 

System.out.println("instance method2");

smethod2();


}

public static void main(String[] args)
{


Staticmembers sm=new Staticmembers();

sm.imethod1();

sm.imethod2();

}

}

output:
instance method1

static method1

instance method2

static method2

class Staticmembers
{


static void smethod1()
{

System.out.println("static method1");

obj.imethod1();


}

static void smethod2()
{
    

System.out.println("static method2");

obj.imethod2();

}

void imethod1()
{


System.out.println("instance method1");



}

void imethod2()
{
 

System.out.println("instance method2");



}
public static void main(String[] args)
{
    
Staticmembers obj=new Staticmembers();

smethod1();

smethod2();


}

}
output:
ERROR!

/tmp/vBOaGy5qKE/Main.java:9: error: cannot find symbol

obj.imethod1();
^
  
symbol:   variable obj
  
location: class Staticmembers

ERROR!

/tmp/vBOaGy5qKE/Main.java:16: error: cannot find symbol

obj.imethod2();
^
  
symbol:   variable obj
  
location: class Staticmembers

2 errors

ERROR!

error: compilation failed


class Staticmembers
{


static String sv1="static variable1";

static String sv2="static variable2";

String iv1="instance variable1";

String iv2="instance variable2";

public static void main(String[] args)
{
    
Staticmembers obj=new Staticmembers();
    
System.out.println(sv1);
   
System.out.println (Staticmembers.sv1);
   
System.out.println( obj.sv2);
    
System.out.println(obj.iv1);
    
System.out.println(obj.iv2);
}

}
}

output:
static variable1

static variable1

static variable2

instance variable1

instance variable2



class Staticmembers
{

static void smethod1()
{

System.out.println("static method1");

}

static void smethod2()
{
System.out.println("static method2");

}

void imethod1()
{

System.out.println("instance method1");

}

void imethod2()
{

System.out.println("instance method2");

}

public static void main(String[] args)

{

smethod1();

smethod2();

Staticmembers sm=new Staticmembers();

sm.imethod1();

sm.imethod2();

}

}

output:
static method1

static method2

instance method1

instance method2
