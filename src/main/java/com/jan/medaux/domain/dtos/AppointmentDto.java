package com.jan.medaux.domain.dtos;

import com.jan.medaux.domain.AppointmentType;

import java.time.LocalDateTime;
import java.util.UUID;

public class AppointmentDto {
    private UUID id;
    private LocalDateTime date;
    private AppointmentType type;
    private String description;
    private UserDto user;
}
