package Mod7.Battle;

public class Zombie extends Monster implements Fighter {

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    public void growl() {
        System.out.println("Raaaauuughhhh");
    }

//    @Override
//    public void attack(Monster monster) {
//        monster.damage(getForce());
//        growl();
//    }

    @Override
    public void attack(Entity victim) {
        victim.damage(getForce());
    }
}
