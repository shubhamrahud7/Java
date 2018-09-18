import java.util.regex.*;  
public class RegexExampleDemo
{  
public static void main(String args[])
{  
//1st way  
Pattern p = Pattern.compile("...h");
Matcher m = p.matcher("naresh");  
boolean b = m.matches();  
if(b==true)
{System.out.println("both are matching");}
else
{System.out.println("both are not matching");}
//2nd way  
boolean b2=Pattern.compile(".a....").matcher("naresh").matches();  
//3rd way  
boolean b3 = Pattern.matches("...e..", "naresh");  
System.out.println(b+" "+b2+" "+b3);  //flase true true
}
}  