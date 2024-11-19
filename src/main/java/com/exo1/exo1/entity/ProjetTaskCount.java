package com.exo1.exo1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "projet_task_count")
public class ProjetTaskCount {
    @Id
    @Column(name = "projet_id")
    private Long projetId;

    @Column(name = "name")
    private String name;

    @Column(name = "task_count")
    private Long taskCount;
}
