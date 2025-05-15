package com.mycompany._ra5_15_1_matveinikitacazallayamila.seriaciodefault;

import java.io.*;

/**
 * Classe Game que representa una partida d'un joc on hi ha una puntuació, nivell
 * i un jugador (que és de la classe Hero).
 *
 * @author Nikita i Yamila
 * @see Hero
 */
public class Game implements Serializable {
    
    // Declaració d'atribust
    private int score;
    private Hero player;
    private int level;
    
    // Declaració de constants
    private final static int SCORE_DEFAULT = 0;
    private final static int LEVEL_DEFAULT = 1;
    private final static Hero PLAYER_DEFAULT = new Hero();
    
    /**
     * Constructor per defecte que truca al parametritzat
     */
    public Game() {
        this(PLAYER_DEFAULT);
    }
    
    /**
     * Constructor per donar valor a la puntuació, el nivell en el que es comença
     * i el jugador de la partida
     * 
     * @param jugador 
     */
    public Game(Hero jugador){
        this.score = SCORE_DEFAULT;
        this.player = jugador;
        this.level = LEVEL_DEFAULT;
    }
    
    /**
     * Mètode per conseguir la puntuació del joc
     * 
     * @return puntuació
     */
    public int getScore() {
        return score;
    }
    
    /**
     * Mètode per consegui el jugador (heroi)
     * 
     * @return jugador (heroi)
     */
    public Hero getPlayer() {
        return player;
    }
    
    /**
     * Mètode per conseguir el nivell
     * 
     * @return nivell
     */
    public int getLevel() {
        return level;
    }
    
    /**
     * Mètode per mostrar tota la informació de la partida
     * 
     * @return tota la informació de la partida
     */
    @Override
    public String toString() {
        return "Game:" + "\nScore: " + score +"\nLevel: " + level + "\nPlayer: " 
                + player.toString();
    }
}