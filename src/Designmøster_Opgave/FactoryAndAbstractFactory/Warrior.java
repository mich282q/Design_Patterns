package Designmøster_Opgave.FactoryAndAbstractFactory;

import Designmøster_Opgave.FactoryAndAbstractFactory.InfantryUnit;

public class Warrior extends InfantryUnit {

    public Warrior() {
    }

    public Warrior(int range, int armor, int hits, int damage) {
        super(range, armor, hits, damage);
    }
}