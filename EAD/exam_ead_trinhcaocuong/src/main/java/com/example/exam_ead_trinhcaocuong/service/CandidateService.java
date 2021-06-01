package com.example.exam_ead_trinhcaocuong.service;

import com.example.exam_ead_trinhcaocuong.entity.CandidateEntity;
import org.springframework.data.domain.Page;

public interface CandidateService {
    void saveCandidate(CandidateEntity candidateEntity);
    CandidateEntity getCandidateById(Integer id);
    void deleteCandidateById(Integer id);
    Page<CandidateEntity> findPaginated(Integer pageNo, Integer pageSize );
}
