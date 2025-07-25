package com.ohgiraffers.mapping.section03.compositekey.subsction01.embeddedid;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class LikeRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Like like) {
        entityManager.persist(like);
    }
}
