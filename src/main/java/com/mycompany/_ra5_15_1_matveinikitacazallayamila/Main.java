package com.mycompany._ra5_15_1_matveinikitacazallayamila;

import com.mycompany._ra5_15_1_matveinikitacazallayamila.seriaciocustom.*;
import com.mycompany._ra5_15_1_matveinikitacazallayamila.seriaciodefault.*;
import java.io.*;

/**
 * Classe Main on es fan provas de les classes serialitzades per defecte i
 * personalitzada.
 * 
 * @author Nikita i Yamila
 */
public class Main {

    public static void main(String[] args) {

        // Instanciació de les classes Hero i Game
        Hero hero = new Hero("Aragorn", 'm', "Ranger");
        Game game = new Game(hero);

        // Seriació per defecte
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("game.txt"))) {
            out.writeObject(game);
            out.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getStackTrace());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("game.txt"));) {
            Game gameCarregat = (Game) in.readObject();
            in.close();
            System.out.println(gameCarregat.toString());
        } catch (Exception e) {
            System.err.println("Error: " + e.getStackTrace());
        }

        // Instanciació de les classes User i Sessio
        User user = new User("ycazalla1", "1234Encriptada");
        Sessio sessio = new Sessio(user);

        // Seriació personalitzada
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sessio.txt"))) {
            sessio.writeObject(oos);
        } catch (IOException e) {
            System.err.println("Error: " + e.getStackTrace());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sessio.txt"))) {
            sessio.readObject(ois);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getStackTrace());
        }

    }
}
