package Animals;

import EdibleItems.EdibleEgg;
import Interfaces.Produce;

public class Chicken extends Animal implements Produce {
    public boolean hasbeenFertilized;

    @Override
    public String makeNoise() {
        return "Bawk";
    }

    public EdibleEgg yield(){
        if(hasbeenFertilized){
            return new EdibleEgg();
        }
        else{
            return null;
        }
    }
}

