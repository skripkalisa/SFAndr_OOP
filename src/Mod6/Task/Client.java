package Mod6.Task;

public class Client extends Company {
    static int countClients = 0;
    static int income = 0;
    String name;
    String status;

    Client() {
        super("Client", true);
    }

    protected Client(String name, String status) {
        super("Client", true);
        this.name = name;
        this.status = status;
        countClients++;
        message();
    }

    private void message() {
        System.out.println("Hooray! We have a new customer!");
        System.out.println("Total number of customers: " + countClients);
    }

    protected void purchase(int amount) {
        income += amount;
        System.out.printf("Our customer, %s %s has purchased goods for %d$.\n", this.status, this.name, amount);
        System.out.printf("The company income is %d.\n", income);
    }
}
