package com.habte.maintenance_management.dao;

import java.util.List;
import java.util.stream.Collectors;

import com.habte.maintenance_management.model.Staff;

public class StaffDTO {

	private Long id;

    private String name;

   
    private String email;

    private String phone;
    private String password;
    private String role;
	public StaffDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StaffDTO(Long id, String name, String email, String phone, String password, String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.role = role;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the expertise
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the expertise to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	public static StaffDTO convertToStaffDTO(Staff staff) {
		// TODO Auto-generated method stub
		StaffDTO staffDTO = new StaffDTO();
		staffDTO.setId(staff.getId());
		staffDTO.setName(staff.getName());
		staffDTO.setEmail(staff.getEmail());
		staffDTO.setPassword(staff.getPassword());
		staffDTO.setPhone(staff.getPhone());
		staffDTO.setRole(staff.getRole());
		return staffDTO;
	}
    
	public static List<StaffDTO> convertToStaffDTOList(List<Staff> staff) {
		return staff.stream()
				.map(StaffDTO::convertToStaffDTO)
				.collect(Collectors.toList());
	}
}
