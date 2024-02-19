package com.habte.maintenance_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.habte.maintenance_management.model.Floor;
import com.habte.maintenance_management.repository.FloorRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class FloorService extends GenericService<Floor, Long>{

	/*
	 * @Autowired private FloorRepository floorRepository;
	 * 
	 * public List<Floor> getAllFloors() { return floorRepository.findAll(); }
	 * 
	 * public Floor getFloorById(Long floorId) { return
	 * floorRepository.findById(floorId) .orElseThrow(() -> new
	 * EntityNotFoundException("Floor not found with id: " + floorId)); }
	 * 
	 * public Floor createFloor(Floor floor) { return floorRepository.save(floor); }
	 * 
	 * public Floor updateFloor(Long floorId, Floor updatedFloor) { return
	 * floorRepository.findById(floorId) .map(existingFloor -> {
	 * existingFloor.setName(updatedFloor.getName()); // Update other fields as
	 * needed return floorRepository.save(existingFloor); }) .orElseThrow(() -> new
	 * EntityNotFoundException("Floor not found with id: " + floorId)); }
	 * 
	 * public void deleteFloor(Long floorId) { floorRepository.deleteById(floorId);
	 * }
	 */
}
