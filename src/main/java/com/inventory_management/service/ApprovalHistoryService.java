package com.inventory_management.service;

import com.inventory_management.model.ApprovalHistory;
import com.inventory_management.repository.ApprovalHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprovalHistoryService {

    @Autowired
    private ApprovalHistoryRepository approvalHistoryRepository;

    public List<ApprovalHistory> getApprovalHistoryByRequisitionId(Long reqId) {
        return approvalHistoryRepository.findAll();
    }

    public ApprovalHistory saveApprovalHistory(ApprovalHistory approvalHistory) {
        return approvalHistoryRepository.save(approvalHistory);
    }
}
