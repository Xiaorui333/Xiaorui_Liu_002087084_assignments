/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author frida
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonDirectory {
    private List<Person> personList;

    public PersonDirectory(){
        personList = new ArrayList<>();
    }
    
    public void addPerson(Person person){
        personList.add(person);
    }
    
    public Person searchPerson(String criteria){
        for(Person person : personList){
            if(person.getFirstName().equalsIgnoreCase(criteria)||
                person.getLastName().equalsIgnoreCase(criteria)||
                person.getHomeAddress().getStreetAddress().equalsIgnoreCase(criteria)||
                person.getWorkAddress().getStreetAddress().equalsIgnoreCase(criteria)){
            return person;
            }   
        }
    return null;  
    }  
    
    public boolean updatePerson(String criteria, Person updatedPerson) {
        
        for(Person person : personList){
                if(person.getFirstName().equalsIgnoreCase(criteria)||
                    person.getLastName().equalsIgnoreCase(criteria)||
                    person.getHomeAddress().getStreetAddress().equalsIgnoreCase(criteria)||
                    person.getWorkAddress().getStreetAddress().equalsIgnoreCase(criteria)){

                    person.setFirstName(updatedPerson.getFirstName());
                    person.setLastName(updatedPerson.getLastName());
                    person.setSocialSecurityNumber(updatedPerson.getSocialSecurityNumber());
                    person.setAge(updatedPerson.getAge());
                    person.setHomeAddress(updatedPerson.getHomeAddress());
                    person.setWorkAddress(updatedPerson.getWorkAddress());
                return true; 
            }
        }
        return false;
}

    
    public boolean deletePerson(String criteria){
        
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if(person.getFirstName().equalsIgnoreCase(criteria)||
                person.getLastName().equalsIgnoreCase(criteria)||
                person.getHomeAddress().getStreetAddress().equalsIgnoreCase(criteria)||
                person.getWorkAddress().getStreetAddress().equalsIgnoreCase(criteria)){
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    
    
    
    
    public List<Person> listPersons(){
        return personList;
    }  
    
}
