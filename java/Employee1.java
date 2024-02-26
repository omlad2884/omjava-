class Employee{
private int age ;
private String name;
private int Eid;
public String getName(){
return name;
}
public int getage(){
return age;
}
public int getEid(){
return Eid;
}
public void setName(String newName){
this.name = newName;
}
public void setAge(int age){
this.age=age;
}
public void setEid(int Eid){
this.Eid = Eid; 
}
}
class Employee1{
public static void main (String args[]){ 
Employee e = new Employee ();
e.setName("RAJ");
e.setAge(24);
e.setEid(35);
System.out.println("Your Name is"+ e.getName());
System.out.println("Your Age is "+ e.getage());
System.out.println("Your Eid is "+ e.getEid());
}
}