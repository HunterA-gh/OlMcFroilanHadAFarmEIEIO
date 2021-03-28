package Farm;

import Animals.Chicken;

import java.util.ArrayList;

public class ChickenCoop {

    public ArrayList<Chicken> Chickens = new ArrayList<>();

    public void addChicken(Chicken chicken) {
        this.Chickens.add(chicken);
    }
}