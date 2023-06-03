import java.util.*;

interface shape{
 void area();
 void perimeter();
}

class Circle implements shape{
 int r;
 public Circle(int r) {
  this.r = r;
 }
 public void area() {
  System.out.println(" ");
  System.out.println("Area of circle: "+(3.14*r*r));
 }
 public void perimeter() {
  System.out.println("Perimeter of circle: "+(2*3.14*r));
 }
}

class Rectangle implements shape{
 int l,b;
 public Rectangle(int l,int b){
  this.l=l;
  this.b=b;
 }
 public void perimeter(){
  int p=2*(l+b);
  System.out.println("Perimeter of Rectangle: "+p);
 }
 public void area() {
  System.out.println("Area of Rectangle: "+(l*b));
 }
}

public class Interface10{
 public static void main(String[] args){
  Scanner inp=new Scanner(System.in);
  int ch,x;
  int rad,l,b;
  System.out.println("1.Circle- Area and Perimeter");
  System.out.println("2.Rectangle- Area and Perimeter");
  System.out.println("3.Exit");
  do
  {
   System.out.println(" ");
   System.out.print("Enter your choice [1/2/3] : ");
   ch=inp.nextInt();
   switch(ch){
    case 1 :  System.out.println("Enter Radious of circle: ");
	      rad = inp.nextInt();
	      Circle obj1= new Circle(rad);
	      obj1.area();
	      obj1.perimeter();
	      break;
    case 2 :  System.out.println("Enter length of rectangle: ");
	      l=inp.nextInt();
	      System.out.println("Enter breadth of rectangle: ");
	      b=inp.nextInt();
	      Rectangle obj2= new Rectangle(l,b);
	      obj2.area();
	      obj2.perimeter();
	      break;
    case 3 :  System.out.println("THANK YOU !!!  "); 
              break;
    default:  System.out.println("WRONG CHOICE !!!");
   }
  System.out.println("Do You Wanna Continue ? (0/1): ");
  x=inp.nextInt();
 }while(x==1);
}
}

