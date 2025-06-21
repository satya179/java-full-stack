class  StartEndMethod
{
public static void main(String[] args){
String a="SRI VASAVI";
String b="sri vasavi";
System.out.println(a.equalsIgnoreCase(b));
System.out.println(a.startsWith("S"));
System.out.println(a.startsWith("a"));
System.out.println(b.endsWith("i"));
System.out.println(a.compareTo(b));
}
}

output:
true
true
false
true
-32