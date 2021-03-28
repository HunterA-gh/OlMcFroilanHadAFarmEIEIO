package Field;

import java.util.ArrayList;

public class CropRow {
    public ArrayList<Crop> cropRow = new ArrayList<Crop>();

    public void addCrop(Crop crop){
        this.cropRow.add(crop);
    }

    public Crop getCrop(int cropNum){
        return this.cropRow.get(cropNum);
    }


    public int getCropRowSize(){
        return this.cropRow.size();
    }

}
