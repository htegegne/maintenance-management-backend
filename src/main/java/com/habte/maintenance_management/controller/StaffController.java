package com.habte.maintenance_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.habte.maintenance_management.dao.StaffDTO;
import com.habte.maintenance_management.model.Staff;
import com.habte.maintenance_management.service.GenericService;
import com.habte.maintenance_management.service.StaffService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/staff")
public class StaffController extends GenericController<Staff, Long, StaffDTO>{
	
	@Autowired
	private StaffService staffService;
//	@PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody Staff staff) {
//		String email = staff.getEmail();
//        String password = staff.getPassword();
//        Staff loggedInStaff = staffService.validateUser(email, password);
//
//        if (loggedInStaff != null) {
//            String message = "Login successful. Welcome, " + loggedInStaff.getName() + "!";
//            return ResponseEntity.ok().body(message);
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }
//    }

	@Override
	public GenericService<Staff, Long> getService() {
		// TODO Auto-generated method stub
		return staffService;
	}

	@Override
	protected Staff convertToEntity(StaffDTO dto) {
		// TODO Auto-generated method stub
		Staff staff = new Staff();
		staff.setId(dto.getId());
		staff.setName(dto.getName());
		staff.setEmail(dto.getEmail());
		staff.setPhone(dto.getPhone());
		staff.setPassword(dto.getPassword());
		staff.setRole(dto.getRole());
		return staff;
	}

	@Override
	protected StaffDTO convertToDTO(Staff entity) {
		// TODO Auto-generated method stub
		return new StaffDTO(entity.getId(),entity.getName(), entity.getEmail(), 
					entity.getPhone(), entity.getPassword(), entity.getRole());
	}

	@GetMapping("/all_staff")
    public ResponseEntity<List<StaffDTO>> getAllStaff() {
        try {
        	List<StaffDTO> staff = staffService.getAllStaff();
        	return ResponseEntity.ok(staff);
        	
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
	}
	
}
