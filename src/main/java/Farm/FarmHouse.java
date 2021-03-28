package Farm;

import Person.Person;

import java.util.ArrayList;

public class FarmHouse {

    public ArrayList<Person> farmPeople = new ArrayList<Person>();

    public void addPerson(Person person){
        this.farmPeople.add(person);

    }

}
