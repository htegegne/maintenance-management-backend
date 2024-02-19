package com.habte.maintenance_management.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.habte.maintenance_management.dao.MaintenanceDTO;
import com.habte.maintenance_management.model.Maintenance;
import com.habte.maintenance_management.service.GenericService;
@RestController
@RequestMapping("/api/maintenances")
public class MaintenanceController extends GenericController<Maintenance, Long, MaintenanceDTO> {

	@Override
	public GenericService<Maintenance, Long> getService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Maintenance convertToEntity(MaintenanceDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected MaintenanceDTO convertToDTO(Maintenance entity) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
