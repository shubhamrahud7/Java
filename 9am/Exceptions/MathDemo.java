import static java.lang.Math.*;
class MathDemo
{
public static void main(String args[])
{
System.out.println("sqrt="+sqrt(897));
System.out.println("abs="+abs(897));
System.out.println("abs="+abs(-897));
System.out.println("addExact"+addExact(48,45));
System.out.println("asin="+	asin(2.56));
System.out.println("cbrt="+cbrt(27));
System.out.println("ceil="+ceil(98.76));   //99
System.out.println("ceil="+ceil(98.0001));  //99
System.out.println("ceil="+ceil(98.999));   //99
System.out.println("floor="+floor(98.76));  //98
System.out.println("floor="+floor(98.999)); //98
System.out.println("floor="+floor(98.00001));//98
System.out.println("round="+round(98.76));  //99
System.out.println("round="+round(98.999)); //99
System.out.println("round="+round(98.00001));//98
System.out.println("decrementExact="+decrementExact(90));
System.out.println("EXP="+exp(10));
System.out.println("incrementExact="+incrementExact(90));
System.out.println("log="+log(10));
System.out.println("log10="+log10(10));
System.out.println("signum="+signum(90));
System.out.println("signum="+signum(-90));
System.out.println("signum="+signum(0));


}
}

	