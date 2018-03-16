package Designmøster_Opgave.FactoryAndAbstractFactory;

public class FactoryFactory {
    public static InfantryFactory createInfantryFactory(int race) {
        InfantryFactory factory;
        switch (race) {
            case 1:
                factory = new HumanInfantryFactory();
                break;
            case 2:
                factory = new OrcInfantryFactory();
                break;
            // case 3,4 and 5 should be imlemented here
            default:
                factory = null;
                break;
        }
        return factory;
    }
}
