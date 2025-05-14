package com.mycompany._ra5_15_1_matveinikitacazallayamila.seriaciodefault;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Nikita i Yamila
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
     * 
     */
    public Game() {
        this(PLAYER_DEFAULT);
    }
    
    public Game(Hero jugador){
        this.score = SCORE_DEFAULT;
        this.player = jugador;
        this.level = LEVEL_DEFAULT;
    }

    public int getScore() {
        return score;
    }

    public Hero getPlayer() {
        return player;
    }

    public int getLevel() {
        return level;
    }
}
