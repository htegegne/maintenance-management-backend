package com.habte.maintenance_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.habte.maintenance_management.model.Maintenance;

@Service
public class MaintenanceService extends GenericService<Maintenance, Long> {

	/*
	 * @Autowired private MaintenanceRepository maintenanceRepository;
	 * 
	 * public List<Maintenance> getAllMaintenance() { return
	 * maintenanceRepository.findAll(); }
	 * 
	 * public Maintenance getMaintenanceById(Long maintenanceId) { return
	 * maintenanceRepository.findById(maintenanceId) .orElseThrow(() -> new
	 * EntityNotFoundException("Maintenance not found with id: " + maintenanceId));
	 * }
	 * 
	 * public Maintenance createMaintenance(Maintenance maintenance) { return
	 * maintenanceRepository.save(maintenance); }
	 * 
	 * public Maintenance updateMaintenance(Long maintenanceId, Maintenance
	 * updatedMaintenance) { return maintenanceRepository.findById(maintenanceId)
	 * .map(existingMaintenance -> {
	 * existingMaintenance.setDescription(updatedMaintenance.getDescription());
	 * existingMaintenance.setType(updatedMaintenance.getType());
	 * existingMaintenance.setSubType(updatedMaintenance.getSubType());
	 * existingMaintenance.setStatus(updatedMaintenance.getStatus());
	 * existingMaintenance.setPriority(updatedMaintenance.getPriority());
	 * existingMaintenance.setRoom(updatedMaintenance.getRoom());
	 * existingMaintenance.setAssignedStaff(updatedMaintenance.getAssignedStaff());
	 * // Update other fields as needed return
	 * maintenanceRepository.save(existingMaintenance); }) .orElseThrow(() -> new
	 * EntityNotFoundException("Maintenance not found with id: " + maintenanceId));
	 * }
	 * 
	 * public void deleteMaintenance(Long maintenanceId) {
	 * maintenanceRepository.deleteById(maintenanceId); }
	 */
}
