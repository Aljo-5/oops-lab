import java.util.*;
class A{
 int a,b;
 double r;
 int area(int a1){
  this.a=a1;
  return(a*a);
 }
 int area(int l,int b){
  this.a=l;
  this.b=b;
  return(a*b);
 }
 double area(double r){
  this.r=r;
  return(r*r*3.14);
 }
}
class Area{
 public static void main(String args[]){
  int a1,l,b,ch,x;
  Scanner inpt=new Scanner(System.in);
  Scanner inp=new Scanner(System.in);
  double r;
  A Obj=new A();
  do{
   System.out.println("\n M E N U \n");
   System.out.println(" 1. Area of Square. ");
   System.out.println(" 2. Area of Rectangle. ");
   System.out.println(" 3. Area of Circle. ");
   System.out.println(" 4. Exit ");
   System.out.println(" Enter Your Choice [1-4] : \n");
   ch=inpt.nextInt();
   switch(ch){
   case 1:System.out.println(" Enter Side of Square : ");
          a1=inp.nextInt();
          System.out.println(" Area Of Square : "+Obj.area(a1));
          break;
   case 2:System.out.println(" Enter Length and Breadth of Rectangle: ");
          l=inp.nextInt();
          b=inp.nextInt();
          System.out.println(" Area Of Rectangle : "+Obj.area(l,b));
          break;
   case 3:System.out.println(" Enter Radius of Circle : ");
          r=inp.nextDouble();
          System.out.println(" Area Of Circle : "+Obj.area(r));
          break;
   case 4:System.out.println("\n\n T H A N K    Y O U \n");
          break;   
   default:System.out.println("\n Wrong Choice ");
   }
    System.out.println("\n Doy You Want to Continue [0/1] : ");
    x=inpt.nextInt();
  }while(x==1);                 
 }  
}  
