package Person;

import Field.Crop;
import Field.CropRow;
import Interfaces.*;

public class Farmer extends Person implements Botanist, Rider {

    public Farmer(){
        this.name = "Farmer Froiland";
    }

    @Override
    public String makeNoise() {
        return "Gonna do some farmin' today yee";
    }


    @Override
    public void mount(Rideable rideable) {
        rideable.startRiding();
    }

    @Override
    public void dismount(Rideable rideable) {
        rideable.stopRiding();
    }

    @Override
    public void plant(CropRow cropRow, Crop crop) {

    }
}
