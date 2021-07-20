package Mod6.Task;

  class Client extends Company {
    private static int countClients = 0;
    private static int income = 0;
    private String name;
    private String status;

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
    @Override
    protected void message() {
        System.out.println("Hooray! We have a new customer!");
        System.out.println("Total number of customers: " + countClients);
    }

      @Override
      protected void action() {

      }

      protected void purchase(int amount) {
        income += amount;
        System.out.printf("Our customer, %s %s has purchased goods for %d$.\n", this.status, this.name, amount);
        System.out.printf("The company income is %d.\n", income);
    }
}
