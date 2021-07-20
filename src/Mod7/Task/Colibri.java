package Mod7.Task;


class Colibri extends Bird implements ICanFly {
    protected Colibri(String species, String food) {
        super(species, food);
    }

    @Override
    protected void info() {
        super.info();
        fly();
    }

    @Override
    public void fly() {
        super.also();
        ICanFly.super.fly();
        super.dot();
    }
}
