package com.habte.maintenance_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.habte.maintenance_management.dao.WorkOrderDTO;
import com.habte.maintenance_management.model.WorkOrder;
import com.habte.maintenance_management.service.GenericService;
import com.habte.maintenance_management.service.WorkOrderService;

@RestController
@RequestMapping("/api/work_orders")
public class WorkOrderController extends GenericController<WorkOrder, Long, WorkOrderDTO> {

	@Autowired
	private WorkOrderService workOrderService;
	@Override
	public GenericService<WorkOrder, Long> getService() {
		// TODO Auto-generated method stub
		return workOrderService;
	}

	@Override
	protected WorkOrder convertToEntity(WorkOrderDTO dto) {
		// TODO Auto-generated method stub
		WorkOrder workOrder = new WorkOrder();
        workOrder.setId(dto.getId());
        workOrder.setDescription(dto.getDescription());
        // Map other fields as needed
        return workOrder;
	}

	@Override
	protected WorkOrderDTO convertToDTO(WorkOrder entity) {
		// TODO Auto-generated method stub
		 return new WorkOrderDTO(entity.getId(),entity.getMaintenance(), entity.getDescription());
	}

}
