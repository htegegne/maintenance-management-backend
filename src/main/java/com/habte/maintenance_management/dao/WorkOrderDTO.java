package com.habte.maintenance_management.dao;

import com.habte.maintenance_management.model.Maintenance;

public class WorkOrderDTO {

	private Long id;
	 private Maintenance maintenance;

	    private String description;

		

		public WorkOrderDTO(Long id, Maintenance maintenance, String description) {
			//super();
			this.id = id;
			this.maintenance = maintenance;
			this.description = description;
		}

		public WorkOrderDTO() {
			super();
		}

		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}

		/**
		 * @return the maintenance
		 */
		public Maintenance getMaintenance() {
			return maintenance;
		}

		/**
		 * @param maintenance the maintenance to set
		 */
		public void setMaintenance(Maintenance maintenance) {
			this.maintenance = maintenance;
		}

		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}
	    
	    
}
