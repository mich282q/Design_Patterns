package Designmøster_Opgave.FactoryAndAbstractFactory;

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




    InfantryFactory humanFactory = FactoryFactory.createInfantryFactory(1);
    InfantryFactory orcFactory = FactoryFactory.createInfantryFactory(2);

    // The factories are producing units
    InfantryUnit TheSoldierA = humanFactory.createUnit(1); // unit 1 -- rockhauler
        TheSoldierA.setName("Durotan");
    InfantryUnit ThesoldierB = orcFactory.createUnit(2); // unit 2 -- spearthrower
        ThesoldierB.setName("Orgrim");


    // The units are fighting for death
        while (TheSoldierA.alive() && ThesoldierB.alive()) {
            TheSoldierA.attack(ThesoldierB);
            ThesoldierB.attack(TheSoldierA);
    }

    // The battle reults are announced
        System.out.println("***************************************");
        if (!TheSoldierA.alive()) {
        if (!ThesoldierB.alive()) {
            System.out.println("It's a draw");
        } else {
            System.out.println(ThesoldierB.getRace() + " " + ThesoldierB.getName() + " " + ThesoldierB.getClass().getSimpleName() + " wins!");
        }
    } else {
        System.out.println(TheSoldierA.getRace() + " " + TheSoldierA.getName() + " " + TheSoldierA.getClass().getSimpleName() + " wins!");
    }
        System.out.println("***************************************");
}}

