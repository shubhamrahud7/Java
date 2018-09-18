class Atm extends Thread
{
String cname;
Atm(String cname)
{
this.cname=cname;
}
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(cname+":"+i);
}
}
}
class AtmUser
{
public static void main(String args[]) throws Exception
{
System.out.println("MAX_PRIORITY="+Thread.MAX_PRIORITY);	
System.out.println("MIN_PRIORITY="+Thread.MIN_PRIORITY);	
System.out.println("NoRM_PRIORITY="+Thread.NORM_PRIORITY);	
Atm c1=new Atm("venkat");
Thread t1=new Thread(c1);
Atm c2=new Atm("prudhvi");
Thread t2=new Thread(c2);
Atm c3=new Atm("naveen");
Thread t3=new Thread(c3);
Atm c4=new Atm("amith");
Thread t4=new Thread(c4);
System.out.println("t1 getState="+t1.getState());	
System.out.println("t2 getState="+t2.getState());	
System.out.println("t3 getState="+t3.getState());	
System.out.println("t4 getState="+t4.getState());	
System.out.println("activeCount="+Thread.activeCount());
System.out.println("t1 NoRM_PRIORITY="+t1.NORM_PRIORITY);	
System.out.println("t2 NoRM_PRIORITY="+t2.NORM_PRIORITY);	
System.out.println("t3 NoRM_PRIORITY="+t3.NORM_PRIORITY);	
System.out.println("t4 NoRM_PRIORITY="+t4.NORM_PRIORITY);	
t4.setPriority(10);
t1.setPriority(1);
t1.start();
t4.start();
t3.start();
t2.start();
//t2.sleep(10000);
//t3.sleep(10000);
//t4.sleep(250000);
System.out.println("t1 getState="+t1.getState());	
System.out.println("t2 getState="+t2.getState());	
System.out.println("t3 getState="+t3.getState());	
System.out.println("t4 getState="+t4.getState());
System.out.println("activeCount="+Thread.activeCount());
System.out.println("currentThread="+Thread.currentThread());
System.out.println("t1.getId="+t1.getId());
System.out.println("t2.getId="+t2.getId());
System.out.println("t3.getId="+t3.getId());
System.out.println("t4.getId="+t4.getId());
System.out.println("t1 getState="+t1.getState());	
System.out.println("t2 getState="+t2.getState());	
System.out.println("t3 getState="+t3.getState());	
System.out.println("t4 getState="+t4.getState());
System.out.println("t1 	getPriority="+t1.	getPriority());	
System.out.println("t2 	getPriority="+t2.	getPriority());	
System.out.println("t3 	getPriority="+t3.	getPriority());	
System.out.println("t4 	getPriority="+t4.	getPriority());	
System.out.println("t1 getState="+t1.getState());	
System.out.println("t2 getState="+t2.getState());	
System.out.println("t3 getState="+t3.getState());	
System.out.println("t4 getState="+t4.getState());
}
}	