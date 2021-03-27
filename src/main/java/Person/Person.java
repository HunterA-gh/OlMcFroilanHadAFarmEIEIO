package Person;

import Interfaces.*;
import java.util.ArrayList;

public abstract class Person implements Eater, NoiseMaker {
    public String name;
    public ArrayList<Edible> foodEaten = new ArrayList<Edible>();

    public String getName() {
        return name;
    }

    public ArrayList<Edible> getFoodEaten(){
        return foodEaten;
    }

    public void eat(Edible foodItem){
        this.foodEaten.add(foodItem);
    }


}
