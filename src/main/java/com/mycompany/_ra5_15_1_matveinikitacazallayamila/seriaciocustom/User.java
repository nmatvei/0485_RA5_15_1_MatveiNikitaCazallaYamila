package com.mycompany._ra5_15_1_matveinikitacazallayamila.seriaciocustom;

import java.io.Serializable;

/**
 *
 * @author Nikita i Yamila
 */
public class User implements Serializable{
    
    private String nom;
    private String pas;
    
    public User(String nom, String pas) {
        
        this.nom = nom;
        this.pas = encriptarPas(pas);
        
    }
    
    public String encriptarPas(String pas) {
        
        String pasMayus = pas.toUpperCase();
        String pasEncriptada = "";
        final String xifratEnigma1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String xifratEnigma2 = "QWERTYUIOPASDFGHJKLZXCVBNM9876543210";
        
        for (int i = 0; i < pas.length(); i++) {
            int posChar = xifratEnigma1.indexOf(pasMayus.charAt(i));
            pasEncriptada += xifratEnigma2.charAt(posChar);
        }
        
        return pasEncriptada;
        
    }

    public String getNom() {
        return nom;
    }

    public String getPas() {
        return pas;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }
        
}