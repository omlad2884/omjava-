class menu{
public void display(){
System.out.println("today's breakfast idli and sambhar");
}
}
class dosa extends menu{
public void display(){
System.out.println("today's breakfast includes Vadapav");
}
public void print(){
 super.display();
}
}
class mainmenu{
public static void main(String args[]){
dosa d=new dosa();
d.display();
d.print();
}
}