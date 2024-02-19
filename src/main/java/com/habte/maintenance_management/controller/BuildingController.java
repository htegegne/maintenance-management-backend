package com.habte.maintenance_management.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.habte.maintenance_management.dao.BuildingDTO;
import com.habte.maintenance_management.model.Building;
import com.habte.maintenance_management.service.GenericService;
@RestController
@RequestMapping("/api/buildings")
public class BuildingController extends GenericController<Building, Long, BuildingDTO>{

	@Override
	public GenericService<Building, Long> getService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Building convertToEntity(BuildingDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected BuildingDTO convertToDTO(Building entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
