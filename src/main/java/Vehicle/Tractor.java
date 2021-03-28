package Vehicle;

import Field.Field;
import Interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {


    public void operate(Field field) {
        if(hasRiderOn) {
            for (int i = 0; i < field.getFieldSize(); i++) {
                for (int j = 0; j < field.getCropRow(i).getCropRowSize(); j++)
                    field.getCropRow(i).getCrop(j).harvest();
            }
        } else{
            System.out.println("Needs farmer to get on to operate");
        }
    }

    public String makeNoise() {
        return "Tractor noises";
    }


    @Override
    public void startRiding() {
        setHasRiderOn();
    }

    @Override
    public void stopRiding() {
        setHasRiderOff();
    }
}
