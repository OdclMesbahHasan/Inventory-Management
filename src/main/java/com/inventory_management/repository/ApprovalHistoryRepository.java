package com.inventory_management.repository;

import com.inventory_management.model.ApprovalHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApprovalHistoryRepository extends JpaRepository<ApprovalHistory, Long> {
}
