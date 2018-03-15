package Designmøster_Opgave.Factory;

public class Main {
    public static void main(String[] args) {

        System.out.println("hallo World");

    Archer Archer1 = new Archer(10,100,30,50);
    CrossbowMan Crossbowman1 = new CrossbowMan(20,80,50,80);
    Musketeer Musketeer1 = new Musketeer(10,70,10,90);
    RockHauler RockHauler1 = new RockHauler(80,150,100,50);
    SpearThrower SpearThrower1 = new SpearThrower(50,120,60,100);


        Archer1.attack(Musketeer1);
        

}}
