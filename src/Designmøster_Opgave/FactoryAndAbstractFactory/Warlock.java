package Designmøster_Opgave.FactoryAndAbstractFactory;

import Designmøster_Opgave.FactoryAndAbstractFactory.InfantryUnit;

public class Warlock extends InfantryUnit {

    public Warlock(){}

    public Warlock(int range, int armor, int hits, int damage) {
        super(range, armor,hits, damage);
    }
}