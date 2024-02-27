import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\nWelcome to the DioBank!!!");

        System.out.println("\nPlease, enter your Name:");
        String name = input.nextLine();

        System.out.println("\nPlease, enter your Agency:");
        String agency = input.nextLine();

        System.out.println("\nPlease, enter your Account Number:");
        int accountNumber = input.nextInt();

        System.out.println("\nPlease, enter your Balance:");
        double balance = input.nextDouble();

        Account account = new Account(
            accountNumber, agency, name, balance
        );

        System.out.printf("""
            \nHello '%s', thank you for creating an\s
            account with our bank, your branch is '%S',\s
            account '%d' and your balance '%.2f' is\s
            now available for withdrawal.
            """,
            account.getClientName(),
            account.getAgency(),
            account.getNumber(),
            account.getBalance()
        );
    }
}
