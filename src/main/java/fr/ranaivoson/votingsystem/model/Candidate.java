package fr.ranaivoson.votingsystem.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "candidates")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String candidateName;

    @ManyToMany(mappedBy = "candidates")
    private List<Candidate> candidates = new ArrayList<>();

    public Candidate() {
    }

    public Candidate(Long id, String candidateName) {
        super();
        this.id = id;
        this.candidateName = candidateName;
    }

    public Candidate(Long id, String candidateName, List<Candidate> candidates) {
        super();
        this.id = id;
        this.candidateName = candidateName;
        this.candidates = candidates;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }
}
