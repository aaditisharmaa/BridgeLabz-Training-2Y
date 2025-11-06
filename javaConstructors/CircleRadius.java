public class CircleRadius{
	double radius;
CircleRadius(){
this(0.0);
}
CircleRadius(double radius){
	this.radius = radius ;

}
public void display(){
	System.out.println("Radius:" + radius);
}
public static void main(String[] args){
 CircleRadius R1 = new CircleRadius();
 CircleRadius R2 = new CircleRadius(7.0);
R1.display();
R2.display();
}
}
