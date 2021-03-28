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





    public void addStable(Stable stable) {
        this.farmStable.add(stable);
    }
    public void removeStable(Stable stable) {
    this.farmStable.remove(farmStable);
    }
    public ArrayList<Stable> getStable() {
        return farmStable;
    }


    public void addChickenCoop(ChickenCoop chickenCoop) {
        this.farmChickencoop.add(chickenCoop);

    }
    public void removeChickenCoop(ChickenCoop chickenCoop) {
        this.farmChickencoop.remove(chickenCoop);
    }

    public FarmHouse getFarmhouse() {
        return farmhouse;
    }


    }






