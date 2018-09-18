class Tcs
{
int id;
String name;
Tcs(int id,String name)
{
this.id=id;
this.name=name;
}
void empInfo()
{
System.out.println("emp id="+id);
System.out.println("emp name="+name);
}
static class Att
{
void attUpdate()
{
System.out.println("attUpdated sus");
}
}
}
