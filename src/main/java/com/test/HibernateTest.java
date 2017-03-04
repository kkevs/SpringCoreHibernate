package com.test;

import com.dao.PersonDAO;
import com.dao.PersonDAOImpl;
import com.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kevser on 4.03.2017.
 */
public class HibernateTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hibernate.xml");

        PersonDAO personDAO = ctx.getBean(PersonDAOImpl.class);

        // create person object
        Person person1 = new Person("oldName", "oldSurname", 1989);
//
//		 // insert
        personDAO.insert(person1);
//
        // // find
        // Person foundPerson = personDAO.getPersonById(1);
        // System.out.println("Found ... " + foundPerson);
        //
        // // update
        // person1.setName("kevs");
        // person1.setSurname("kose");
        // personDAO.update(person1);
        // System.out.println("After Update...");
        //
        // // find
        // foundPerson = personDAO.getPersonById(1);
        // System.out.println("Found ... " + foundPerson);
        //
        // Person person2 = new Person("kvs", "kos", 1955);
        // Person person3 = new Person("kevso", "kose", 1961);
        //
        // personDAO.insert(person2);
        // personDAO.insert(person3);
        //
        // // delete
        // personDAO.delete(1);
        //
        // // list
        // List<Person> personList = personDAO.getAllPersons();
        // System.out.println("Listing...");
        // for (Person p : personList) {
        // System.out.println(p);
        // }

        ((ClassPathXmlApplicationContext) ctx).close();

    }}

