package Mod7.Task;

public class Main {
    private void Birds(){

    }
    public static void main(String[] args) {

        Kiwi littleKiwi = new Kiwi();
        littleKiwi.info();
        Kiwi kiwi = new Kiwi("Kiwi pukupuku", "worms and beetles");
        kiwi.info();
        Colibri colibri = new Colibri("Colibri hummingbird", "bugs and nectar");
        colibri.info();
        Penguin penguin = new Penguin("Emperor penguin", "squids and fish");
        penguin.info();
        Ostrich ostrich = new Ostrich("Common ostrich", "roots, leaves, and seeds");
        ostrich.info();
        Swan swan = new Swan("Black Swan", "roots, tubers, stems and leaves");
        swan.info();
        swan.fly();
        swan.run();
        swan.swim();
        System.out.println("");

        Sportsman sportsman = new Sportsman("Sportsman", "competitions");
        sportsman.info();
        sportsman.activities();

        System.out.println("");

        Aircraft plain = new Aircraft("plain", "civil");
        plain.info();
//        plain.fly();
    }
}
