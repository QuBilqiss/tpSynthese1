/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;

/**
 *
 * @author user
 */
public class ComteService extends AbstractFacade<Compte> {

    public ComteService() {
        super(Compte.class);
    }
    public void initBD(){
        for (int i = 1; i < 10; i++) {
            ouvrirCompt("EE"+i,i*100);
        }
    }
     public Compte ouvrirCompt(String rib,double soldeInitial){
        Compte c1=new Compte();
         c1.setId(rib);
        c1.setSolde(soldeInitial);
        c1.setOuvert(true);
       
        if(c1.getSolde() >=0&&c1.getSolde() <=200){
        c1.setClasse('D');
        } 
        else if(c1.getSolde() >200 && c1.getSolde() <=1000){
        c1.setClasse('C');
        } 
        else if(c1.getSolde() >1000&& c1.getSolde() <=60000){
        c1.setClasse('B');
        } 
       
        else{
         c1.setClasse('A');
        }
        create(c1);
        return c1;
     }
      public int debiterCompt(String rib,double montant){
        Compte compte=find(rib);
        if(compte==null){
            return -6;
        }
        else if(compte.isOuvert()==false){
        return -1;
        }
        else if(compte.getSolde()<montant){
            return -3;
        }
        else{   double nvsolde=compte.getSolde()-montant;
            if(nvsolde<100){
            return -4;
            }
            else if(montant>60000){
            return -2;
            }
            else{
            compte.setSolde(nvsolde);
                edit(compte);
            return 1;
            }
        }
      }
  
    public int transferer(String rib1,String rib2,double montant){          
        Compte c1=find(rib1);
        Compte c2=find(rib2);
        if(c1==null) return -1;
        if(c2==null) return -2;
        if(c1.isOuvert()==false){
           return -3;
       }
        if(c2.isOuvert()==false){
           return -4;
       }
       if( c1.getSolde()<montant){
       return -5;
       }
       else {
           double nvsolde1=c1.getSolde()-montant;
           
           c1.setSolde(nvsolde1);
           double nvsolde2=c2.getSolde()+montant;
           c2.setSolde(nvsolde2);
           edit(c2);
           edit(c1);
           return 1;
       }
    }
    
}
