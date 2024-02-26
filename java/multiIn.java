class multiIn {
public static void main
(String args[]){
mleIn obj=new mleIn();
obj.display();
obj.show();
obj.dis();
}
}
class mtIn{
void display(){
System.out.println("parent/base class ");
}
}
class mlin extends mtIn{
void show(){
System.out.println("derieved class from mtIn");
}
}
class mleIn extends mlin{
void dis(){
System.out.println("derieved class from mlin");
}
}