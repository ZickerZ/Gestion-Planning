/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilisateurs;

import javax.persistence.Entity;

/**
 *
 * @author Raphaël
 */
@Entity
public class Administrateur extends Utilisateur{

    public Administrateur(String nom, String prenom, String login, String mdp, int id) {
        super(nom, prenom, login, mdp, id);
    }

    public Administrateur() {
        super();
    }

    public Administrateur(String nom, String prenom, String login, String mdp) {
        super(nom, prenom, login, mdp);
    }
 
}
