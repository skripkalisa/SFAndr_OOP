package Mod7.Task;

public interface ICanSwim {
    default void swim(){
        System.out.print("I can swim");
    }
}
