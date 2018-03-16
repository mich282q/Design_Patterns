package Designmøster_Opgave.FactoryAndAbstractFactory;

import Designmøster_Opgave.FactoryAndAbstractFactory.InfantryUnit;

public abstract class InfantryFactory {
    public InfantryUnit createUnit(int techLevel) {
        // A better imlementation could be done here, but we return null as for now
        return null;
    }
}
