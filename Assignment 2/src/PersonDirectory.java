/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author frida
 */
import java.util.ArrayList;
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
            if(person.getFirstName().equalsIgnoreCase(criteria))||
                person.getLastName().equalsIgnoreCase(criteria)||
                person.getHomeAddress().getStreetAddress().equalsIgnoreCase(criteria)||
                person.getWorkAddress().getStreetAddress().equalsIgnoreCase(criteria)){
            return Person;
            }   
        }
    return null;  
    }  
    
    public boolean updatePerson(String ssn,Person update){
        for(int i=0,i<personList.size(),i++){
            if (personList.get(i).getSocialSecurityNumber().equals(ssn)) {
                personList.set(i, update);
                return true; // Successfully updated
            }
        }
        return false; // Person not found
    }
    
    public boolean deletePerson(String ssn,Person delete){
        for(int i=0,i<personList.size(),i++){
            if(personList.get(i)).getSocialSecurityNumber().equals(ssn)) {
               personList.set(i, delete);
               return true;
            }
        }
        return false;
    }
    
    public List<Person> listPersons(){
        return personList;
    }
    
    
    
    
}
