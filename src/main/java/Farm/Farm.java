package Farm;

import Animals.*;
import Field.*;
import Interfaces.*;
import Vehicle.*;


import java.util.ArrayList;

public class Farm {
    public ArrayList<Stable> farmStable = new ArrayList<Stable>();
    public ArrayList<ChickenCoop> farmChickenCoop = new ArrayList<ChickenCoop>();
    public ArrayList<FarmVehicle> tractors = new ArrayList<FarmVehicle>();
    public Aircraft farmDuster = new CropDuster();
    public FarmHouse farmHouse = new FarmHouse();
    public Field farmField = new Field();

    public Farm() {
        this.tractors.add(new Tractor());
        this.tractors.add(new Tractor());


        this.farmField.addCropRow(new CropRow());
        this.farmField.addCropRow(new CropRow());
        this.farmField.addCropRow(new CropRow());
        this.farmField.addCropRow(new CropRow());
        this.farmField.addCropRow(new CropRow());

        this.farmField.getCropRow(0).addCrop(new CornStalk());
        this.farmField.getCropRow(0).addCrop(new CornStalk());
        this.farmField.getCropRow(0).addCrop(new CornStalk());
        this.farmField.getCropRow(0).addCrop(new CornStalk());
        this.farmField.getCropRow(0).addCrop(new CornStalk());


        this.farmField.getCropRow(1).addCrop(new TomatoPlant());
        this.farmField.getCropRow(1).addCrop(new TomatoPlant());
        this.farmField.getCropRow(1).addCrop(new TomatoPlant());

        this.farmField.getCropRow(2).addCrop(new CornStalk());
        this.farmField.getCropRow(2).addCrop(new TomatoPlant());
        this.farmField.getCropRow(2).addCrop(new CornStalk());
        this.farmField.getCropRow(2).addCrop(new CornStalk());

        this.farmField.getCropRow(3).addCrop(new TomatoPlant());
        this.farmField.getCropRow(3).addCrop(new CornStalk());
        this.farmField.getCropRow(3).addCrop(new TomatoPlant());

        this.farmField.getCropRow(4).addCrop(new TomatoPlant());
        this.farmField.getCropRow(4).addCrop(new CornStalk());
        this.farmField.getCropRow(4).addCrop(new CornStalk());
        this.farmField.getCropRow(4).addCrop(new TomatoPlant());


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


        farmChickenCoop.add(new ChickenCoop());
        farmChickenCoop.add(new ChickenCoop());
        farmChickenCoop.add(new ChickenCoop());
        farmChickenCoop.add(new ChickenCoop());

        farmChickenCoop.get(0).addChicken(new Chicken());
        farmChickenCoop.get(0).addChicken(new Chicken());
        farmChickenCoop.get(0).addChicken(new Chicken());
        farmChickenCoop.get(0).addChicken(new Chicken());
        farmChickenCoop.get(1).addChicken(new Chicken());
        farmChickenCoop.get(1).addChicken(new Chicken());
        farmChickenCoop.get(1).addChicken(new Chicken());
        farmChickenCoop.get(1).addChicken(new Chicken());
        farmChickenCoop.get(2).addChicken(new Chicken());
        farmChickenCoop.get(2).addChicken(new Chicken());
        farmChickenCoop.get(2).addChicken(new Chicken());
        farmChickenCoop.get(3).addChicken(new Chicken());
        farmChickenCoop.get(3).addChicken(new Chicken());
        farmChickenCoop.get(3).addChicken(new Chicken());
        farmChickenCoop.get(0).addChicken(new Chicken());
        farmChickenCoop.get(1).addChicken(new Chicken());
        farmChickenCoop.get(2).addChicken(new Chicken());
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
        this.farmChickenCoop.add(chickenCoop);

    }

    public void removeChickenCoop(ChickenCoop chickenCoop) {
        this.farmChickenCoop.remove(chickenCoop);
    }

}








