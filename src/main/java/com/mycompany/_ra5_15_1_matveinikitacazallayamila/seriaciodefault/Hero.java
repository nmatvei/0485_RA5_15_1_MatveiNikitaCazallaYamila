package com.mycompany._ra5_15_1_matveinikitacazallayamila.seriaciodefault;

import java.io.Serializable;

/**
 * Classe Hero que representa a l'heroi de un joc (Game) i que té un nom, sexe i
 * el tipus de personatge que és (Warrior, Magician...)
 * 
 * @author Nikita i Yamila
 * @see Game
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
     * @param gender sexe del heroi
     * @param type el tipus de personatge
     */
    public Hero(String name, char gender, String type){
        this.name = name;
        this.gender = gender;
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
    public char getGender() {
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
    
    /**
     * Mètode per saber tota la información de l'heroi
     * 
     * @return tota la informació de l'heroi
     */
    @Override
    public String toString() {
        return "\nHero:" + "\nName: " + name + "\nGender: " + gender + "\nType: " + type;
    }
}