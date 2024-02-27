public class Account {
    private final int number;
    private final String agency;
    private final String clientName;
    private final double balance;

    public Account(
        int number,
        String agency,
        String clientName,
        double balance
    ) {
        this.number = number;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public String getAgency() {
        return agency;
    }

    public String getClientName() {
        return clientName;
    }

    public double getBalance() {
        return balance;
    }
}
