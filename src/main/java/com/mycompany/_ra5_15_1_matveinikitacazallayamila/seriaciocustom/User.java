package com.mycompany._ra5_15_1_matveinikitacazallayamila.seriaciocustom;

import java.io.Serializable;

/**
 * Classe User que representa l'usuari d'una sessió (Sessio) i que té nom i
 * contrasenya que es guarda encriptada.
 * 
 * @author Nikita i Yamila
 */
public class User implements Serializable{
    
    // Declaració d'atributs
    private String nom;
    private String pas;
    
    // Declaració de les constants per encriptar la contrasenya
    private final String xifratEnigma1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "abcdefghijklmnopqrstuvwxyz";
    private final String xifratEnigma2 = "aUK07rxYHZlnP9cy6GsfMvmVqeQo1JgTRtWC"
            + "bdFpLX384EOBziNASDwh52kuj";
    
    /**
     * Constructor que rep com a paràmtres el nom i la contrasenya.
     * 
     * @param nom
     * @param pas 
     */
    public User(String nom, String pas) {
        
        this.nom = nom;
        this.pas = pas;
        
    }
    
    /**
     * Mètode per encriptar la contrasenya.
     * 
     * @return pasEncriptada
     */
    public String encriptarPas() {
        
        String pasEncriptada = "";
        
        for (int i = 0; i < pas.length(); i++) {
            int posChar = xifratEnigma1.indexOf(pas.charAt(i));
            pasEncriptada += xifratEnigma2.charAt(posChar);
        }
        
        return pasEncriptada;
        
    }
    
    /**
     * Mètode per desencriptar la contrasenya guardada.
     * 
     * @param pasEncriptada
     * @return pasDesencriptada
     */
    public String desencriptarPas(String pasEncriptada) {
        
        String pasDesencriptada = "";
        
        for (int i = 0; i < pasEncriptada.length(); i++) {
            int posChar = xifratEnigma2.indexOf(pasEncriptada.charAt(i));
            pasDesencriptada += xifratEnigma1.charAt(posChar);
        }
        
        return pasDesencriptada;
        
    }

    /**
     * Mètode per saber el nom de l'usuari.
     * 
     * @return nom de l'usuari
     */
    public String getNom() {
        return nom;
    }

    /**
     * Mètode per saber la contrasenya de l'usuari.
     * 
     * @return contrasenya de l'usuari
     */
    public String getPas() {
        return pas;
    }

    /**
     * Mètode per canviar el nom de l'usuari.
     * 
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Mètode per canviar la contrasenya de l'usuari.
     * 
     * @param pas 
     */
    public void setPas(String pas) {
        this.pas = pas;
    }
}