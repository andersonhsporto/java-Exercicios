import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    printLine(scanner, N);
  }

  public static void printLine(Scanner scanner, int size) {
    for (int i = 0; i < size; i++) {
      String line = readLine(scanner);
      System.out.println(decript(line));
    }
  }

  public static String readLine(Scanner scanner) {
    String line = scanner.nextLine();
    while (line.isEmpty()) {
      line = scanner.nextLine();
    }
    return line;
  }
  
    public static String decript(String line) {
    StringBuilder sb = new StringBuilder();

    sb.append(line, 0, line.length() / 2).reverse();
    sb.append(new StringBuilder(line.substring(line.length() / 2)).reverse());
    return sb.toString();
  }

};
