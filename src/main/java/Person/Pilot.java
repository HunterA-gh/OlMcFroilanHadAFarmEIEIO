package Person;

import Field.Field;
import Vehicle.Aircraft;
import Vehicle.CropDuster;

public class Pilot extends Person {

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


}
