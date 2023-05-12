package com.ites.proyectotemplate.services;

import com.ites.proyectotemplate.models.Usuario;
import com.ites.proyectotemplate.utils.HibernateUtils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class UsuarioService {

    public UsuarioService() {

    }

    public void addUser(Usuario usuario) {
        EntityManagerFactory entityManagerFactory = HibernateUtils.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public List<Usuario> getAllUsers() {
        EntityManagerFactory entityManagerFactory = HibernateUtils.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Usuario> result = entityManager.createQuery( "from Usuario", Usuario.class ).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return result;
    }
}
