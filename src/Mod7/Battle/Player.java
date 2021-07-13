package Mod7.Battle;

public class Player extends Human{

    class Backpack{
        private String usefulStuff = "";
        void put(String tool){
            usefulStuff += tool +",";
        }
        public String toString(){
            if (usefulStuff.equals("")) {
                return "the backpack is empty";
            }
            return usefulStuff.substring(0, usefulStuff.length()-1) + " in the backpack";
        }
    }

    Backpack backpack;

    public Player(String name) {
        super(name + " the Player");
        backpack = new Backpack();
    }

    public void take(String tool){
        backpack.put(tool);
    }
}
