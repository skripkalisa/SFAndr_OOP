package Mod7.Zoo.Interface;

public class Reptile extends Animal {
    public void print() {
        System.out.println(this);
    }

//    @Override
//    public void sound() {
//        System.out.println("Chop chop");
//    }

    @Override
    public String toString() {
        return "I am a reptile";
    }
}
