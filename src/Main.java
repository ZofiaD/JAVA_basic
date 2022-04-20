import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Jak masz na imię?");
      String name = scanner.nextLine();
      System.out.println("Cześć, " + name + " Jak masz na nazwisko?");
      String surname = scanner.nextLine();
      System.out.println(surname + " fajne nazwisko, a ile masz lat?");
      int age = scanner.nextInt();
      if (age >= 18) {
          System.out.println(age + " ale super! To kupisz mi piwo?");
      } else {
          System.out.println(age + " to lipa, dzisiaj nie pijemy");
      }

    }
}
