package com.habte.maintenance_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.habte.maintenance_management.service.GenericService;

import java.util.List;
//@CrossOrigin(origins = "http://localhost:4200")
public abstract class GenericController<T, ID, TDTO> {

	
	 @Autowired
	    private GenericService<T, ID> service;

	    public abstract GenericService<T, ID> getService();

	    @GetMapping("/all")
	    public ResponseEntity<List<T>> getAll() {
	        List<T> entities = getService().getAll();
	        return ResponseEntity.ok(entities);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<T> getById(@PathVariable ID id) {
	        T entity = getService().getById(id);
	        return ResponseEntity.ok(entity);
	    }

	    @PostMapping("/create")
	    public ResponseEntity<T> create(@RequestBody TDTO dto) {
	        T entity = convertToEntity(dto);
	        T createdEntity = getService().create(entity);
	        return ResponseEntity.ok(createdEntity);
	    }

	    @PutMapping("/update/{id}")
	    public ResponseEntity<T> update(@PathVariable ID id, @RequestBody TDTO dto) {
	        T updatedEntity = convertToEntity(dto);
	        T updated = getService().update(id, updatedEntity);
	        return ResponseEntity.ok(updated);
	    }

	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Void> delete(@PathVariable ID id) {
	        getService().delete(id);
	        return ResponseEntity.noContent().build();
	    }

	    // Methods for DTO conversion
	    protected abstract T convertToEntity(TDTO dto);
	    protected abstract TDTO convertToDTO(T entity);
}
