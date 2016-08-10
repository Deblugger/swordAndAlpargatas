/*
Esta clase sirve para controlar los errores que puedan
surgir al registrarte o al inciar sesion con tu usuario.
(Usuario ya existente, usuario no encontrado, contraseña incorrecta...)
 */
package proyectobachata;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Diurno
 */

public class Errores{
    
    
     
     
    public boolean errnom(String nombre){
        //Comprueba que el nombre no tiene mas de 15 caracteres, si los tiene devuelve true, sino devuelve false.
        if(nombre.length()>11){
            JOptionPane.showMessageDialog(null, "El nombre no puede tener más de 11 caracteres.");
            return true;
        }
        return false;
    }
    public boolean errcontraseña(String contra, String contra1){
       //Comprueba que las contraseñas coincidan, si coinciden devuelve false, sino devuelve true.
        if(!contra.equals(contra1)){ 
            JOptionPane.showMessageDialog(null, "Error, las contraseñas no coinciden.");
            return true;
        }
        
       return false;
    }
    
    public boolean errusuario(ObjectSet res, String usuario){
        //ObjectSet res = usuarios.queryByExample(new Usuario(null, null, null, null));
        while (res.hasNext()) {
            Usuario a = (Usuario) res.next();
            if (a.getNombre().equalsIgnoreCase(usuario)) {
                JOptionPane.showMessageDialog(null, "Error, ese nombre de usuario ya existe, escoja otro.");
                return true;
            }
        }
            return false;
    
}
    public boolean errcompusuario(ObjectSet res, String usuario){
        //ObjectSet res = usuarios.queryByExample(new Usuario(null, null, null, null));
        while (res.hasNext()) {
            Usuario a = (Usuario) res.next();
            if (a.getNombre().equalsIgnoreCase(usuario)) {
                
                return true;
            }
        }
            JOptionPane.showMessageDialog(null, "Error, usuario no encontrado en nuestra base datos.");
            return false;
    
}
    
    public boolean errcompcontraseña(Usuario usr, String passwd ){
        //ObjectSet res = usuarios.queryByExample(new Usuario(null, null, null, null));
        if(usr.getPassword().equalsIgnoreCase(passwd)){
            return true;
        }
        JOptionPane.showMessageDialog(null, "La contraseña no corresponde a este usuario.");
        return false;
    
}
}
