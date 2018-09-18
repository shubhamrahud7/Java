class Emp
{
int age;
String name;
char gen;
synchronized void printEmpInfo(int age,String name,char gen)
{
     System.out.println(name);
     try{
      Thread.sleep(400);
     }
catch(Exception e)
{System.out.println(e);}
System.out.println(age);
System.out.println(gen);
  }
}
 
class MyThread1 extends Thread
{
Emp e;
MyThread1(Emp e)
{
this.e=e;
}
public void run()
{
e.printEmpInfo(22,"balu",'m');
}
}


class MyThread2 extends Thread{
Emp e;
MyThread2(Emp e){
this.e=e;
}
public void run(){
e.printEmpInfo(20,"swetha",'f');
}
}
 
class TestSynchronization
{
public static void main(String args[])
{
Emp obj = new Emp();//only one object
MyThread1 t1=new MyThread1(obj);
MyThread2 t2=new MyThread2(obj);
t1.start();
t2.start();
}
}
