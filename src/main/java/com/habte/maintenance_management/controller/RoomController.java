package com.habte.maintenance_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.habte.maintenance_management.dao.RoomDTO;
import com.habte.maintenance_management.model.Room;
import com.habte.maintenance_management.service.GenericService;
import com.habte.maintenance_management.service.RoomService;
@RestController
@RequestMapping("/api/rooms")
public class RoomController extends GenericController<Room, Long, RoomDTO> {

	

	 @Autowired
	    private RoomService roomService;

	    @Override
	    public GenericService<Room, Long> getService() {
	        return roomService;
	    }

	    @Override
	    protected Room convertToEntity(RoomDTO roomDTO) {
	        Room room = new Room();
	        room.setId(roomDTO.getId());
	        room.setNumber(roomDTO.getNumber());
	        return room;
	    }

		@Override
		protected RoomDTO convertToDTO(Room entity) {
			// TODO Auto-generated method stub
			return new RoomDTO(entity.getId(), entity.getNumber());
		}

}
