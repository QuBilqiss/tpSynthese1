/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class Compte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private double solde;
    private boolean ouvert;
    private char classe;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public boolean isOuvert() {
        return ouvert;
    }

    public void setOuvert(boolean ouvert) {
        this.ouvert = ouvert;
    }

    public char getClasse() {
        return classe;
    }

    public void setClasse(char classe) {
        this.classe = classe;
    }

    public Compte() {
    }

    public Compte(String id, double solde) {
        this.id = id;
        this.solde = solde;
    }

    public Compte(String id, double solde, boolean ouvert, char classe) {
        this.id = id;
        this.solde = solde;
        this.ouvert = ouvert;
        this.classe = classe;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compte)) {
            return false;
        }
        Compte other = (Compte) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Compte[ id=" + id + " ]";
    }
    
}
