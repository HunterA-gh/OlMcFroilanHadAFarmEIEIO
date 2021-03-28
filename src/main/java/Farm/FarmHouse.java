package Farm;

import Person.Person;
import Vehicle.CropDuster;

import java.util.ArrayList;

public class FarmHouse {

    public FarmHouse() {
    }

    public FarmHouse(ArrayList<Person> farmPeople) {
        this.farmPeople = farmPeople;
    }

    public ArrayList<Person> farmPeople = new ArrayList<Person>();



    public void addPerson(Person person){
        this.farmPeople.add(person);
    }
    public void removePerson(Person person){
        this.farmPeople.remove(person);
    }
    public ArrayList getFarmPeople(){
        return farmPeople;
    }

}
