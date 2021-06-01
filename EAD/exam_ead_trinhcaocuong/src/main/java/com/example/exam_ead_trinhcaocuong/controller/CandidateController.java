package com.example.exam_ead_trinhcaocuong.controller;

import com.example.exam_ead_trinhcaocuong.entity.CandidateEntity;
import com.example.exam_ead_trinhcaocuong.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CandidateController {

    @Autowired
    private CandidateService candidateService;


    @GetMapping("/")
    public String viewHomePage(Model model) {
        return findPaginated(1, model);
    }

    @GetMapping("/showNewCandidateForm")
    public String showNewCandidateForm(Model model) {
        CandidateEntity candidateEntity = new CandidateEntity();
        model.addAttribute("candidate", candidateEntity);
        return "new_candidate";
    }

    @PostMapping("/saveCandidate")
    public String saveCandidate(@ModelAttribute("candidate") CandidateEntity candidateEntity) {
        candidateService.saveCandidate(candidateEntity);
        return "redirect:/";
    }

    @GetMapping("/detail/{id}")
    public String getDetail(@PathVariable(value = "id") Integer id, Model model) {
        CandidateEntity candidateEntity = candidateService.getCandidateById(id);
        model.addAttribute("candidate", candidateEntity);
        return "detail";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable( value = "id") Integer id, Model model) {

        CandidateEntity candidateEntity = candidateService.getCandidateById(id);

        model.addAttribute("candidate", candidateEntity);
        return "update_candidate";
    }


    @GetMapping("/deleteCandidate/{id}")
    public String deleteCandidate(@PathVariable (value = "id") Integer id) {

        this.candidateService.deleteCandidateById(id);
        return "redirect:/";
    }

    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model) {
        int pageSize = 5;

        Page<CandidateEntity> page = candidateService.findPaginated(pageNo, pageSize);
        List<CandidateEntity> listCandidates = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("listCandidates", listCandidates);
        return "index";
    }
}
