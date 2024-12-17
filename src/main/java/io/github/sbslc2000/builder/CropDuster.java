package io.github.sbslc2000.builder;

/**
 * Concrete Builder
 */
public class CropDuster extends AirplaneBuilder {

    CropDuster(String customer) {
        super.customer = customer;
        super.type = "Crop Duster v3.4";
    }


    @Override
    public void buildWings() {
        airplane.setWingspan(9f);
    }

    @Override
    public void buildPowerplant() {
        airplane.setPowerplant("Single piston");
    }

    @Override
    public void buildAvionics() {

    }

    @Override
    public void buildSeats() {
        airplane.setNumberSeats(1, 1);
    }
}
