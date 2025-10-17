package com.jan.medaux.services;

import com.jan.medaux.domain.entities.Appointment;

import java.util.List;

public interface AppointmentService {
    List<Appointment> listAppointments();
}
