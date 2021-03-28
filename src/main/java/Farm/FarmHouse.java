package Farm;

import Person.*;

import java.util.ArrayList;

public class FarmHouse {
    public ArrayList<Person> farmPeople = new ArrayList<Person>();


    public void addPerson(Person person){
        this.farmPeople.add(person);
    }

    public void removePerson(Person person){
        this.farmPeople.remove(person);
    }

    public Person getPerson(int personNum) {
        return this.farmPeople.get(personNum);
    }

    public int amountOfFarmPeople(){
        return this.farmPeople.size();
    }

}