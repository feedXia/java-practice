// Write a function named repeater() that takes two arguments (a string and a number), and returns a new string where the input string is repeated that many times.

// Example: (Input1, Input2 --> Output)

// "a", 5 --> "aaaaa"

public class Repeater{
  public static String repeat(String string,long n){
    StringBuilder sb= new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(string);
    }
  return sb.toString();
  }
}

// Tests
Repeater.repeat("a",5);
// => "aaaaa"
Repeater.repeat("Na",16);
// => "NaNaNaNaNaNaNaNaNaNaNaNaNaNaNaNa"
Repeater.repeat("Wub ",6);
// => "Wub Wub Wub Wub Wub Wub "

// Alternative Solutions
public class Repeater {
  public static String repeat(String string, int n) {
    return new String(new char[n]).replace("\0", string);
  }
}

public class Repeater {
  public static String repeat(String string, long n) {
    return string.repeat((int)n);
  }
}