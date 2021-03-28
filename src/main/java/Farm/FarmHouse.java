package Farm;

import Person.*;

import java.util.ArrayList;

public class FarmHouse {

    public ArrayList<Person> farmPeople = new ArrayList<Person>();

    public FarmHouse() {
        this.farmPeople.add(new Farmer());
        this.farmPeople.add(new Pilot());
    }

    public void addPerson(Person person){
        this.farmPeople.add(person);
    }

    public void removePerson(Person person){
        this.farmPeople.remove(person);
    }

    public ArrayList getFarmPeople(){
        return this.farmPeople;
    }

    public int amountOfFarmPeople(){
        return this.farmPeople.size();
    }

}