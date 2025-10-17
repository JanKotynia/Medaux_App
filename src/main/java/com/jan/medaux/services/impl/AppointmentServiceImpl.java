package com.jan.medaux.services.impl;

import com.jan.medaux.domain.entities.Appointment;
import com.jan.medaux.repositories.AppointmentRepository;
import com.jan.medaux.services.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> listAppointments() {
        return appointmentRepository.findAll();
    }
}
