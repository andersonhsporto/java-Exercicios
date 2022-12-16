import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int[] array = scanArray(n, scanner);
    scanner.close();

    printPairDiff(array, k);
  }

  public static int[] scanArray(int size, Scanner scanner) {
    int[] array = new int[size];

    for (int i = 0; i < size; i++) {
      array[i] = scanner.nextInt();
    }
    return array;
  }

  public static void printPairDiff(int[] array, int target) {
    int numberDiff = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] - array[j] == target || array[j] - array[i] == target) {
          numberDiff++;
        }
      }
    }
    System.out.println(numberDiff);
  }
  
};
