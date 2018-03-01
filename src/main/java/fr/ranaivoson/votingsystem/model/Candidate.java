package fr.ranaivoson.votingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidates")
public class Candidate {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "candidate_name")
    private String candidateName;

    public Candidate() {
    }

    public Candidate(Long id, String candidateName) {
        super();
        this.id = id;
        this.candidateName = candidateName;
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

}
