class shape{
public void draw(){
System.out.println("drawing a shape");
}
}
class circle extends shape{
public void draw(){
System.out.println("drawing a circle");
}
}
class square extends shape{
public void draw(){
System.out.println("drawing a square");
}
}
class main{
public static void main(String args[]){
shape s1 = new circle();
shape s2 = new square();
s1.draw();
s2.draw();
}
}