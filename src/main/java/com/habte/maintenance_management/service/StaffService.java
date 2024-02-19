package com.habte.maintenance_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.habte.maintenance_management.model.Staff;
import com.habte.maintenance_management.repository.StaffRepository;

import jakarta.persistence.EntityNotFoundException;


@Service
public class StaffService extends GenericService<Staff, Long>{

	/*
	 * @Autowired private StaffRepository staffRepository;
	 * 
	 * public List<Staff> getAllStaff() { return staffRepository.findAll(); }
	 * 
	 * public Staff getStaffById(Long staffId) { return
	 * staffRepository.findById(staffId) .orElseThrow(() -> new
	 * EntityNotFoundException("Staff not found with id: " + staffId)); }
	 * 
	 * public Staff createStaff(Staff staff) { return staffRepository.save(staff); }
	 * 
	 * public Staff updateStaff(Long staffId, Staff updatedStaff) { Staff
	 * existingStaff = getStaffById(staffId); // Update existingStaff with the
	 * fields from updatedStaff existingStaff.setName(updatedStaff.getName());
	 * existingStaff.setEmail(updatedStaff.getEmail());
	 * existingStaff.setPhone(updatedStaff.getPhone());
	 * existingStaff.setExpertise(updatedStaff.getExpertise());
	 * existingStaff.setRole(updatedStaff.getRole()); return
	 * staffRepository.save(existingStaff); }
	 * 
	 * public void deleteStaff(Long staffId) { staffRepository.deleteById(staffId);
	 * }
	 */
}
