/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fenetre;

/**
 *
 * @author boursaliamel
 */
public class Inscrit {
    String nom, prenom,adresse,ville,formation;
    

public Inscrit(String n, String p,String a,String v,String f){
    this.nom = n;
    this.prenom=p;
    this.adresse=a;
    this.ville=v;
    this.formation=f;
}

public int enregistrer(){  
        
        String req = "insert into bdinscrit (nom,prenom,adresse,ville,fromation)values("+nom+","+prenom+","+adresse+","+ville+","+formation+")";
        int i = ConnexionDB.executeMiseAJr(req);
        return i;
        

}


}


  
