import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    int[] nums = scanArray();
    int[] even = evenArray(nums);
    int[] odd = oddArray(nums);

    printCrescentArray(Arrays.stream(even).sorted().toArray());
    printDecrescentArray(Arrays.stream(odd).sorted().toArray());
  }

  public static int[] scanArray() {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] array = new int[size];

    for (int i = 0; i < size; i++) {
      array[i] = scanner.nextInt();
    }
	System.out.println("");
    return array;
  }

  public static int[] oddArray(int[] nums) {
    return Arrays.stream(nums).filter(n -> n % 2 != 0).toArray();
  }

  public static int[] evenArray(int[] nums) {
    return Arrays.stream(nums).filter(n -> n % 2 == 0).toArray();
  }

  public static void printCrescentArray(int[] nums) {
    for (int num : nums) {
      System.out.println(num);
    }
  }

  public static void printDecrescentArray(int[] nums) {
    for (int i = nums.length - 1; i >= 0; i--) {
      System.out.println(nums[i]);
    }
  }

};
