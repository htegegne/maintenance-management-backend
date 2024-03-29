package com.habte.maintenance_management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.habte.maintenance_management.dao.StaffDTO;
import com.habte.maintenance_management.model.Staff;
import com.habte.maintenance_management.repository.StaffRepository;

import jakarta.persistence.EntityNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class StaffService extends GenericService<Staff, Long>{
	 @Autowired
	    private StaffRepository staffRepository;
	 
	 
	 public Staff validateUser(String email, String password) {
		 Optional<Staff> staffOptional = staffRepository.findByEmail(email);
		 if (staffOptional.isPresent()) {
			 Staff staff = staffOptional.get();
		 
			 if(staff.getPassword().equals(password)) {
			 return staff; 
			 }
		 } 
		 
			 return null;
		 
		 
	 }
	 public List<StaffDTO> getAllStaff() {
		 List<Staff> staff = staffRepository.findAll();
		 return StaffDTO.convertToStaffDTOList(staff);
	 }
}	 
	 
//	 @Autowired
//	    private BCryptPasswordEncoder passwordEncoder;

//	public Staff authenticate(String username, String password) {
//	        // Find a staff record with the provided email
//	        Optional<Staff> staffOptional = staffRepository.findByEmail(username);
//
//	     // If no staff record is found, throw an exception
//	        if (!staffOptional.isPresent()) {
//	            throw new EntityNotFoundException("Staff with email '" + username + "' not found.");
//	        }
//
//	        // Check if the password matches (using BCrypt)
//	        Staff staff = staffOptional.get();
//	        if (passwordEncoder.matches(password, staff.getPassword())) {
//	            // If password matches, return the authenticated staff
//	            return staff;
//	        }
//
//	        // If password doesn't match, throw an exception with a generic message
//	        throw new IllegalArgumentException("Invalid credentials.");
//	    }

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

