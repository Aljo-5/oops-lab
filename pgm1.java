class product
{
  int p_code;
  String p_name;
  int p_price;
 product(int pc,String pn,int pr)
  {
    p_code = pc;
    p_name = pn;
    p_price = pr;
  }
 
  void display()
   {
     System.out.println("product name:"+p_name+"\n"+"product code:"+p_code+"\n"+"product price:"+p_price);
     System.out.println("\n");
   }
}

class pgm1
{
 public static void main(String args[])
   {
     product p1 = new product(101,"orange",160);
     p1.display();
     product p2 = new product(102,"banana",130);
     p2.display();
     product p3 = new product(103,"mango",190);
     p3.display();
     
    if(p1.p_price < p2.p_price && p1.p_price < p3.p_price){
    System.out.println("product 1 is having the lowest price");
    }
    else if(p2.p_price < p1.p_price && p2.p_price < p3.p_price){
    System.out.println("product 2 is having the lowest price");
    }
    else{
    System.out.println("product 3 is having the lowest price");
    }
   }
}    
