package com.habte.maintenance_management.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.habte.maintenance_management.dao.WingDTO;
import com.habte.maintenance_management.model.Wing;
import com.habte.maintenance_management.service.GenericService;

@RestController
@RequestMapping("/api/wings")
public class WingController extends GenericController<Wing, Long, WingDTO> {

	@Override
	public GenericService<Wing, Long> getService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Wing convertToEntity(WingDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected WingDTO convertToDTO(Wing entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
