package com.example.consultorio.controller;

import com.example.consultorio.domain.Turn;
import com.example.consultorio.service.TurnService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/consultorio")
public class TurnController {
    /** http://localhost:8080/consultorio/turns*/

    private final TurnService turnService;

    public TurnController(TurnService turnService) {
        this.turnService = turnService;
    }

    @GetMapping(value = "/turns")
    public List<Turn> getAllTurns() {
        return turnService.findAllTurns();
    }

    @GetMapping(value = "/turns/doctor/{lastName}")
    public List<Turn> getAllTurnsbyDoctor(@PathVariable("lastName") String lastName) {
        return turnService.findAllTurnsByDoctorLastName(lastName);
    }

    @GetMapping(value = "/turns/{status}")
    public List<Turn> getAllTurnsByStatus(@PathVariable("status") String status) {
        return turnService.findAllTurnsByStatus(status);
    }

}
