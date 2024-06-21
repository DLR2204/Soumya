package services;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import person.Person;

public class PersonServiceImplementation implements PersonService{
	
	private static Map<Integer,Person> persons = new HashMap<Integer,Person>();

	@Override
	public String addPerson(Person person) {
		
		if(persons.get(person.getId())!= null) return "	Please enter new id";
		
		persons.put(person.getId(), person);
		
		return "your data is saved successfully";
	}

	@Override
	public String deletePerson(int id) {
		if(persons.get(id)== null) return "	Please enter new id";
		
		persons.remove(id);
		
		return "your details are deleted successfully";
	}

	@Override
	public Person getPerson(int id) {
		
		return persons.get(id);
	}

	@Override
	public Person[] getAllPersons() {
		
		Set<Integer> set = persons.keySet();
		
		Person[] p = new Person[set.size()];
		
		int i = 0;
		
		for(Integer id:set) {
			p[i] = persons.get(id);
			i++;
		}
		
		return p;
	}

}
