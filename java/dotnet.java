class course {
public void fees(){
int fee=5000;
System.out.println("course fees are"+fee);
}
}
class dotnet extends course{
public void fees(){
int fee= 6000;
System.out.println("course fees are"+fee);
}
}
class java extends course {
public void fees(){
int fee= 8000;
System.out.println("course fees are"+fee);
}
}
class courses {
public static void main(String args[]){
course E = new course();
course O = new dotnet();
course S = new java();

E.fees();
O.fees();
S.fees();
}
}