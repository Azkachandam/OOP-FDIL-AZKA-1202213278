import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        Restaurant dapur = new Restaurant();
        try {
            System.out.print("Enter Customer ID: ");
            int customerID = masukan.nextInt();
            System.out.print("Enter How Much Food To Made: ");
            int orderQty = masukan.nextInt();
            Thread t0 = new Thread(dapur);
            Waiters pelayan = new Waiters(customerID, orderQty);
            Thread t1 = new Thread(pelayan);
            t0.start();
            t1.start();
            t0.join();
            t1.join();
        } catch (Exception e) {
            System.out.println("Input Must Be Integer");
        }
    }
}