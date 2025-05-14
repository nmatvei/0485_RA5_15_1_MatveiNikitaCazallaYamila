package com.mycompany._ra5_15_1_matveinikitacazallayamila;

import com.mycompany._ra5_15_1_matveinikitacazallayamila.seriaciocustom.Sessio;
import com.mycompany._ra5_15_1_matveinikitacazallayamila.seriaciocustom.User;
import java.io.*;

/**
 *
 * @author nikit
 */
public class Main {

    public static void main(String[] args) {
        
        User user = new User("ycazalla1", "1234Enctriptada");
        Sessio sessio = new Sessio(user);
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sessio.ser"))) {
            oos.writeObject(sessio);
        } catch (IOException e) {
            System.err.println("Error: " + e.getStackTrace());
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sessio.ser"))) {
            Sessio sGuardada = (Sessio) ois.readObject();
            System.out.println("Usuari " + sGuardada.getUser().getNom() + ""
                    + " amb contrasenya " + sGuardada.getUser().getPas() + " registrat.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getStackTrace());
        }
        
    }
}
