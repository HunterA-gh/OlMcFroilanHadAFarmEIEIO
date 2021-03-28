package Farm;

import Animals.Chicken;

import java.util.ArrayList;


public class ChickenCoop {
    public ArrayList<Chicken> chickenCoop = new ArrayList<Chicken>();

    public void addChicken(Chicken chicken) {
        this.chickenCoop.add(chicken);
    }

    public void removeChicken(Chicken chicken){
        this.chickenCoop.remove(chicken);
    }

    public Chicken getChicken(int chickenNum) {
        return this.chickenCoop.get(chickenNum);
    }

    public int amountOfChickens(){
        return this.chickenCoop.size();
    }
}

