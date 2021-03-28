package Field;

import Interfaces.Produce;

public abstract class Crop implements Produce {
    public boolean isFertilized;
    public boolean isHarvested;

    public Crop(){
        this.isFertilized = false;
        this.isHarvested = false;
    }

    public void fertilize() {
        isFertilized = true;
    }

    public void harvest() {
        isHarvested = true;
    }
}
