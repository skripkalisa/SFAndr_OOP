package Mod7.Task;

abstract class Human {
    protected String description = "an abstract person";
    protected String activity = "doing nothing";

    protected Human(String description, String activity) {

        this.description = description;
        this.activity = activity;
    }

    protected void info() {
        System.out.println("\nHello, I'm " + description + " and I like " + activity + ".");
    }

}
