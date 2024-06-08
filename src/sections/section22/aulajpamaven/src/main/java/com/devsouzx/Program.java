package com.devsouzx;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    Person person = entityManager.find(Person.class, 2);

    entityManager.getTransaction().begin();
    entityManager.remove(person);
    entityManager.getTransaction().commit();

    System.out.println("Ready");
    entityManager.close();
    entityManagerFactory.close();
  }
}
