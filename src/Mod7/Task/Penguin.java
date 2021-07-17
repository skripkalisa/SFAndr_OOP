package Mod7.Task;

public class Penguin extends Bird implements ICanSwim{
    protected Penguin(String species, String food) {
        super.species = species;
        super.food = food;
    }

    protected void info() {
        System.out.print("Hello, I'm " + species + " and I eat " + food + ". ");
        swim();
    }

    @Override
    public void swim() {
        System.out.println("Also, I can swim.");
    }
}
