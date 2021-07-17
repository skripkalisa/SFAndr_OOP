package Mod7.Task;


class Colibri extends Bird implements ICanFly {
    protected Colibri(String species, String food) {
        super(species, food);
    }

    protected void info() {
        System.out.print("Hello, I'm " + species + " and I eat " + food + ". ");
        fly();
    }

    @Override
    public void fly() {
        System.out.println("Also, I can fly.");
    }

}
