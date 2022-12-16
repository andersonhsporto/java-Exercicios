import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    float number = scanNumber();
    
    bankNoteDecompose(number);
    coinDecompose(number);
  }

  public static float scanNumber() {
    Scanner scanner = new Scanner(System.in);
    float number = scanner.nextFloat();

    scanner.close();
    return number;
  }

  public static void bankNoteDecompose(float number) {
    int hundred = (int) (number / 100);
    int fifty = (int) (number % 100 / 50);
    int twenty = (int) (number % 50 / 20);
    int ten = (int) (number % 20 / 10);
    int five = (int) (number % 10 / 5);
    int two = (int) (number % 5 / 2);
    
    System.out.println("NOTAS:");
    System.out.println(hundred + "\tnota(s) de R$ 100,00");
    System.out.println(fifty + "\tnota(s) de R$ 50,00");
    System.out.println(twenty + "\tnota(s) de R$ 20,00");
    System.out.println(ten + "\tnota(s) de R$ 10,00");
    System.out.println(five + "\tnota(s) de R$ 5,00");
    System.out.println(two + "\tnota(s) de R$ 2,00");
  }

  public static void coinDecompose(float number) {
    int one = (int) (number % 2);
    int fiftyCents = (int) (number % 1 / 0.5);
    int twentyFiveCents = (int) (number % 0.5 / 0.25);
    int tenCents = (int) (number % 0.25 / 0.1);
    int fiveCents = (int) (number % 0.1 / 0.05);
    int oneCent = (int) (number % 0.05 / 0.01);

    System.out.println("MOEDAS:");
    System.out.println(one + "\tmoeda(s) de R$ 1,00");
    System.out.println(fiftyCents + "\tmoeda(s) de R$ 0,50");
    System.out.println(twentyFiveCents + "\tmoeda(s) de R$ 0,25");
    System.out.println(tenCents + "\tmoeda(s) de R$ 0,10");
    System.out.println(fiveCents + "\tmoeda(s) de R$ 0,05");
    System.out.println(oneCent + "\tmoeda(s) de R$ 0,01");
  }
};
