package Designmøster_Opgave.FactoryAndAbstractFactory;

public class OrcInfantryFactory extends InfantryFactory {

    public InfantryUnit createUnit(int techLevel) {
        InfantryUnit character;
        switch (techLevel) {
            case 1:
                character = new RockHauler(5, 6, 30, 8);
                character.setRace("Orc");
                break;
            case 2:
                character = new SpearThrower(5, 8, 32, 8);
                character.setRace("Orc");
                break;

            default:
                character = null;
                break;
        }
        return character;
    }

}