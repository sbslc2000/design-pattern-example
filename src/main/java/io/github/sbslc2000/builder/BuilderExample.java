package io.github.sbslc2000.builder;

public class BuilderExample {

    public static void main(String[] args) {

        // instantiate the director (hire the engineer)
        AerospaceEngineer aero = new AerospaceEngineer();

        // instantiate each concrete builder (take orders)
        AirplaneBuilder crop = new CropDuster("Farmer Brown");
        FighterJet fighter = new FighterJet("The Navy");
        AirplaneBuilder glider = new Glider("Academy of Model Aeronautics");

        // build the crop duster
        aero.setAirplaneBuilder(crop);
        aero.constructAirplane();
        Airplane completedCropDuster = aero.getAirplane();
        System.out.println(completedCropDuster.getType() + " is completed and ready for delivery to " + completedCropDuster.getCustomer());
    }
}
