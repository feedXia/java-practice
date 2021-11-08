// Usually when you buy something, you're asked whether your credit card number,
// phone number or answer to your most secret question is still correct.
// However, since someone could look over your shoulder, you don't want that
// shown on your screen. Instead, we mask it.

// Your task is to write a function maskify, which changes all but the last four
// characters into '#'.

// Examples

// Maskify.Maskify("4556364607935616"); // should return "############5616"
// Maskify.Maskify("64607935616"); // should return "#######5616"
// Maskify.Maskify("1"); // should return "1"
// Maskify.Maskify(""); // should return ""

// // "What was the name of your first pet?"
// Maskify.Maskify("Skippy"); // should return "##ippy"
// Maskify.Maskify("Nananananananananananananananana Batman!"); // should return
// "####################################man!"

public class Maskify {
  public static String maskify(String str) {
    if (str.length() > 3) {
      String hash = new String(new char[str.length() - 4]).replace("\0", "#");
      String substring = str.substring(str.length() - 4);
      System.out.println(hash + substring);
      return hash + substring;
    } else {
      System.out.println(str);
      return str;
    }

  }

  public static void main(String[] args) {
    Maskify.maskify("4556364607935616");
    // => "############5616"
    Maskify.maskify("64607935616");
    // => "#######5616"
    Maskify.maskify("Nananananananananananananananana Batman!");
    // => "####################################man!"

    // assertEquals("1", Maskify.maskify( "1"));
    // assertEquals("", Maskify.maskify( ""));
    // assertEquals("##ippy", Maskify.maskify("Skippy") );

  }
}

// Alternative Solutions

// public class Maskify {
//   public static String maskify(String str) {
//       if (str.length() <= 4) return str;
//       String result = "";
//       for (int i = 0; i < str.length()-4; i++) {
//           result += "#";
//       }
//       return result + str.substring(str.length()-4);
//   }
// }

// public class Maskify {
//   public static String maskify(String str) {
//       return str.replaceAll(".(?=.{4})", "#");
//   }
}