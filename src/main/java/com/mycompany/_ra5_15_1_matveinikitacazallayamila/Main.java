package com.mycompany._ra5_15_1_matveinikitacazallayamila;

import com.mycompany._ra5_15_1_matveinikitacazallayamila.seriaciocustom.*;
import com.mycompany._ra5_15_1_matveinikitacazallayamila.seriaciodefault.*;
import java.io.*;

/**
 *
 * @author Nikita i Yamila
 */
public class Main {

    public static void main(String[] args) {

        Hero hero = new Hero("Aragorn", 'm', "Ranger");
        Game game = new Game(hero);

        // Seriació per defecte
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("game.txt"))) {
            out.writeObject(game); // Serialització per defecte
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

        // Seriació personalitzada
        User user = new User("ycazalla1", "1234Enctriptada");
        Sessio sessio = new Sessio(user);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sessio.txt"))) {
            oos.writeObject(sessio);
        } catch (IOException e) {
            System.err.println("Error: " + e.getStackTrace());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sessio.txt"))) {
            Sessio sGuardada = (Sessio) ois.readObject();
            System.out.println("Usuari " + sGuardada.getUser().getNom() + ""
                    + " amb contrasenya " + sGuardada.getUser().getPas() + " registrat.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getStackTrace());
        }

    }
}
