package Mod7.Task;

class Sportsman extends Human implements ICanRun, ICanSwim {

    Sportsman(String description, String activity) {
        super(description, activity);
    }

    protected void activities() {
        swim();
        run();
    }

}
