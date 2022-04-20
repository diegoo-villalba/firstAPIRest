package com.example.firstapirest.services;

import java.util.List;

public interface BaseService<E> {
    /*<E>: La hacemos de tipo generica para que pueda recibir cualquier entidad*/
    /*Declaramos los metodos con los 4 metodos del CRUD*/

    public List<E> findAll() throws Exception; //Nos trae una lista de las entidades en la DB
    public E findByID(Long id) throws Exception; //Nos trae una entidad de la BD de acuerdo al ID
    public E save (E entity) throws Exception; //Crea una nueva entidad y la guardamos en la DB
    public E update(Long id, E entity) throws Exception; //Recibe un ID y la Entidad actualizada
    public boolean delete(Long id) throws Exception; //Elimina el registro especificado en la DB
}
