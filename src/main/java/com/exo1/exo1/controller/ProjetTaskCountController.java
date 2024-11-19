package com.exo1.exo1.controller;

import com.exo1.exo1.entity.ProjetTaskCount;
import com.exo1.exo1.service.ProjetTaskCountService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projet-task-count")
public class ProjetTaskCountController {

    @Autowired
    private ProjetTaskCountService projetTaskCountService;

    @PostMapping("/refresh")
    public void refreshMaterializedView() {
        projetTaskCountService.refreshMaterializedView();
    }

    @GetMapping
    public List<ProjetTaskCount> findAll() {
        return projetTaskCountService.findAll();
    }
}
