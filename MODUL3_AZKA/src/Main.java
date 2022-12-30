import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args){
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        Calculation hitung = new Calculation();

    do {
      try {
        System.out.println("\n===== MENU =====");
        System.out.println("\n1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
        System.out.println("0. Exit");
        System.out.print("\nSelect menu: ");
        int nomor = input.nextInt();

        switch (nomor) {
          case 1:
            System.out.print("\nEnter the length of the side of the square : ");
            double sisi = input.nextDouble();
            hitung.setSquare(sisi);
            hitung.run();
            System.out.println("\nThe Result Is: " + hitung.getSquare());
            break;
          case 2:
            System.out.print("\nEnter The Radius Of The Circle : ");
            double radius = input.nextDouble();
            hitung.setCircle(radius);
            hitung.run();
            System.out.println("\nThe Result Is: " + hitung.getCircle());
            break;
          case 3:
            System.out.print("\nEnter The Upper Side Of The Trapezoid : ");
            double a = input.nextDouble();
            System.out.print("Enter The Side Of The Base Of The Trapezoid : ");
            double b = input.nextDouble();
            System.out.print("Enter The Height Of The Trapezoid : ");
            double t = input.nextDouble();
            hitung.setTrapezoid(a, b, t);
            hitung.run();
            System.out.println("\nThe Result Is: " + hitung.getTrapezoid());
            break;
          case 0:
            System.out.println("\n===== PROGRAM ENDED =====");
            break;
          default:
            System.out.println("\nOption Menu Not Available");
            continue;
        }
        repeat = false;
      } catch (InputMismatchException e) {
        System.out.println("\n==== Error: Please Input Wiht A Integer ====");
        input.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    } while (repeat);

    input.close();
    }
}
