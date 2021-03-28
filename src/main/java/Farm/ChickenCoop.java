package Farm;


import Animals.*;
import Field.*;
import Interfaces.*;
import Vehicle.*;


import java.util.ArrayList;

public class Farm {
    public ArrayList<Stable> farmStable = new ArrayList<>();
    public ArrayList<ChickenCoop> farmChickencoop = new ArrayList<>();
    public ArrayList<FarmVehicle> tractors = new ArrayList<>();
    public Aircraft farmDuster;
    public FarmHouse farmhouse;
    public Field farmField;

    public Farm(){



        this.farmField.addCropRow(new CropRow());
        this.farmField.addCropRow(new CropRow());
        this.farmField.addCropRow(new CropRow());
        this.farmField.addCropRow(new CropRow());
        this.farmField.addCropRow(new CropRow());

        this.farmField.getCropRow(0).addCrop(new Co);




        this.farmhouse = new FarmHouse();

        farmStable.add(new Stable());
        farmStable.add(new Stable());
        farmStable.add(new Stable());


        farmStable.get(0).addHorse(new Horse());
        farmStable.get(0).addHorse(new Horse());
        farmStable.get(0).addHorse(new Horse());
        farmStable.get(1).addHorse(new Horse());
        farmStable.get(1).addHorse(new Horse());
        farmStable.get(1).addHorse(new Horse());
        farmStable.get(2).addHorse(new Horse());
        farmStable.get(2).addHorse(new Horse());
        farmStable.get(2).addHorse(new Horse());
        farmStable.get(1).addHorse(new Horse());

        farmChickencoop.add(new ChickenCoop());
        farmChickencoop.add(new ChickenCoop());
        farmChickencoop.add(new ChickenCoop());
        farmChickencoop.add(new ChickenCoop());


        farmChickencoop.get(0).addChicken(new Chicken());
        farmChickencoop.get(0).addChicken(new Chicken());
        farmChickencoop.get(0).addChicken(new Chicken());
        farmChickencoop.get(0).addChicken(new Chicken());
        farmChickencoop.get(1).addChicken(new Chicken());
        farmChickencoop.get(1).addChicken(new Chicken());
        farmChickencoop.get(1).addChicken(new Chicken());
        farmChickencoop.get(1).addChicken(new Chicken());
        farmChickencoop.get(2).addChicken(new Chicken());
        farmChickencoop.get(2).addChicken(new Chicken());
        farmChickencoop.get(2).addChicken(new Chicken());
        farmChickencoop.get(3).addChicken(new Chicken());
        farmChickencoop.get(3).addChicken(new Chicken());
        farmChickencoop.get(3).addChicken(new Chicken());
        farmChickencoop.get(0).addChicken(new Chicken());
        farmChickencoop.get(1).addChicken(new Chicken());
        farmChickencoop.get(2).addChicken(new Chicken());

        tractors.add(new Tractor());
        tractors.add(new Tractor());

        this.farmDuster = new CropDuster();

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






