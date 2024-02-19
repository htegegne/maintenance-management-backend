package com.habte.maintenance_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habte.maintenance_management.model.WorkOrder;

public interface WorkOrderRepository extends JpaRepository<WorkOrder, Long> {

}
