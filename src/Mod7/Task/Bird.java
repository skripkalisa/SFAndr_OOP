package Mod7.Task;

abstract class Bird {
    protected String species = "an abstract bird";
    protected String food = "abstract food";

    protected Bird(String species, String food) {

        this.species = species;
        this.food = food;
    }

    protected Bird() {
    }

    protected void info() {
        System.out.println("\nHello, I'm " + species + " and I eat " + food + ".");
    }

    protected void also() {
        System.out.print("Also, ");
    }

    protected void comma() {
        System.out.print(", ");
    }

    protected void dot() {
        System.out.println(".");
    }
}
