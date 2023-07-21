import java.util.Scanner;
import java.lang.Exception;
class usernameException extends Exception{
  usernameException(String message){
  System.out.println("message");
  }
 } 
class PasswordException extends Exception{
  PasswordException(String message){
  System.out.println("message");
  }
 }  
 
 public class usernamepass{
   public static void main(String args[]){
      Scanner reader = new Scanner(System.in);
      String username,password;
      System.out.println("Enter the username");
      username = reader.nextLine();
      System.out.println("Enter the password");
      password = reader.nextLine();
      int len = username.length();
      try{
        if(len < 8){
           throw new usernameException("Username must be > 8 characters\n");
         }  
        else if(!password.equals("admin")){
            throw new PasswordException("Incorrect password\n"); 
        }
               
        else{
             System.out.println("login successful");
        }     
      }
     catch(usernameException u){
            System.out.println("login successful");     
     } 
     catch(PasswordException p){
            System.out.println("login successful");     
     }   
   }
  }
      
      
