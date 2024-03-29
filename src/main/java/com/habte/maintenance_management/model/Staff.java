package com.habte.maintenance_management.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff implements Serializable {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;

	   // @Column(unique = true)
	    private String email;

	    private String phone;
	    private String password;
	    private String role;
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
		@Override
		public int hashCode() {
			return Objects.hash(email, password, id, name, phone, role);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Staff other = (Staff) obj;
			return Objects.equals(email, other.email) && Objects.equals(password, other.password)
					&& Objects.equals(id, other.id) && Objects.equals(name, other.name)
					&& Objects.equals(phone, other.phone) && Objects.equals(role, other.role);
		}
		@Override
		public String toString() {
			return "Staff [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", expertise="
					+ password + ", role=" + role + "]";
		}
	    
	    
}
