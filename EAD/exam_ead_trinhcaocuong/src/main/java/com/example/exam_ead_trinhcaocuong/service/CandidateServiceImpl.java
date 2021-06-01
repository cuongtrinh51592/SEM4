package com.example.exam_ead_trinhcaocuong.service;

import com.example.exam_ead_trinhcaocuong.entity.CandidateEntity;
import com.example.exam_ead_trinhcaocuong.repository.CandidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CandidateServiceImpl implements CandidateService{

    @Autowired
    private CandidateRepo candidateRepo;

    @Override
    public void saveCandidate(CandidateEntity candidateEntity) {
        this.candidateRepo.save(candidateEntity);
    }

    @Override
    public CandidateEntity getCandidateById(Integer id) {
        Optional<CandidateEntity> optional = candidateRepo.findById(id);
        CandidateEntity candidateEntity = null;
        if (optional.isPresent()) {
            candidateEntity = optional.get();
        } else {
            throw new RuntimeException(" Candidate not found for id :: " + id);
        }
        return candidateEntity;
    }

    @Override
    public void deleteCandidateById(Integer id) {
        this.candidateRepo.deleteById(id);
    }

    @Override
    public Page<CandidateEntity> findPaginated(Integer pageNo, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        return this.candidateRepo.findAll(pageable);
    }
}
