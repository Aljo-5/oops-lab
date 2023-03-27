import java.util.Arrays;

public class sortStrings {
public static void main(String[] args) {
String[] words = {"orange", "banana", "apple", "peach", "grape"};

// Sort the array in alphabetical order
Arrays.sort(words);

// Print the sorted array
for (String word : words) {
System.out.println(word);
}
}
}
