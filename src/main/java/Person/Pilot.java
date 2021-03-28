package Person;

import Field.Field;
import Interfaces.Rideable;
import Interfaces.Rider;
import Vehicle.Aircraft;
import Vehicle.CropDuster;

public class Pilot extends Person implements Rider {

    public Pilot(){
        this.name = "Froilanda";
    }

    @Override
    public String makeNoise() {
        return "Gonna do some flyin' today wee";
    }
    
    public void getOnAndFlyCropDuster(Aircraft aircraft){
        aircraft.startRiding();
        aircraft.fly();
    }

    public void landAndGetOffCropDuster(Aircraft aircraft){
        aircraft.stopRiding();
        aircraft.land();

    }

    public void fertilizeCrops(CropDuster cropDuster, Field field){
        cropDuster.operate(field);
    }

    @Override
    public void mount(Rideable rideable) {
        rideable.startRiding();
    }

    @Override
    public void dismount(Rideable rideable) {
        rideable.stopRiding();
    }


}
