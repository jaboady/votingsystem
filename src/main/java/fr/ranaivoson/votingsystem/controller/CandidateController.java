package fr.ranaivoson.votingsystem.controller;

import fr.ranaivoson.votingsystem.repositories.CandidateRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CandidateController {

    private CandidateRepository candidateRepository;

    public CandidateController(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @RequestMapping("/candidates")
    public String getCandidates(Model model) {
        model.addAttribute("candidates", candidateRepository.findAll());
        return "candidates";
    }

}
