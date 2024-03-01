class outerclass{
int x=20;
class innerclass{
int y=30;
}
}
class main{
public static void main(String args[]){
outerclass myo = new outerclass();
outerclass.innerclass myIc= myo.new innerclass();
System.out.println(myo.x + myIc.y);
}
}