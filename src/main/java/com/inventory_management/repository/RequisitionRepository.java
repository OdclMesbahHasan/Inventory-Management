package com.inventory_management.repository;

import com.inventory_management.model.Requisition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequisitionRepository extends JpaRepository<Requisition, Long> {
}
