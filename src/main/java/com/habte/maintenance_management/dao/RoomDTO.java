package com.habte.maintenance_management.dao;

public class RoomDTO {

	private Long id;
    private String number;

    // Constructors, getters, and setters

    public RoomDTO() {
    }

    public RoomDTO(Long id, String number) {
        this.id = id;
        this.number = number;
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
    
}
