package Vehicle;

import Interfaces.*;

public abstract class Vehicle implements Rideable, NoiseMaker {
    public boolean hasRiderOn;

    public void setHasRiderOn() {
        this.hasRiderOn = true;
    }
}
