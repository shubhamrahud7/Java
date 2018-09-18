class OurThread extends Test implements Runnable 
{
	public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(i);
}
}
public static void main(String args[])
{
OurThread mt=new OurThread();
Thread t1=new Thread(mt);
t1.start();
}
}
