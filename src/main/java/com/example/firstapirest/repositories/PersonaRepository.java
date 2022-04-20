package com.example.firstapirest.repositories;

import com.example.firstapirest.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    //JPA Repository: Clase generica que brinda metodos para acceder a la DB
}
