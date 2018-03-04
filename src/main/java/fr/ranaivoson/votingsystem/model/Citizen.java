package fr.ranaivoson.votingsystem.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "citizens")
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String citizenName;

    @ManyToMany(mappedBy = "citizens")
    private List<Citizen> citizens = new ArrayList<>();

    public Citizen() {
    }

    public Citizen(Long id, String citizenName) {
        super();
        this.id = id;
        this.citizenName = citizenName;
    }

    public Citizen(Long id, String citizenName, List<Citizen> citizens) {
        super();
        this.id = id;
        this.citizenName = citizenName;
        this.citizens = citizens;
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

    public List<Citizen> getCitizens() {
        return citizens;
    }

    public void setCitizens(List<Citizen> citizens) {
        this.citizens = citizens;
    }

}
