class SataticInnerDemo
{
public static void main(String args[])
{
Abc a=new Abc();
a.m1();
//a.m2();
//Xyz c=new Xyz();
Abc.Xyz c=new Abc.Xyz();
c.m2();
}
}	