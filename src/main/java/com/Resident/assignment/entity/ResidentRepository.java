package com.Resident.assignment.entity;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ResidentRepository extends JpaRepository<Resident,Long> {
}
