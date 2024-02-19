package com.habte.maintenance_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habte.maintenance_management.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
