package com.habte.maintenance_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;

@Service
public abstract class GenericService <T, ID>{

	 @Autowired
	    private JpaRepository<T, ID> repository;

	    public List<T> getAll() {
	        return repository.findAll();
	    }

	    public T getById(ID id) {
	        return repository.findById(id)
	                .orElseThrow(() -> new EntityNotFoundException("Entity not found with id: " + id));
	    }

	    public T create(T entity) {
	        return repository.save(entity);
	    }

	    public T update(ID id, T updatedEntity) {
	        return repository.findById(id)
	                .map(existingEntity -> {
	                    // Update existingEntity with the fields from updatedEntity
	                    return repository.save(existingEntity);
	                })
	                .orElseThrow(() -> new EntityNotFoundException("Entity not found with id: " + id));
	    }

	    public void delete(ID id) {
	        repository.deleteById(id);
	    }
}
