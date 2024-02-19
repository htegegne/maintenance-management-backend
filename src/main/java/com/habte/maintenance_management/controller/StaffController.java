package com.habte.maintenance_management.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.habte.maintenance_management.dao.StaffDTO;
import com.habte.maintenance_management.model.Staff;
import com.habte.maintenance_management.service.GenericService;

@RestController
@RequestMapping("/api/staffs")
public class StaffController extends GenericController<Staff, Long, StaffDTO>{

	@Override
	public GenericService<Staff, Long> getService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Staff convertToEntity(StaffDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected StaffDTO convertToDTO(Staff entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
