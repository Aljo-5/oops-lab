import java.util.Scanner;
import Pack11.*;
public class Package11{
 public static void main(String[] args) {
 System.out.println("Program 11: Packages");
 System.out.println(" ");
 Scanner inp=new Scanner(System.in);
 boolean res=true;
 int ch;
 int rad,l,b,h;
 System.out.println(" M E N U ");
 System.out.println("1.Area of Circle");
 System.out.println("2.Area of Rectangle");
 System.out.println("3.Area of Square");
 System.out.println("4.Area of Triangle");
 System.out.println("5.Exit");
 while(res){
  System.out.println(" ");
  System.out.print("Enter your choice [1-5]: ");
  System.out.println(" ");
  ch=inp.nextInt();
  switch(ch){
   case 1: System.out.print("Enter Radious of circle: ");
	   rad=inp.nextInt();
	   Circle1 c=new Circle1();
	   c.area(rad);
           break;
   case 2: System.out.print("Enter length of rectangle: ");
	   l=inp.nextInt();
	   System.out.print("Enter width of rectangle: ");
	   b=inp.nextInt();
	   Rectangle1 r=new Rectangle1();
	   r.area(l,b);
	   break;
   case 3: System.out.print("Enter side of Square: ");
	   l=inp.nextInt();
           Square1 s=new Square1();
           s.area(l);
           break; 
   case 4: System.out.print("Enter base of triangle: ");
	   b = inp.nextInt();
	   System.out.print("Enter height of triangle: ");
	   h = inp.nextInt();
	   Triangle1 t=new Triangle1();
	   t.area(b,h);
	   break;
   case 5: res = false;
	   break;
   default:System.out.println(" Unexpected value");
   }
  }
 }
}
