package Person;

import Field.Crop;
import Field.CropRow;
import Field.Field;
import Interfaces.*;
import Vehicle.Tractor;

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

    public void useTractor(Tractor tractor, Field field){
        tractor.operate(field);
    }

    @Override
    public void plant(Field field, int rowNum, Crop crop) {
        field.getCropRow(rowNum).addCrop(crop);
    }
}
