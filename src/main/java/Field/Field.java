package Field;

import java.util.ArrayList;

public class Field {
    public ArrayList<CropRow> field = new ArrayList<CropRow>();

    public void addCropRow(CropRow cropRow){
        this.field.add(cropRow);
    }


}
