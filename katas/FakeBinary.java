package katas;

// Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.

// Note: input will never be an empty string

public class FakeBinary {
    public static String fakeBin(String numberString) {
        String fakeBinaryString = numberString.replaceAll("[5-9]", "9").replaceAll("[0-4]", "0").replaceAll("[5-9]",
                "1");
        return fakeBinaryString;
    }

    public static void main(String[] args) {
        FakeBinary.fakeBin("45385593107843568");
        // => "01011110001100111"
    }
}

// Aternate Solutions
// public class FakeBinary {
// public static String fakeBin(String s) {
// return s.replaceAll("[1-4]","0").replaceAll("[^0]","1");
// }
// }

// public class FakeBinary {
// public static String fakeBin(String numberString) {
// return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
// }
// }