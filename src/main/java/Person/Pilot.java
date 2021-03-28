package Person;

import Vehicle.Aircraft;

public class Pilot extends Person {

    public Pilot(){
        this.name = "Froilanda";
    }

    @Override
    public String makeNoise() {
        return "Gonna do some flyin' today wee";
    }
    
    public void fly(Aircraft aircraft){
        aircraft.startRiding();
    }

    public void land(Aircraft aircraft){
        aircraft.stopRiding();
    }


}
