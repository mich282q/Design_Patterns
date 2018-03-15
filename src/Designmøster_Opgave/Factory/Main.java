package Designmøster_Opgave.Factory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nu starter Kampen");

    Archer niels = new Archer(10,100,80,50);
    CrossbowMan bjarne = new CrossbowMan(20,80,50,80);
    Musketeer lars = new Musketeer(10,70,10,90);
    RockHauler torben = new RockHauler(80,150,100,50);
    SpearThrower andreas = new SpearThrower(50,120,60,100);


niels.setName ("niels");
bjarne.setName("Bjarne");
lars.setName("lars");
torben.setName("torben");
andreas.setName("andreas");


        // The units are fighting for death
        while (niels.alive() && bjarne.alive()) {
            niels.attack(bjarne);
            bjarne.attack(niels);
        }
// The battle reults are announced
        System.out.println("***************************************");
        if (!niels.alive()) {
            if (!bjarne.alive()) {
                System.out.println("It's a draw");
            } else {
                System.out.println(bjarne.getName() +  " " + bjarne.getClass().getSimpleName() + " wins!");
            }
        } else {
            System.out.println(niels.getName() + " " + niels.getClass().getSimpleName() + " wins!");
        }
        System.out.println("***************************************");


    }}
