package com.habte.maintenance_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habte.maintenance_management.model.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {

}
