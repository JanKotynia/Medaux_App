package com.jan.medaux.controllers;

import com.jan.medaux.domain.dtos.AppointmentDto;
import com.jan.medaux.domain.entities.Appointment;
import com.jan.medaux.mappers.AppointmentMapper;
import com.jan.medaux.services.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/appointmentController")
@RequiredArgsConstructor
public class AppointmentController {
    private final AppointmentService appointmentService;
    private final AppointmentMapper appointmentMapper;

    @GetMapping
    public ResponseEntity<List<AppointmentDto>> listAppointments() {
        List<AppointmentDto> appointments = appointmentService.listAppointments()
                .stream().map(appointmentMapper::toDto).toList();

        return ResponseEntity.ok(appointments);
    }

    @PostMapping
    public ResponseEntity<AppointmentDto> createAppointment(AppointmentDto appointmentDto) {
    Appointment appointmentToCreate = appointmentMapper.toEntity(appointmentDto);
    Appointment savedAppointment = appointmentService.createAppointment(appointmentToCreate);
    return new ResponseEntity<>(
            appointmentMapper.toDto(savedAppointment),
            HttpStatus.CREATED
    );
    }
}
