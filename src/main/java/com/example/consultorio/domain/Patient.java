package com.example.consultorio.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Patient {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
}


