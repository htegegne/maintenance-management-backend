package com.habte.maintenance_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habte.maintenance_management.model.Building;

public interface BuildingRepository extends JpaRepository<Building, Long> {

}
