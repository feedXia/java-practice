// You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

// Examples

// [2, 4, 0, 100, 4, 11, 2602, 36]
// Should return: 11 (the only odd number)

// [160, 3, 1719, 19, 11, 13, -21]
// Should return: 160 (the only even number)
import java.util.ArrayList;

public class FindOutlier {
  static int find(int[] integers) {
    ArrayList<Integer> even = new ArrayList<Integer>();
    ArrayList<Integer> odd = new ArrayList<Integer>();
    for (int i = 0; i < integers.length; i++) {
      if (integers[i] % 2 == 0)
        even.add(integers[i]);
      else
        odd.add(integers[i]);
    }
    int evenSize = even.size();
    return evenSize == 1 ? even.get(0) : odd.get(0);
  }

  // Test
  public static void main(String[] args) {
    int[] exampleTest2 = { 206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781 };
    System.out.println(FindOutlier.find(exampleTest2));
  }
}

// public class OutlierTest {
// @Test
// public void testExample() {
// int[] exampleTest1 = { 2, 6, 8, -10, 3 };
// int[] exampleTest2 = { 206847684, 1056521, 7, 17, 1901, 21104421, 7, 1,
// 35521, 1, 7781 };
// int[] exampleTest3 = { Integer.MAX_VALUE, 0, 1 };
// assertEquals(3, FindOutlier.find(exampleTest1));
// assertEquals(206847684, FindOutlier.find(exampleTest2));
// assertEquals(0, FindOutlier.find(exampleTest3));
// }
// }

// Alternative Solutions

// 1

// import java.util.Arrays;

// public class FindOutlier{
// static int find(int[] integers){
// int[] odd = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();
// int[] even = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray();

// return odd.length == 1 ? odd[0] : even[0];
// }
// }

// 2

// public class FindOutlier{
// static int find(int[] integers) {
// int even = 0;
// int odd = 0;
// int cycle = 0;

// for(Integer value : integers) {
// if(value % 2 == 0) {
// cycle++;
// even = value;
// }else {
// odd = value;
// }
// }
// return (cycle > 1) ? odd : even;
// }
// }

// 3

// import java.util.Arrays;

// public class FindOutlier{
// public static int find(int[] integers) {
// // Since we are warned the array may be very large, we should avoid counting
// values any more than we need to.

// // We only need the first 3 integers to determine whether we are chasing odds
// or evens.
// // So, take the first 3 integers and compute the value of Math.abs(i) % 2 on
// each of them.
// // It will be 0 for even numbers and 1 for odd numbers.
// // Now, add them. If sum is 0 or 1, then we are chasing odds. If sum is 2 or
// 3, then we are chasing evens.
// int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
// int mod = (sum == 0 || sum == 1) ? 1 : 0;

// return Arrays.stream(integers).parallel() // call parallel to get as much
// bang for the buck on a "large" array
// .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
// }
// }