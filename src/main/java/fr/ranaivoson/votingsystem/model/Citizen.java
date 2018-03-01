package fr.ranaivoson.votingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "citizens")
public class Citizen {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "citizen_name")
    private String citizenName;

    public Citizen() {
    }

    public Citizen(Long id, String citizenName) {
        super();
        this.id = id;
        this.citizenName = citizenName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

}
