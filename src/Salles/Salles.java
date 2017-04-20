package Salles;


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
public class Salles implements Serializable {
    
    @Column(length=20)
    private String nom_salle;
    
    @Column
    private int nb_places;
    
    @Id
    @GeneratedValue
    private int id_salle;
    
    @OneToMany
    List<Seances> seances;

    public Salles(String nom_salle, int nb_places, int id_salle, List<Seances> seances) {
        this.nom_salle = nom_salle;
        this.nb_places = nb_places;
        this.id_salle = id_salle;
        this.seances = seances;
    }

    public Salles() {
        super();
    }

    public Salles(String nom_salle, int nb_places, List<Seances> seances) {
        this.nom_salle = nom_salle;
        this.nb_places = nb_places;
        this.seances = seances;
    }
    
    public String getNom_salle() {
        return nom_salle;
    }

    public int getNb_places() {
        return nb_places;
    }

    public int getId_salle() {
        return id_salle;
    }

    public List<Seances> getSeances() {
        return seances;
    }

    public void setNom_salle(String nom_salle) {
        this.nom_salle = nom_salle;
    }

    public void setNb_places(int nb_places) {
        this.nb_places = nb_places;
    }

    public void setId_salle(int id_salle) {
        this.id_salle = id_salle;
    }

    public void setSeances(List<Seances> seances) {
        this.seances = seances;
    }      
}
