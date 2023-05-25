package com.ites.proyectotemplate.services;

import com.ites.proyectotemplate.models.Direccion;
import com.ites.proyectotemplate.models.Usuario;
import com.ites.proyectotemplate.utils.HibernateUtils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class DireccionService {

    public DireccionService() {

    }

    public void addDireccion(Direccion direccion) {
        EntityManager entityManager = HibernateUtils.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(direccion);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void removeDireccion(Direccion direccion) {
        EntityManagerFactory entityManagerFactory = HibernateUtils.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.merge(direccion));
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
