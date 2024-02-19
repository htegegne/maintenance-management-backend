package com.habte.maintenance_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.habte.maintenance_management.model.WorkOrder;
import com.habte.maintenance_management.repository.WorkOrderRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class WorkOrderService extends GenericService<WorkOrder, Long> {
	/*
	 * @Autowired private WorkOrderRepository workOrderRepository;
	 * 
	 * public List<WorkOrder> getAllWorkOrders() { return
	 * workOrderRepository.findAll(); }
	 * 
	 * public WorkOrder getWorkOrderById(Long workOrderId) { return
	 * workOrderRepository.findById(workOrderId) .orElseThrow(() -> new
	 * EntityNotFoundException("WorkOrder not found with id: " + workOrderId)); }
	 * 
	 * public WorkOrder createWorkOrder(WorkOrder workOrder) { return
	 * workOrderRepository.save(workOrder); }
	 * 
	 * public WorkOrder updateWorkOrder(Long workOrderId, WorkOrder
	 * updatedWorkOrder) { return workOrderRepository.findById(workOrderId)
	 * .map(existingWorkOrder -> {
	 * existingWorkOrder.setMaintenance(updatedWorkOrder.getMaintenance());
	 * existingWorkOrder.setDescription(updatedWorkOrder.getDescription()); //
	 * Update other fields as needed return
	 * workOrderRepository.save(existingWorkOrder); }) .orElseThrow(() -> new
	 * EntityNotFoundException("WorkOrder not found with id: " + workOrderId)); }
	 * 
	 * public void deleteWorkOrder(Long workOrderId) {
	 * workOrderRepository.deleteById(workOrderId); }
	 */
}
