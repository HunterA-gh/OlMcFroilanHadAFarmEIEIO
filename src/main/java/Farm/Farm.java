package Farm;


import java.util.ArrayList;

public class Farm {

    public ArrayList<Stable> farm = new ArrayList<>();

    public void addStable(Stable stable) {
        this.farm.add(stable);
    }

    public ArrayList<ChickenCoop> farmChickencoop = new ArrayList<>();

    public void addChickenCoop(ChickenCoop chickenCoop) {
        this.farmChickencoop.add(chickenCoop);

    }
    public boolean farmHouse(boolean haveFarmHouse){
        if (haveFarmHouse = true){
            return true;
        }else return false;

    }




}