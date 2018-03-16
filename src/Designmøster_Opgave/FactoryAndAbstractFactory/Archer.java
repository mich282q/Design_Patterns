package Designmøster_Opgave.FactoryAndAbstractFactory;

public class Archer extends InfantryUnit {
    public Archer() {}

    public Archer(int range, int armor, int hits, int damage) { super (range, armor, hits, damage);
    }
}
