package com.jan.medaux.mappers;

import com.jan.medaux.domain.dtos.AppointmentDto;
import com.jan.medaux.domain.entities.Appointment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AppointmentMapper {

    @Mapping(target = "user", source = "user")
    AppointmentDto toDto(Appointment appointment);
}
