class Matchingregtostring
{
public static void main(String[] args){
String reg="[a-zA-Z]+\\d+";
String a="java123";
System.out.println(a.matches(reg));
}
}
output:
true