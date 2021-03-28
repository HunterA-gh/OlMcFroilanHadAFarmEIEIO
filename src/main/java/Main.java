import Farm.*;
import Animals.*;
import EdibleItems.*;
import Field.*;
import Interfaces.*;
import Person.*;
import Vehicle.*;

public class Main{


    public static void main(String[] args) {
        Farm froilandsFarm = new Farm();
        Pilot Friolanda = new Pilot();
        Farmer Froiland = new Farmer();
        froilandsFarm.farmHouse.addPerson(Froiland);
        froilandsFarm.farmHouse.addPerson(Friolanda);


        System.out.println(froilandsFarm.farmStable);

        System.out.println(froilandsFarm.farmField.getCropRow(0).cropRow.get(0).isFertilized);
        System.out.println(froilandsFarm.farmField.getCropRow(0).cropRow.get(0).isHarvested);

        System.out.println(froilandsFarm.farmDuster.makeNoise());
        Friolanda.getOnAndFlyCropDuster(froilandsFarm.farmDuster);
        Friolanda.fertilizeCrops((CropDuster) froilandsFarm.farmDuster, froilandsFarm.farmField);
        System.out.println(froilandsFarm.farmField.getCropRow(0).cropRow.get(0).isFertilized);
        System.out.println(froilandsFarm.farmStable.get(0).getHorse(0).isMounted);
        Froiland.mount(froilandsFarm.farmStable.get(0).getHorse(0));
        System.out.println(froilandsFarm.farmStable.get(0).getHorse(0).isMounted);
        Froiland.mount((Rideable)froilandsFarm.tractors.get(0));
        Froiland.useTractor((Tractor)froilandsFarm.tractors.get(0), froilandsFarm.farmField);
        System.out.println(((Tractor) froilandsFarm.tractors.get(0)).makeNoise());
        System.out.println(froilandsFarm.farmField.getCropRow(0).cropRow.get(0).isHarvested);
        Edible corn1 = froilandsFarm.farmField.getCropRow(0).getCrop(0).yield();
        Froiland.eat(corn1);
        System.out.println(Froiland.foodEaten);

        System.out.println(froilandsFarm.farmHouse.getPerson(0).makeNoise());

        System.out.println(froilandsFarm.farmField.getCropRow(4).cropRow);
        Froiland.plant(froilandsFarm.farmField, 4, new CornStalk());
        System.out.println(froilandsFarm.farmField.getCropRow(4).cropRow);

    }
}