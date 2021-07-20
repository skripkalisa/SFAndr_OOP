package Mod7.Battle;

abstract class Entity {
    private String name;
    private int hp = 15;
    private boolean destroyed = false;

    Entity(String name) {
        this.name = name;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    protected boolean damage(int dhp) {
        hp -= dhp;
        if (hp < 0) {
            destroyed = true;
            System.out.println("Entity " + name + " was destroyed");
            return true;
        }
        return false;
    }
}
