package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable{
    List<Person> personList = new ArrayList<>();

    public void add(Person a){
        personList.add(a);
    }

    public Person findById(Long id){
        for (Person person : personList) {
            if (person.getId().equals(id))
                return person;
        }

        return null;
    }

    public Boolean contains(Person a){
        for (Person person : personList) {
            if (person.equals(a))
                return true;
        }
        return false;
    }

    public void remove(Person a){
        if(contains(a))
            personList.remove((int)getIndexOf(a));

    }

    public void remove(Long id){
        Person a = findById(id);
        if(a != null)
            personList.remove((int)getIndexOf(a));
    }

    public Integer getIndexOf(Person a){
        for (int i = 0; i < personList.size(); i++){
            if (personList.get(i).equals(a))
                return i;
        }

        return -1;
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public Person[] toArray(){
        Person[] result = (Person[])personList.toArray();
        return result;
//        Person[] arr = new Person[personList.size()];
//        int i = 0;
//        for (Person p: personList
//             ) {
//            arr[i] = p;
//            i++;
//        }
    }

    @Override
    public Iterator iterator() {
        return personList.iterator();
    }



}

