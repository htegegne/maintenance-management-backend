package com.habte.maintenance_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.habte.maintenance_management.model.Room;
import com.habte.maintenance_management.repository.RoomRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class RoomService extends GenericService<Room, Long> {

	/*
	 * @Autowired private RoomRepository roomRepository;
	 * 
	 * public List<Room> getAllRooms() { return roomRepository.findAll(); }
	 * 
	 * public Room getRoomById(Long roomId) { return roomRepository.findById(roomId)
	 * .orElseThrow(() -> new EntityNotFoundException("Room not found with id: " +
	 * roomId)); }
	 * 
	 * public Room createRoom(Room room) { return roomRepository.save(room); }
	 * 
	 * public Room updateRoom(Long roomId, Room updatedRoom) { return
	 * roomRepository.findById(roomId) .map(existingRoom -> {
	 * existingRoom.setNumber(updatedRoom.getNumber()); // Update other fields as
	 * needed return roomRepository.save(existingRoom); }) .orElseThrow(() -> new
	 * EntityNotFoundException("Room not found with id: " + roomId)); }
	 * 
	 * public void deleteRoom(Long roomId) { roomRepository.deleteById(roomId); }
	 */
}
