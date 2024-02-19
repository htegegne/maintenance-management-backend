package com.habte.maintenance_management.model;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "maintenance")
public class Maintenance {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String description;
	    private String type;
	    private String subType;
	    private String status = "Open";
	    private String priority;
	    private LocalDate lastMaintenanceDate;

	    @ManyToOne
	    @JoinColumn(name = "room_id")
	    private Room room;

	    @ManyToOne
	    @JoinColumn(name = "assigned_staff_id")
	    private Staff assignedStaff;

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

		/**
		 * @return the type
		 */
		public String getType() {
			return type;
		}

		/**
		 * @param type the type to set
		 */
		public void setType(String type) {
			this.type = type;
		}

		/**
		 * @return the subType
		 */
		public String getSubType() {
			return subType;
		}

		/**
		 * @param subType the subType to set
		 */
		public void setSubType(String subType) {
			this.subType = subType;
		}

		/**
		 * @return the status
		 */
		public String getStatus() {
			return status;
		}

		/**
		 * @param status the status to set
		 */
		public void setStatus(String status) {
			this.status = status;
		}

		/**
		 * @return the priority
		 */
		public String getPriority() {
			return priority;
		}

		/**
		 * @param priority the priority to set
		 */
		public void setPriority(String priority) {
			this.priority = priority;
		}

		/**
		 * @return the lastMaintenanceDate
		 */
		public LocalDate getLastMaintenanceDate() {
			return lastMaintenanceDate;
		}

		/**
		 * @param lastMaintenanceDate the lastMaintenanceDate to set
		 */
		public void setLastMaintenanceDate(LocalDate lastMaintenanceDate) {
			this.lastMaintenanceDate = lastMaintenanceDate;
		}

		/**
		 * @return the room
		 */
		public Room getRoom() {
			return room;
		}

		/**
		 * @param room the room to set
		 */
		public void setRoom(Room room) {
			this.room = room;
		}

		/**
		 * @return the assignedStaff
		 */
		public Staff getAssignedStaff() {
			return assignedStaff;
		}

		/**
		 * @param assignedStaff the assignedStaff to set
		 */
		public void setAssignedStaff(Staff assignedStaff) {
			this.assignedStaff = assignedStaff;
		}

		@Override
		public int hashCode() {
			return Objects.hash(assignedStaff, description, id, lastMaintenanceDate, priority, room, status, subType,
					type);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Maintenance other = (Maintenance) obj;
			return Objects.equals(assignedStaff, other.assignedStaff) && Objects.equals(description, other.description)
					&& Objects.equals(id, other.id) && Objects.equals(lastMaintenanceDate, other.lastMaintenanceDate)
					&& Objects.equals(priority, other.priority) && Objects.equals(room, other.room)
					&& Objects.equals(status, other.status) && Objects.equals(subType, other.subType)
					&& Objects.equals(type, other.type);
		}

		@Override
		public String toString() {
			return "Maintenance [id=" + id + ", description=" + description + ", type=" + type + ", subType=" + subType
					+ ", status=" + status + ", priority=" + priority + ", lastMaintenanceDate=" + lastMaintenanceDate
					+ ", room=" + room + ", assignedStaff=" + assignedStaff + "]";
		}

	    
}
