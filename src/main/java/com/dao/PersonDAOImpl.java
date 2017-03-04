package com.dao;

import com.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by kevser on 4.03.2017.
 */
@Repository("personDAOImpl")
public class PersonDAOImpl implements PersonDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }


    public void insert(Person person) {
        Session session = getSession();
        session.beginTransaction();
        session.persist(person);
        session.getTransaction().commit();
        session.close();
    }

    public Person getPersonById(int id) {
        Session session = getSession();
        Person person = session.get(Person.class, id);
        session.close();
        return person;
    }

    public List<Person> getAllPersons() {
        Session session = getSession();
        Query query = session.createQuery("from Person");
        return query.list();
    }

    public void update(Person person) {
        Session session = getSession();
        session.beginTransaction();
        session.update(person);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(int id) {
        Session session = getSession();
        Person person = getPersonById(id);
        session.beginTransaction();
        session.delete(person);
        session.getTransaction().commit();
        session.close();
    }
}
