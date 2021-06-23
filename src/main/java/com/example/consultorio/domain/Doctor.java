package com.example.consultorio.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Doctor {
    private String firstName;
    private String lastName;
    private String specialty;
}
