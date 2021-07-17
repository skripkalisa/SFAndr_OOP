package Mod7.Battle;

public abstract class Monster extends Entity implements Fighter{

    private int force;


    public Monster(String name, int force) {
        super(name);
//        super.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    protected int getForce(){
        return force;
    }

}
