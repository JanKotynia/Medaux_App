package com.jan.medaux.repositories;

import com.jan.medaux.domain.entities.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TreatmentRepository extends JpaRepository<Treatment, UUID> {
}
