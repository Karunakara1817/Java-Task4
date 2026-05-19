import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base currency (USD/INR/EUR): ");
        String base = sc.next().toUpperCase();

        System.out.print("Enter target currency (USD/INR/EUR): ");
        String target = sc.next().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double rate = 0;

        if (base.equals("USD") && target.equals("INR")) {
            rate = 83.45;
        } else if (base.equals("INR") && target.equals("USD")) {
            rate = 0.012;
        } else if (base.equals("USD") && target.equals("EUR")) {
            rate = 0.92;
        } else if (base.equals("EUR") && target.equals("USD")) {
            rate = 1.08;
        } else if (base.equals(target)) {
            rate = 1;
        } else {
            System.out.println("Conversion not available");
            return;
        }

        double convertedAmount = amount * rate;

        System.out.println("Converted Amount: " + convertedAmount + " " + target);

        sc.close();
    }
}