package com.jan.medaux.domain.repositories;

import com.jan.medaux.domain.entities.MeasurementDay;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MeasurementDayRepository extends JpaRepository<MeasurementDay, UUID> {
}
