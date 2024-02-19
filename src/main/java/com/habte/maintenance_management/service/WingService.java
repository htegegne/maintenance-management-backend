package com.habte.maintenance_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.habte.maintenance_management.model.Wing;
import com.habte.maintenance_management.repository.WingRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class WingService extends GenericService<Wing, Long> {

	/*
	 * @Autowired private WingRepository wingRepository;
	 * 
	 * public List<Wing> getAllWings() { return wingRepository.findAll(); }
	 * 
	 * public Wing getWingById(Long wingId) { return wingRepository.findById(wingId)
	 * .orElseThrow(() -> new EntityNotFoundException("Wing not found with id: " +
	 * wingId)); }
	 * 
	 * public Wing createWing(Wing wing) { return wingRepository.save(wing); }
	 * 
	 * public Wing updateWing(Long wingId, Wing updatedWing) { return
	 * wingRepository.findById(wingId) .map(existingWing -> {
	 * existingWing.setName(updatedWing.getName()); // Update other fields as needed
	 * return wingRepository.save(existingWing); }) .orElseThrow(() -> new
	 * EntityNotFoundException("Wing not found with id: " + wingId)); }
	 * 
	 * public void deleteWing(Long wingId) { wingRepository.deleteById(wingId); }
	 */
	
}
