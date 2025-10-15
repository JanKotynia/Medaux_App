package com.jan.medaux.domain.repositories;

import com.jan.medaux.domain.entities.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MedicineRepository extends JpaRepository<Medicine, UUID> {
}
