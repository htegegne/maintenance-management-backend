package com.habte.maintenance_management.model;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity

@Table(name = "maintenance_progress")
public class MaintenanceProgress {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "work_order_id")
    private WorkOrder workOrder;

    private LocalDateTime startedAt;
    private LocalDateTime inProcessAt;
    private LocalDateTime completedAt;
    private String description;
    private String replacedMaterials;
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
	 * @return the workOrder
	 */
	public WorkOrder getWorkOrder() {
		return workOrder;
	}
	/**
	 * @param workOrder the workOrder to set
	 */
	public void setWorkOrder(WorkOrder workOrder) {
		this.workOrder = workOrder;
	}
	/**
	 * @return the startedAt
	 */
	public LocalDateTime getStartedAt() {
		return startedAt;
	}
	/**
	 * @param startedAt the startedAt to set
	 */
	public void setStartedAt(LocalDateTime startedAt) {
		this.startedAt = startedAt;
	}
	/**
	 * @return the inProcessAt
	 */
	public LocalDateTime getInProcessAt() {
		return inProcessAt;
	}
	/**
	 * @param inProcessAt the inProcessAt to set
	 */
	public void setInProcessAt(LocalDateTime inProcessAt) {
		this.inProcessAt = inProcessAt;
	}
	/**
	 * @return the completedAt
	 */
	public LocalDateTime getCompletedAt() {
		return completedAt;
	}
	/**
	 * @param completedAt the completedAt to set
	 */
	public void setCompletedAt(LocalDateTime completedAt) {
		this.completedAt = completedAt;
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
	 * @return the replacedMaterials
	 */
	public String getReplacedMaterials() {
		return replacedMaterials;
	}
	/**
	 * @param replacedMaterials the replacedMaterials to set
	 */
	public void setReplacedMaterials(String replacedMaterials) {
		this.replacedMaterials = replacedMaterials;
	}
	@Override
	public int hashCode() {
		return Objects.hash(completedAt, description, id, inProcessAt, replacedMaterials, startedAt, workOrder);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MaintenanceProgress other = (MaintenanceProgress) obj;
		return Objects.equals(completedAt, other.completedAt) && Objects.equals(description, other.description)
				&& Objects.equals(id, other.id) && Objects.equals(inProcessAt, other.inProcessAt)
				&& Objects.equals(replacedMaterials, other.replacedMaterials)
				&& Objects.equals(startedAt, other.startedAt) && Objects.equals(workOrder, other.workOrder);
	}
	@Override
	public String toString() {
		return "MaintenanceProgress [id=" + id + ", workOrder=" + workOrder + ", startedAt=" + startedAt
				+ ", inProcessAt=" + inProcessAt + ", completedAt=" + completedAt + ", description=" + description
				+ ", replacedMaterials=" + replacedMaterials + "]";
	}
    
    
}
