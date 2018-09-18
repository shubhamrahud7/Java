class MyException extends Exception
{
private static int accno[]={12,13,11,14,15};
private static String name[]={"sun","Sud","sree","siri","latha"};
private static double bal[]={20545.53,345.45,15534.534,5435.56,324.643};
MyException( )
{  }
MyException(String str)
{
super(str);
}
public static void main(String args[])
{
try {
System.out.println("accno "+"\t"+"name"+ "balance ");
for(int i=0;i<5;i++)
{
System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
if(bal[i]<3000.00)
{
MyException me=new MyException("balance ammount is less");
throw me;
}
}
}
catch(MyException me)
{
me.printStackTrace( );
}
}
}
