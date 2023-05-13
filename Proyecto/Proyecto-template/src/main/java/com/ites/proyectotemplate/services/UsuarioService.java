package com.ites.proyectotemplate.services;

import com.ites.proyectotemplate.models.Usuario;
import com.ites.proyectotemplate.utils.HibernateUtils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.Session;

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
        List<Usuario> result = entityManager.createQuery( "from Usuario", Usuario.class ).getResultList();
        entityManager.close();
        return result;
    }

    public Usuario getUserByID(int id) {
        EntityManagerFactory entityManagerFactory = HibernateUtils.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Usuario usuario = entityManager.find(Usuario.class, id);
        return usuario;
    }

    public void updateUser(Usuario usuario) {
        EntityManagerFactory entityManagerFactory = HibernateUtils.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(usuario);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void removeUser(Usuario usuario) {
        EntityManagerFactory entityManagerFactory = HibernateUtils.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.merge(usuario));
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
