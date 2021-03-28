package Farm;

import Animals.Chicken;

import java.util.ArrayList;



public class ChickenCoop {

    public ArrayList<Chicken> chickens = new ArrayList<>();







    public void addChicken(Chicken chicken) {
        this.chickens.add(chicken);
    }

    public void removeChicken(Chicken chicken){
        this.chickens.remove(chicken);
    }
    public ArrayList getChicken(){
        return chickens;
    }



    public int amountOfChickens(){
    return this.chickens.size();
    }
}
