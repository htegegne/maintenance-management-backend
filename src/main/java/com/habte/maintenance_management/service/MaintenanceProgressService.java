package com.habte.maintenance_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.habte.maintenance_management.model.MaintenanceProgress;
import com.habte.maintenance_management.repository.MaintenanceProgressRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class MaintenanceProgressService extends GenericService<MaintenanceProgress, Long> {

	/*
	 * @Autowired private MaintenanceProgressRepository
	 * maintenanceProgressRepository;
	 * 
	 * public List<MaintenanceProgress> getAllMaintenanceProgress() { return
	 * maintenanceProgressRepository.findAll(); }
	 * 
	 * public MaintenanceProgress getMaintenanceProgressById(Long progressId) {
	 * return maintenanceProgressRepository.findById(progressId) .orElseThrow(() ->
	 * new EntityNotFoundException("MaintenanceProgress not found with id: " +
	 * progressId)); }
	 * 
	 * public MaintenanceProgress createMaintenanceProgress(MaintenanceProgress
	 * progress) { return maintenanceProgressRepository.save(progress); }
	 * 
	 * public MaintenanceProgress updateMaintenanceProgress(Long progressId,
	 * MaintenanceProgress updatedProgress) { return
	 * maintenanceProgressRepository.findById(progressId) .map(existingProgress -> {
	 * existingProgress.setWorkOrder(updatedProgress.getWorkOrder());
	 * existingProgress.setStartedAt(updatedProgress.getStartedAt());
	 * existingProgress.setInProcessAt(updatedProgress.getInProcessAt());
	 * existingProgress.setCompletedAt(updatedProgress.getCompletedAt());
	 * existingProgress.setDescription(updatedProgress.getDescription());
	 * existingProgress.setReplacedMaterials(updatedProgress.getReplacedMaterials())
	 * ; // Update other fields as needed return
	 * maintenanceProgressRepository.save(existingProgress); }) .orElseThrow(() ->
	 * new EntityNotFoundException("MaintenanceProgress not found with id: " +
	 * progressId)); }
	 * 
	 * public void deleteMaintenanceProgress(Long progressId) {
	 * maintenanceProgressRepository.deleteById(progressId); }
	 */
}
