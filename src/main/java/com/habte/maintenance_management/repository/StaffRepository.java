/**
 * 
 */
package com.habte.maintenance_management.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habte.maintenance_management.model.Staff;

/**
 * @author habta
 *
 */
public interface StaffRepository extends JpaRepository<Staff, Long> {

	Optional<Staff> findByEmail(String email); 
}
