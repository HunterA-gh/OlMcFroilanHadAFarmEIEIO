package Vehicle;

import Field.Field;
import Interfaces.FarmVehicle;

public class CropDuster extends Aircraft implements FarmVehicle {


    public void operate(Field field) {
        if(hasRiderOn && isFlying) {
            for (int i = 0; i < field.getFieldSize(); i++) {
                for (int j = 0; j < field.getCropRow(i).getCropRowSize(); j++)
                    field.getCropRow(i).getCrop(j).fertilize();
            }
        } else{
            System.out.println("Needs pilot to get on and be flying to operate");
        }
    }


    @Override
    public void startRiding() {
        setHasRiderOn();
    }

    @Override
    public void stopRiding() {
        setHasRiderOff();
    }

    @Override
    public String makeNoise() {
        return "Cropduster engine";
    }
}
