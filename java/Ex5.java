class Ex5{
String lanaguages;
Ex5(String lang){
lanaguages=lang;
System.out.println (lanaguages + "--- simple language haii");
}
public static void main (String args[]){
Ex5 obj1=new Ex5("SQL");
Ex5 obj2=new Ex5("Oracle");
Ex5 obj3=new Ex5("Maths");
}
}