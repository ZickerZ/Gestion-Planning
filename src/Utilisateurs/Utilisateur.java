/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilisateurs;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Raphaël
 */
@Entity
public abstract class Utilisateur implements Serializable {
    
    @Column(length=20)
    private String nom, prenom, login, mdp;
    
    
    @Id
    @GeneratedValue
    private int id_user;
    
    public enum typePersonne{
        Administrateur,
        Professeur;
    }

    public Utilisateur(String nom, String prenom, String login, String mdp, int id) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.mdp = mdp;
        this.id_user = id;
    }

    public Utilisateur() {
        super();
    }

    public void setId(int id) {
        this.id_user = id;
    }

    public int getId() {
        return id_user;
    }

    public Utilisateur(String nom, String prenom, String login, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.mdp = mdp;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLogin() {
        return login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
