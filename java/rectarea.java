class rect{
int l,b;
public void getarea(){
int area=l*b;
}}
class rectarea extends rect{
public static void main (String args[]){
rect area = new rect();
area.getarea();
System.out.println(area);
}
}