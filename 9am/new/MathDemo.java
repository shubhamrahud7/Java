class MathDemo
{
	public static void main(String args[])
	{
System.out.println("abs value="+Math.abs(5));  //5	System.out.println("abs value="+Math.abs(-5));  //5
System.out.println("acos value="+Math.acos(1.9));
System.out.println("addExact value="+Math.addExact(8,5));//13
System.out.println("asin value="+Math.asin(5));
System.out.println("cbrt value="+Math.cbrt(27));//3
System.out.println("ceil value="+Math.ceil(49.6));//50	
System.out.println("ceil value="+Math.ceil(49.1));//50	
System.out.println("floor value="+Math.floor(49.01));//49	
System.out.println("ceil value="+Math.floor(49.9));//49	
System.out.println("floor value="+Math.floor(49.99));//49	
System.out.println("floor value="+Math.floor(49.01));//49
System.out.println("round value="+Math.round(49.9));//50	
System.out.println("round value="+Math.round(49.5));//50	
System.out.println("round value="+Math.round(49.01));//49
System.out.println("decrementExact value="+Math.decrementExact(90));//89	
System.out.println("exp value="+Math.exp(-5));
System.out.println("incrementExact value="+Math.incrementExact(90));//91
System.out.println("log value="+Math.log(10));//
System.out.println("log10 value="+Math.log10(10));//10
System.out.println("max value="+Math.max(10,51));//51	
System.out.println("min value="+Math.min(10,78));//78
System.out.println("multiplyExact value="+Math.multiplyExact(10,78));//780
System.out.println("negateExact value="+Math.negateExact(10));
//-10
System.out.println("nextAfter value="+Math.nextAfter(10.23,10.59));
System.out.println("nextDown value="+Math.nextDown(10.2598));
System.out.println("pow value="+Math.pow(10,2));//100.00
System.out.println("sqrt value="+Math.sqrt(625));//25
	}
	}