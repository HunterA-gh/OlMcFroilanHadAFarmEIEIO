package Vehicle;

import Interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {

  public Crop harvest(Crop crop) {
        return new crop();
    }

    public void operate(Farm farm) {

    }

    public String makeNoise() {

        return "Tractor noises";
    }

    public void mount() {

    }

    public void dismount() {

    }

}
