package com.ites.proyectotemplate.services;

import com.ites.proyectotemplate.models.Direccion;
import com.ites.proyectotemplate.utils.HibernateUtils;
import jakarta.persistence.EntityManager;

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
}
