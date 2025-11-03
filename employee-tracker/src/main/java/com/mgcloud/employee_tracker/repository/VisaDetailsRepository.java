package com.mgcloud.employee_tracker.repository;

import com.mgcloud.employee_tracker.model.VisaDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisaDetailsRepository extends JpaRepository<VisaDetails, Long> {
}
