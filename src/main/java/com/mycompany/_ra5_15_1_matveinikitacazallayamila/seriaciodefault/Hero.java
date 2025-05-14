package com.mycompany._ra5_15_1_matveinikitacazallayamila.seriaciodefault;

import java.io.Serializable;

/**
 *
 * @author Nikita i Yamila
 */
public class Hero implements Serializable {
    
    // Declaració d'atributs
    private String name;
    private transient char gender;
    private String type;
    
    // Declaració de constants
    private final static String NAME_DEFAULT = "Player";
    private final static char GENDER_DEFAULT = 'm';
    private final static String TYPE_DEFAULT = "Warrior";
    
    /**
     * Constructor per defecte que truca al parametritzat
     */
    public Hero (){
        this(NAME_DEFAULT, GENDER_DEFAULT, TYPE_DEFAULT);
    }
    
    /**
     * Constructor parametritzat que li dona un nom, sexe i el tipus de personatge
     * que és l'heroi.
     * 
     * @param name nom del heroi
     * @param gendere sexe del heroi
     * @param type el tipus de personatge
     */
    public Hero(String name, char gendere, String type){
        this.name = name;
        this.gender = gendere;
        this.type = type;
    }
    
    /**
     * Mètode per saber el nom de l'heroi
     * 
     * @return nom de l'heroi
     */
    public String getName() {
        return name;
    }
    
    /**
     * Mètode per saber el sexe de l'heroi
     * 
     * @return sexe del heroi
     */
    public char getGendere() {
        return gender;
    }
    
    /**
     * Mètode per saber el tipus de personatge que és l'heroi
     * 
     * @return tipus de personatge
     */
    public String getType() {
        return type;
    }
    
    /**
     * Mètode per canviar el nom de l'heroi
     * 
     * @param name nom nou
     */
    public void setName(String name) {
        this.name = name;
    }
}