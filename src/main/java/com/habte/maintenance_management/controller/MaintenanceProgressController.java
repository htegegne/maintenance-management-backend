package com.habte.maintenance_management.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.habte.maintenance_management.dao.MaintenanceProgressDTO;
import com.habte.maintenance_management.model.MaintenanceProgress;
import com.habte.maintenance_management.service.GenericService;
@RestController
@RequestMapping("/api/maitenance_progresses")
public class MaintenanceProgressController extends GenericController<MaintenanceProgress, Long, MaintenanceProgressDTO> {

	@Override
	public GenericService<MaintenanceProgress, Long> getService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected MaintenanceProgress convertToEntity(MaintenanceProgressDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected MaintenanceProgressDTO convertToDTO(MaintenanceProgress entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
