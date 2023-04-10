import java.util.Scanner;
public class employee{
  private int eno;
  private String ename;
  private double esalary;

  public employee(int no,String name,double salary){
    eno=no;
    ename=name;
    esalary=salary;
  }
  public String toString(){
    return "employee[eno="+eno +",ename="+ename +",esalary="+esalary +"]";
   }
  
  public static void main(String args[]){
    int n,choice,searchEno;
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the number of employees");  
    n=input.nextInt();
    employee[] employees=new employee[n];
    for(int i=0;i<n;i++){
       System.out.print("\nEnter employee number");
       int no = input.nextInt();
       input.nextLine();
       System.out.print("Enter employee name: ");
       String name = input.nextLine();
       System.out.print("Enter employee salary: ");
       double salary = input.nextDouble();

       employees[i] = new employee(no, name, salary);
      }
    while(true){
      System.out.print("\nChoose option:\n1.Search by employee number\n2.exit\n");
      choice=input.nextInt();
      
    if (choice == 1) {
      System.out.print("\nEnter employee number to search: ");
      searchEno = input.nextInt();
      boolean found = false;
      for (employee emp : employees) {
          if (emp.eno == searchEno) {
            System.out.println(emp);
            found = true;
              break;
           }
        }
      if (!found) {
       System.out.println("Employee not found with eno: " + searchEno);
      }
    } else if (choice == 2) {
         break;
       } else {
         System.out.println("Invalid option. Try again.");
       }
    }
  System.out.println("Exiting menu ...");
 }
}

      
