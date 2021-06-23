package com.example.consultorio.service;

import com.example.consultorio.domain.Turn;
import com.example.consultorio.repository.TurnRepository;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class TurnService {
    private final TurnRepository turnRepository;

    public TurnService(TurnRepository turnRepository) {
        this.turnRepository = turnRepository;
    }

    public List<Turn> findAllTurns() {
        return turnRepository.findAll();
    }

    public List<Turn> findAllTurnsByDoctorLastName(String lastName) {
        return turnRepository.findAllTurnsByDoctorLastName(StringUtils.capitalize(lastName));
    }

    public List<Turn> findAllTurnsByStatus(String status) {
        return turnRepository.findAllTurnsByStatus(status.toUpperCase());
    }
}
