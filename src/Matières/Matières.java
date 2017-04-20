package Matières;


import Utilisateurs.Professeur;
import Seances.Seances;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raphaël
 */
@Entity
public class Matières implements Serializable {
    @Id
    @GeneratedValue
    private int id_matiere;
    
    @Column(length=20)
    private String nom_matiere;
    
    @ManyToOne
    private Professeur prof;
    
    @OneToMany
    private List<Seances> seances;

    public Matières(int id_matiere, String nom_matiere, Professeur prof, List<Seances> seances) {
        this.id_matiere = id_matiere;
        this.nom_matiere = nom_matiere;
        this.prof = prof;
        this.seances = seances;
    }

    public Matières(String nom_matiere, Professeur prof, List<Seances> seances) {
        this.nom_matiere = nom_matiere;
        this.prof = prof;
        this.seances = seances;
    }

    public Matières() {
        super();
    }
    
    public int getId_matiere() {
        return id_matiere;
    }

    public String getNom_matiere() {
        return nom_matiere;
    }

    public Professeur getProf() {
        return prof;
    }

    public List<Seances> getSeances() {
        return seances;
    }

    public void setId_matiere(int id_matiere) {
        this.id_matiere = id_matiere;
    }

    public void setNom_matiere(String nom_matiere) {
        this.nom_matiere = nom_matiere;
    }

    public void setProf(Professeur prof) {
        this.prof = prof;
    }

    public void setSeances(List<Seances> seances) {
        this.seances = seances;
    }
}
