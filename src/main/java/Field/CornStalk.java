package Field;

import EdibleItems.EarCorn;

public class CornStalk extends Crop{

    @Override
    public EarCorn yield() {
        if(this.isFertilized && this.isHarvested){
            return new EarCorn();
        } else{
            return null;
        }
    }
}
