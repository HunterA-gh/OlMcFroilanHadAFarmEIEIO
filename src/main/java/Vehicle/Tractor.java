package Vehicle;

import Field.Field;
import Interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {


    public void operate(Field field) {

    }

    public String makeNoise() {

        return "Tractor noises";
    }


  @Override
  public void startRiding() {

  }

  @Override
  public void stopRiding() {

  }
}
