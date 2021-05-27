package dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.concrete.Staff;

public interface StaffUserDao extends JpaRepository<Staff, Integer>{

}