package services;

import java.util.HashMap;
import java.util.Map;

import person.Person;

public class PersonServiceImplementation implements PersonService{
	
	private static Map<Integer,Person> persons = new HashMap<Integer,Person>();

	@Override
	public String addPerson(Person person) {
		
		if(persons.get(person.getId())!= null) return "false";
		
		persons.put(person.getId(), person);
		
		return "your data is saved successfully";
	}

	@Override
	public String deletePerson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person[] getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

}
