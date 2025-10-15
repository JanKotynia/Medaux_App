package com.jan.medaux.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "medicines")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private Float dose;

    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy = "medicines")
    private Set<Treatment> treatments = new HashSet<>();
}
