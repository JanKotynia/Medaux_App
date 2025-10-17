package com.jan.medaux.repositories;

import com.jan.medaux.domain.entities.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MeasurementRepository extends JpaRepository<Measurement, UUID> {
}
