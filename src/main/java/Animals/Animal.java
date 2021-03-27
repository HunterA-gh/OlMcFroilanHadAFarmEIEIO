package Animals;

import Interfaces.*;
import java.util.ArrayList;

public abstract class Animal implements Eater, NoiseMaker {
    public ArrayList<Edible> foodEaten = new ArrayList<Edible>();

    public void eat(Edible food){
        this.foodEaten.add(food);
    }

    public ArrayList<Edible> getFoodEaten(){
        return foodEaten;
    }
}
