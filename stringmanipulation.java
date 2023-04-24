import java.util.*;

class StringManipulation {
    Scanner reader = new Scanner(System.in);

    public void getLength() {
        System.out.print("Enter the string:");
        String s1 = reader.next();
        int len = s1.length();
        System.out.print("Length=" + len);
    }

    public void joinstr() {
        System.out.print("Enter the first string:");
        String s1 = reader.next();
        System.out.print("Enter second string");
        String s2 = reader.next();
        String joinedString = s1.concat(s2);
        System.out.print("Joined string is:" + joinedString);
    }

    public void charextract() {
        System.out.print("Enter the string:");
        String s1 = reader.next();
        System.out.print("Enter the position of the character to be extracted in the string:");
        int a = reader.nextInt();
        char c = s1.charAt(a);
        System.out.print("The character is:" + c);
    }

    public void strcmp() {
        System.out.print("Enter the first string:");
        String s1 = reader.next();
        System.out.print("Enter second string");
        String s2 = reader.next();
        System.out.print("Enter the third string:");
        String s3 = reader.next();
        boolean result1 = s1.equals(s2);
        System.out.print("Strings first and second are equal:" + result1);
        boolean result2 = s1.equals(s3);
        System.out.print("Strings first and third are equal:" + result2);
    }

    public void subsearch() {
        System.out.print("Enter the string:");
        String s4 = reader.next();
        System.out.print("Enter the character to be searched in the string:");
        String a = reader.next();
        System.out.print("Last occurrence of character 'a' is found at:" + s4.lastIndexOf("a"));
        int first_in = s4.indexOf("a", 2);
        System.out.print("First occurrence of char 'a' after index 2:" + first_in);
    }
}

class stringmanipulation {

    public static void main(String[] args) {
        StringManipulation obj = new StringManipulation();
        Scanner reader = new Scanner(System.in);
          do
          {
            System.out.println("\n\n\n___MENU___\n1.Length of a String\n2.Join two Strings.\n3.Character extraction.\n4.String Comparison.\n5.Searching Substring.\n6.Exit. \n");
            System.out.println("Enter your choice:");
              int ch = reader.nextInt();
            
           
            switch (ch) {
                case 1:
                    obj.getLength();
                    break;
                case 2:
                    obj.joinstr();
                    break;
                case 3:
                    obj.charextract();
                    break;
                case 4:
                    obj.strcmp();
                    break;
                case 5:
                    obj.subsearch();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
          }while(true);
    }
}



