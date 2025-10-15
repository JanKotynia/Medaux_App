package com.jan.medaux.domain.entities;

import com.jan.medaux.domain.MeasurementType;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "measurements")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Measurement {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private MeasurementType type;

    @Column(nullable = false)
    private Float value;

    @ManyToOne
    @JoinColumn(name = "measurement_day_id", nullable = false)
    private MeasurementDay measurement_day;
}
