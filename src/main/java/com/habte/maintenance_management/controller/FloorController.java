package com.habte.maintenance_management.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.habte.maintenance_management.dao.FloorDTO;
import com.habte.maintenance_management.model.Floor;
import com.habte.maintenance_management.service.GenericService;

@RestController
@RequestMapping("/api/floors")
public class FloorController extends GenericController<Floor, Long, FloorDTO>{

	@Override
	public GenericService<Floor, Long> getService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Floor convertToEntity(FloorDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected FloorDTO convertToDTO(Floor entity) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
