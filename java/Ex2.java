class Ex2{
private String name;
Ex2(){
System.out.println("consrtuctor has called");
name= "OM";
}
public static void main (String args[]){
Ex2 obj=new Ex2();
System.out.println("the name is:"+obj.name);
}
}
