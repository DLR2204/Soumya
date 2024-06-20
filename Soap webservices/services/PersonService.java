package services;

import person.Person;

public interface PersonService {
	
	public String addPerson(Person person);
	
	public String deletePerson(Person person);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();

}
