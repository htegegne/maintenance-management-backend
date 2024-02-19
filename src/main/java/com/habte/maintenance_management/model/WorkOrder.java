package com.habte.maintenance_management.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "work_orders")
public class WorkOrder {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "maintenance_id")
	    private Maintenance maintenance;

	    private String description;

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

		@Override
		public int hashCode() {
			return Objects.hash(description, id, maintenance);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			WorkOrder other = (WorkOrder) obj;
			return Objects.equals(description, other.description) && Objects.equals(id, other.id)
					&& Objects.equals(maintenance, other.maintenance);
		}

		@Override
		public String toString() {
			return "WorkOrder [id=" + id + ", maintenance=" + maintenance + ", description=" + description + "]";
		}
	    
	    
}
