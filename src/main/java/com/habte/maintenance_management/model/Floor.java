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
@Table(name = "floors")
public class Floor {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "wing_id")
    private Wing wing;

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
	 * @return the wing
	 */
	public Wing getWing() {
		return wing;
	}

	/**
	 * @param wing the wing to set
	 */
	public void setWing(Wing wing) {
		this.wing = wing;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, wing);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Floor other = (Floor) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(wing, other.wing);
	}

	@Override
	public String toString() {
		return "Floor [id=" + id + ", name=" + name + ", wing=" + wing + "]";
	}
    
    
    
}
