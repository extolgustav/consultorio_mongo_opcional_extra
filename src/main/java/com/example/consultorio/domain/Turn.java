package com.example.consultorio.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@AllArgsConstructor
@Document(collection="turns")
public class Turn {
    @Id
    private String id;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private Status status;
}
