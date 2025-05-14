package com.mycompany._ra5_15_1_matveinikitacazallayamila.seriaciocustom;

import java.io.*;

/**
 *
 * @author Nikita i Yamila
 */
public class Sessio implements Serializable{
    
    User user;
    
    public Sessio(User user) {
        
        this.user = user;
        
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    private void writeObject(ObjectOutputStream out) throws IOException {
        
        out.defaultWriteObject();
        out.writeObject(user.getPas());
        
    }
    
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        
        in.defaultReadObject();
        String contrasenya = (String) in.readObject();
        
    }
    
}