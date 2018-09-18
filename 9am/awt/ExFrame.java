import java.awt.*;
class MyGui extends Frame
{	
MyGui()
{            
super("WELCOME");
setLayout(new FlowLayout());
Label l=new Label("WELCOME TO OUR GUI DEV");
Label l1=new Label("userId");
Label l2=new Label("password");
TextField tf=new TextField(8);
TextField tf1=new TextField(8);
tf1.setEchoChar('@');
Button b1=new Button("LOGIN");
Button b2=new Button("reset");
Button b3=new Button("Exit");
Label l3=new Label("Enter sudent address");
TextArea ta=new TextArea(8,15);
Label l4=new Label("Avl Courses at NareshIt");
 List lst = new List(6,true);
 lst.add("java");
 lst.add("oracle");
 lst.add("c lan");
 lst.add("c++ lan");
 lst.add("Html");
 lst.add("PHP");
 lst.add("Hadoop");
 lst.add("Pega");
 lst.add("Dev apps");
 lst.add("Aws");
 Label l5=new Label("Selected option");
 Choice ch = new Choice();
 ch.add("java");
 ch.add("oracle");
 ch.add("c lan");
 ch.add("c++ lan");
 ch.add("Html");
 ch.add("PHP");
 ch.add("Hadoop");
 ch.add("Pega");
 ch.add("Dev apps");
 ch.add("Aws");
 Checkbox cb1=new Checkbox("DEVAPPS",true);
 Checkbox cb2=new Checkbox("java");
 Checkbox cb3=new Checkbox("aws",false);
CheckboxGroup cbg = new	CheckboxGroup();		
Checkbox check1 = new Checkbox("java",cbg,true);
Checkbox check2 = new Checkbox("dbms",cbg,false);
Checkbox check3 = new Checkbox("se",cbg,false);
Canvas can1 = new Canvas();
can1.setSize(200,100);
can1.setBackground(Color.red);
add( can1 );
MenuBar mbar = new MenuBar();
setMenuBar(mbar);
Menu file = new Menu("File");
MenuItem item1, item2, item3, item4, item5;
file.add(item1 = new MenuItem("New..."));
file.add(item2 = new MenuItem("Open..."));
file.add(item3 = new MenuItem("Close"));
file.add(item4 = new MenuItem("SAVE"));
file.add(item5 = new MenuItem("Quit..."));
mbar.add(file); 
add(l);
add(l1);
add(tf);
add(l2);
add(tf1);
add(l3);
add(ta);
add(l4);
add(lst);
add(l5);
add(ch);
add(cb1);
add(cb2);
add(cb3);
add( check1 );
add( check2 );
add( check3 );
add(b1);
add(b2);
add(b3);
setSize(220,800);
setVisible(true);
		}
}
class ExFrame
{
	public static void main( String args[] )
	{
		 new MyGui();
	   }
}

