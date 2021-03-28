package Vehicle;

import Field.Field;
import Interfaces.FarmVehicle;

public class CropDuster extends Aircraft implements FarmVehicle {


    public void operate(Field field) {

    }


    @Override
    public void startRiding() {

    }

    @Override
    public void stopRiding() {

    }

    @Override
    public String makeNoise() {
        return "Cropduster engine";
    }
}
