package com.exo1.exo1.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exo1.exo1.entity.ProjetTaskCount;
import com.exo1.exo1.repository.ProjetTaskCountRepository;

@Service
public class ProjetTaskCountService {

    @Autowired
    private ProjetTaskCountRepository projetTaskCountRepository;
    
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void refreshMaterializedView() {
        entityManager.createNativeQuery("REFRESH MATERIALIZED VIEW projet_task_count").executeUpdate();
    }

    public List<ProjetTaskCount> findAll() {
        return projetTaskCountRepository.findAll();
    }
}
