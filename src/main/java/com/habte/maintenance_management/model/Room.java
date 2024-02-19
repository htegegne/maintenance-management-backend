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
@Table(name = "rooms")

public class Room {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String number;

	    @ManyToOne
	    @JoinColumn(name = "floor_id")
	    private Floor floor;

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
		 * @return the number
		 */
		public String getNumber() {
			return number;
		}

		/**
		 * @param number the number to set
		 */
		public void setNumber(String number) {
			this.number = number;
		}

		/**
		 * @return the floor
		 */
		public Floor getFloor() {
			return floor;
		}

		/**
		 * @param floor the floor to set
		 */
		public void setFloor(Floor floor) {
			this.floor = floor;
		}

		@Override
		public int hashCode() {
			return Objects.hash(floor, id, number);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Room other = (Room) obj;
			return Objects.equals(floor, other.floor) && Objects.equals(id, other.id)
					&& Objects.equals(number, other.number);
		}

		@Override
		public String toString() {
			return "Room [id=" + id + ", number=" + number + ", floor=" + floor + "]";
		}
	    
	    
}
