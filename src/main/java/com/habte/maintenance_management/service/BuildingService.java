package com.habte.maintenance_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.habte.maintenance_management.model.Building;
import com.habte.maintenance_management.repository.BuildingRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class BuildingService extends GenericService<Building, Long> {

	/*
	 * @Autowired private BuildingRepository buildingRepository;
	 * 
	 * public List<Building> getAllBuildings() { return
	 * buildingRepository.findAll(); }
	 * 
	 * public Building getBuildingById(Long buildingId) { return
	 * buildingRepository.findById(buildingId) .orElseThrow(() -> new
	 * EntityNotFoundException("Building not found with id: " + buildingId)); }
	 * 
	 * public Building createBuilding(Building building) { return
	 * buildingRepository.save(building); }
	 * 
	 * public Building updateBuilding(Long buildingId, Building updatedBuilding) {
	 * Building existingBuilding = getBuildingById(buildingId); // Update
	 * existingBuilding with the fields from updatedBuilding
	 * existingBuilding.setName(updatedBuilding.getName()); return
	 * buildingRepository.save(existingBuilding); }
	 * 
	 * public void deleteBuilding(Long buildingId) {
	 * buildingRepository.deleteById(buildingId); }
	 */
}
