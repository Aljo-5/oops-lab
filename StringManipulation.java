public class StringManipulation {
public static void main(String[] args) {
// Create a sample string
String sample = "Hello, world!";

// Print original string
System.out.println("Original String: " + sample);

// Convert to uppercase
String upperCase = sample.toUpperCase();
System.out.println("Uppercase String: " + upperCase);

// Convert to lowercase
String lowerCase = sample.toLowerCase();
System.out.println("Lowercase String: " + lowerCase);

// Replace characters in string
String replaced = sample.replace("o", "9");
System.out.println("Replaced String: " + replaced);

// Get length of string
int length = sample.length();
System.out.println("Length of String: " + length);

// Extract a substring
String substring = sample.substring(7, 12);
System.out.println("Substring: " + substring);
}
}
