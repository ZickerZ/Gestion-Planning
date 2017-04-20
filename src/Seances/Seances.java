package Seances;


import Salles.Salles;
import Matières.Matières;
import Classes.Classes;
import java.util.Date;
import Utilisateurs.Professeur;
import java.io.Serializable;
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
public class Seances implements Serializable {
    
    @Id
    @GeneratedValue
    private int id_seance;
    
    @Column
    private int heure_deb, heure_fin;
    
    @Column
    private Date date;
    
    @ManyToOne
    Salles salle;
    
    @ManyToOne
    Classes classe;
    
    @ManyToOne
    Professeur prof;
    
    @ManyToOne
    Matières matiere;

    public Seances(int id_seance, int heure_deb, int heure_fin, Date date, Salles salle, Classes classe, Professeur prof, Matières matiere) {
        this.id_seance = id_seance;
        this.heure_deb = heure_deb;
        this.heure_fin = heure_fin;
        this.date = date;
        this.salle = salle;
        this.classe = classe;
        this.prof = prof;
        this.matiere = matiere;
    }

    public Seances(int heure_deb, int heure_fin, Date date, Salles salle, Classes classe, Professeur prof, Matières matiere) {
        this.heure_deb = heure_deb;
        this.heure_fin = heure_fin;
        this.date = date;
        this.salle = salle;
        this.classe = classe;
        this.prof = prof;
        this.matiere = matiere;
    }

    public Seances() {
        super();
    }
    
    public void setId_seance(int id_seance) {
        this.id_seance = id_seance;
    }

    public void setHeure_deb(int heure_deb) {
        this.heure_deb = heure_deb;
    }

    public void setHeure_fin(int heure_fin) {
        this.heure_fin = heure_fin;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSalle(Salles salle) {
        this.salle = salle;
    }

    public void setClasse(Classes classe) {
        this.classe = classe;
    }

    public void setProf(Professeur prof) {
        this.prof = prof;
    }

    public void setMatiere(Matières matiere) {
        this.matiere = matiere;
    }
    
    public int getId_seance() {
        return id_seance;
    }

    public int getHeure_deb() {
        return heure_deb;
    }

    public int getHeure_fin() {
        return heure_fin;
    }

    public Date getDate() {
        return date;
    }

    public Salles getSalle() {
        return salle;
    }

    public Classes getClasse() {
        return classe;
    }

    public Professeur getProf() {
        return prof;
    }

    public Matières getMatiere() {
        return matiere;
    }
    
}
