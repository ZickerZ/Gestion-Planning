package Classes;


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
public class Classes implements Serializable {
        
    @Id
    @GeneratedValue
    private int id_classe;
    
    @Column(length=20)
    private String nom;
    
    @Column
    private int nb_eleves;

    @OneToMany
    private List<Seances> seances;

    public void setId_classe(int id_classe) {
        this.id_classe = id_classe;
    }

    public int getId_classe() {
        return id_classe;
    }

    public Classes(String nom, int nb_eleves, int id_classe, List<Seances> seances) {
        this.nom = nom;
        this.nb_eleves = nb_eleves;
        this.id_classe = id_classe;
        this.seances = seances;
    }

    public Classes(String nom, int nb_eleves, List<Seances> seances) {
        this.nom = nom;
        this.nb_eleves = nb_eleves;
        this.seances = seances;
    }

    public Classes() {
        super();
    }

    public String getNom() {
        return nom;
    }

    public int getNb_eleves() {
        return nb_eleves;
    }

    public List<Seances> getSeances() {
        return seances;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNb_eleves(int nb_eleves) {
        this.nb_eleves = nb_eleves;
    }

    public void setSeances(List<Seances> seances) {
        this.seances = seances;
    }
       
}
