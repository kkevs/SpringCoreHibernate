package com.dao;

import com.model.Person;

import java.util.List;

/**
 * Created by kevser on 4.03.2017.
 */
public interface PersonDAO {
    public void insert(Person person);

    public Person getPersonById(int id);

    public List<Person> getAllPersons();

    public void update(Person person);

    public void delete(int id);
}
