import java.util.*;

class Person{
 String name,gender,address;
 int age;
 Person(String name,String gender,String address,int age){
  this.name = name;
  this.gender = gender;
  this.address = address;
  this.age = age;
 }
 void display(){
  System.out.println("\n\n");
  System.out.println("Name: " + name + ", Gender: " + gender + ", Address: " + address + " and Age " + age);
 }
}

class Employee extends Person{
 String Company_name, Qualification, Salary;
 int Empid;
 Employee(String name,String gender,String address,int age,String Company_name,String Qualification,String Salary,int Empid){
  super(name,gender,address,age);
  this.Company_name = Company_name;
  this.Qualification = Qualification;
  this.Salary = Salary;
  this.Empid = Empid;
 }
 void display() {
  super.display();
  System.out.println(" ");
  System.out.println("Company_name: " + Company_name + ", Qualification: " + Qualification + ", Salary: " + Salary + " and Empid " +  Empid);
 }
}

class Teacher extends Employee{
 String Subject, Department;
 int Teacherid;
 Teacher(String name,String gender,String address,int age,String Company_name,String Qualification,String Salary,int Empid,
         String Subject,String Department,int Teacherid){
  super(name,gender,address,age,Company_name,Qualification,Salary,Empid);
  this.Subject = Subject;
  this.Department = Department;
  this.Teacherid = Teacherid;
 }
 void display() {
  super.display();
  System.out.println(" ");
  System.out.println("Subject: " + Subject + ", Department: " + Department + " and Teacherid: " + Teacherid);
 }
}

class Inheritance9{
 public static void main(String[] args) {
  Scanner inp=new Scanner(System.in);
  System.out.println("Enter Number of teachers: ");
  int n=inp.nextInt();
  Teacher obj[]=new Teacher[n];
  for(int i=0;i<n;i++) 
  {
   System.out.print("Enter Person Name: ");
   String name=inp.next();
   System.out.print("Enter Person Age: ");
   int age=inp.nextInt();
   System.out.print("Enter Person Gender: ");
   String Gender=inp.next();
   System.out.print("Enter Person Address: ");
   String Address=inp.next();
   System.out.print("Enter Employee Company_name: ");
   String Company_name=inp.next();
   System.out.print("Enter Employee Empid: ");
   int Empid=inp.nextInt();
   System.out.print("Enter Employee Qualification: ");
   String Qualification=inp.next();
   System.out.print("Enter Employee Salary : ");
   String Salary=inp.next();
   System.out.print("Enter TeacherID: ");
   int tid=inp.nextInt();
   System.out.print("Enter Teacher Subject: ");
   String Subject=inp.next();
   System.out.print("Enter Teacher Department : ");
   String Department=inp.next();
   obj[i] = new Teacher(name, Gender, Address,age,Company_name,Qualification,Salary,Empid,Subject,Department,tid);
   System.out.println(" ");
  }
  for(int i=0;i<n;i++)
  {
   obj[i].display();
  }
 }
}

