package Farm;

import Animals.Horse;

import java.util.ArrayList;

public class Stable {
    public ArrayList<Horse> stable = new ArrayList<>();

    public void addHorse(Horse horse) {
        this.stable.add(horse);
    }

    public void removeHorse(Horse horse) {
        this.stable.remove(horse);
    }
            
    public Horse getHorse(int horseNum) {
        return this.stable.get(horseNum);
    }
            
    public int amountOfHorses() {
        return this.stable.size();
    }
}
