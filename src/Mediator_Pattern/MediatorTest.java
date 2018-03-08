package Mediator_Pattern;

public class MediatorTest {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John Hitler");

        robert.sendMessage("Hello my friends");
        john.sendMessage("Kys");
    }


}