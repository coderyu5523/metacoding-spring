package com.metacoding.springv1.user;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class UserRepository {

    public final EntityManager em;

    @Transactional
    public void save(User user){
        em.persist(user);   
    }

    public User findByUsername(String username){
        try {
           User user = em.createQuery("select u from User u where u.username = :username", User.class)
            .setParameter("username", username)
            .getSingleResult();
            return user;

        } catch (Exception e) {
            return null;
        }

    }
}