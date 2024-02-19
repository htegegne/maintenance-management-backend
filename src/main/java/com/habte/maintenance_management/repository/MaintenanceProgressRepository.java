package com.habte.maintenance_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habte.maintenance_management.model.MaintenanceProgress;

public interface MaintenanceProgressRepository extends JpaRepository<MaintenanceProgress, Long> {

}
