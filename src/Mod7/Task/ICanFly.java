package Mod7.Task;

public interface ICanFly {
    default void fly(){
        System.out.print("I can fly ");
    }
}
