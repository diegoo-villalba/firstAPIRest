package com.example.firstapirest.persistence;

import com.example.firstapirest.entities.Persona;
import com.example.firstapirest.services.BaseService;

import java.util.List;

public class PersonaService implements BaseService<Persona> {
    @Override
    public List<Persona> findAll() throws Exception {
        return null;
    }

    @Override
    public Persona findByID(Long id) throws Exception {
        return null;
    }

    @Override
    public Persona save(Persona entity) throws Exception {
        return null;
    }

    @Override
    public Persona update(Long id, Persona entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        return false;
    }
}
