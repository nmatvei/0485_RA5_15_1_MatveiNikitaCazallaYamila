package com.mycompany._ra5_15_1_matveinikitacazallayamila.seriaciocustom;

import java.io.*;

/**
 * Classe Sessio que representa un inici de sessió on compte amb un usuari i
 * idioma.
 * 
 * @author Nikita i Yamila
 */
public class Sessio implements Serializable{
    
    // Declaració de variables
    private User user;
    private String idioma;
    
    // Declaració de constants
    private final static String IDIOMA_DEFAULT = "ESP";
    
    /**
     * Constructor que rep com paràmetre un usuari.
     * 
     * @param user 
     */
    public Sessio(User user) {
        this.user = user;
        this.idioma = IDIOMA_DEFAULT;
    }
    
    /**
     * Constructor que rep com a paràmeter un usuari i un idioma.
     * 
     * @param user
     * @param idioma 
     */
    public Sessio(User user, String idioma){
        this.user = user;
        this.idioma = idioma;
    }

    /**
     * Mètode per conseguir l'usuari.
     * 
     * @return user
     */
    public User getUser() {
        return user;
    }
    
    /**
     * Mètode per fer la seriació personalitzada on es guardan el atribtus que
     * volem.
     * 
     * @param oos
     * @throws IOException 
     */
    public void writeObject(ObjectOutputStream oos) throws IOException {
        PrintStream ps = new PrintStream(oos);
        ps.println(idioma);
        ps.println(user.getNom());
        ps.println(user.encriptarPas());
        ps.close();
    }
    
    /**
     * Mètode que retorna el que es troba guardat en l'arxiu.
     * 
     * @param in
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String s = br.readLine();
        idioma = s;
        s = br.readLine();
        user.setNom(s);
        s = br.readLine();
        user.setPas(user.desencriptarPas(s));
        System.out.println("Idioma de la sessió: " + idioma + " User: " + 
                user.getNom() + " Pas: " + user.getPas());
        br.close();
    }
    
}