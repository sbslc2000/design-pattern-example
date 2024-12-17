package io.github.sbslc2000.builder;

/**
 * Concrete Builder
 */
public class FighterJet extends AirplaneBuilder{

    FighterJet(String customer) {
        super.customer = customer;
        super.type = "F-35 Lightning II";
    }

    @Override
    public void buildWings() {
        airplane.setWingspan(35.0f);
    }

    @Override
    public void buildPowerplant() {
        airplane.setPowerplant("Dual Thrust Vectoring");
    }

    @Override
    public void buildAvionics() {
        airplane.setAvionics("Military");
    }

    @Override
    public void buildSeats() {
        airplane.setNumberSeats(1, 0);
    }
}
