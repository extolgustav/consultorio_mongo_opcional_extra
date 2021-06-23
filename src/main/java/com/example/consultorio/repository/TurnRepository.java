package com.example.consultorio.repository;

import com.example.consultorio.domain.Turn;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TurnRepository extends MongoRepository<Turn, String> {

    List<Turn> findAllTurnsByDoctorLastName(String lastName);

    List<Turn> findAllTurnsByStatus(String status);
}
