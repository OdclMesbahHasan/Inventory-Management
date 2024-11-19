package com.inventory_management.service;

import com.inventory_management.model.Requisition;
import com.inventory_management.repository.RequisitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class RequisitionService {
    @Autowired
    private RequisitionRepository requisitionRepository;

    public List<Requisition> getAllRequisitions() {
        return requisitionRepository.findAll();
    }

    public Optional<Requisition> getRequisitionById(Long id) {
        return requisitionRepository.findById(id);
    }

    public Requisition saveRequisition(Requisition requisition) {
        return requisitionRepository.save(requisition);
    }

    public void deleteRequisition(Long id) {
        requisitionRepository.deleteById(id);
    }

}
