package Designmøster_Opgave.Abstract_Factory;

import Designmøster_Opgave.Factory.InfantryUnit;

public abstract class InfantryFactory {
    public InfantryUnit createUnit(int techLevel) {
        // A better imlementation could be done here, but we return null as for now
        return null;
    }
}
