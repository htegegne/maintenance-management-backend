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
@Table(name = "wings")
public class Wing {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building building;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the building
	 */
	public Building getBuilding() {
		return building;
	}

	/**
	 * @param building the building to set
	 */
	public void setBuilding(Building building) {
		this.building = building;
	}

	@Override
	public int hashCode() {
		return Objects.hash(building, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wing other = (Wing) obj;
		return Objects.equals(building, other.building) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Wing [id=" + id + ", name=" + name + ", building=" + building + "]";
	}
    
    
}
