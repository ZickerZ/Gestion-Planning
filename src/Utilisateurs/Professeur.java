/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilisateurs;

import Matières.Matières;
import Seances.Seances;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Raphaël
 */
@Entity
public class Professeur extends Utilisateur implements Serializable{
    
    @Column
    private String email, num_tel;
    
    @OneToMany
    private List<Seances> seances;
    
    @OneToMany
    private List<Matières> matiere;

    public Professeur(String email, List<Seances> seances, List<Matières> matiere, String nom, String prenom, String login, String mdp, int id) {
        super(nom, prenom, login, mdp, id);
        this.email = email;
        this.seances = seances;
        this.matiere = matiere;     
    }

    public Professeur() {
        super();
    }

    public Professeur(String email, List<Seances> seances, List<Matières> matiere, String nom, String prenom, String login, String mdp) {
        super(nom, prenom, login, mdp);
        this.email = email;
        this.seances = seances;
        this.matiere = matiere;
    }

    public String getEmail() {
        return email;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    public List<Seances> getSeances() {
        return seances;
    }

    public List<Matières> getMatiere() {
        return matiere;
    }

    public void setSeances(List<Seances> seances) {
        this.seances = seances;
    }

    public void setMatiere(List<Matières> matiere) {
        this.matiere = matiere;
    }    
}
