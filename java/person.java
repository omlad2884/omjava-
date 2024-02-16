class person{
protected String name= "Aditya";
protected int age=19;
protected String email="abc@gmail.com";
}
class student extends person{
private String address= "kalwa";
public static void main (String args[]){

student obj= new student ();
System.out.println(" My name is "+ obj.name);
System.out.println(" My age is "+ obj.age);
System.out.println(" My email is "+obj.email);
System.out.println(" My address is "+ obj.address);
}
}