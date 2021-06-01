package com.example.exam_ead_trinhcaocuong.repository;

import com.example.exam_ead_trinhcaocuong.entity.CandidateEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepo extends PagingAndSortingRepository<CandidateEntity, Integer> {
}
