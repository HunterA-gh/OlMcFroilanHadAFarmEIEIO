package Field;

import EdibleItems.Tomato;

public class TomatoPlant extends Crop {

    @Override
    public Tomato yield() {
        if(this.isFertilized && this.isHarvested){
            return new Tomato();
        } else{
            return null;
        }
    }
}
