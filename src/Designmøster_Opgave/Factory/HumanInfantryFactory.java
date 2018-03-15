package Designmøster_Opgave.Factory;

import Designmøster_Opgave.Abstract_Factory.InfantryFactory;

public class HumanInfantryFactory extends InfantryFactory{

    public InfantryUnit createUnit(int techLevel) {

        InfantryUnit character = null;
        switch (techLevel) {
                case 10:
                    character = new RockHauler(4, 6, 25, 10); //range, armor, hits, damage
                    //character.setRace("Human");
                    break;
                case 11:
                    character = new SpearThrower(4, 6, 25, 11);
                    //character.setRace("Human");
                    break;
                case 12:
                    character = new Musketeer(4, 6, 25, 12);
                    //character.setRace("Human");
                    break;
                case 13:
                    character = new CrossbowMan(4, 6, 25, 13);
                    //character.setRace("Human");
                    break;
                case 14:
                    character = new Archer(4, 6, 25, 14);
                    //character.setRace("Human");
                    break;
            }
            return character;
        }
    }