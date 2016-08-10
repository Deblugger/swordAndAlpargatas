/*
 La clase Clase tiene un constructor que cambia según el nombre que le pases,
 no tiene sentido crear una clase padre y varias hijos porque no aporta nada nuevo
 en cuanto atributos o metodos, así que hemos decidido que es mejor este metodo.
 */
package proyectobachata;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.io.File;
import javax.swing.ImageIcon;

public class Clase {

    private int vida;
    private int ataque;
    private int defensa;
    private int mana;
    private String nombre;
    private ImageIcon imagen;
    private String rutaimagen;

    private Habilidad normal;
    private Habilidad uno;
    private Habilidad dos;
    private Habilidad tres;

    public Clase(String nombre, ObjectSet result) {
        if (nombre.equalsIgnoreCase("guerrero")) {
            this.nombre = nombre;
            this.ataque = 200;
            this.vida = 350;
            this.defensa = 50;
            this.mana = 230;
            this.imagen = new ImageIcon("guerrero.jpg");
            rutaimagen= "Imagenes/guerrero.jpg";
//            Query query = ataques.query();
//            query.constrain(Habilidad.class);
//            query.descend("clase").constrain("guerrero");
//            ObjectSet result = query.execute();
            normal = (Habilidad) result.get(0);
            uno = (Habilidad) result.get(1);
            dos = (Habilidad) result.get(2);
            tres = (Habilidad) result.get(3);
        } else if (nombre.equalsIgnoreCase("mago")) {
            this.nombre = nombre;
            this.ataque = 280;
            this.vida = 200;
            this.defensa = 20;
            this.mana = 470;
            this.imagen = new ImageIcon("mago.jpg");
            rutaimagen= "Imagenes/mago.jpg";
//
//            Query query = ataques.query();
//            query.constrain(Habilidad.class);
//            query.descend("clase").constrain("mago");
//            ObjectSet result = query.execute();
            normal = (Habilidad) result.get(0);
            uno = (Habilidad) result.get(1);
            dos = (Habilidad) result.get(2);
            tres = (Habilidad) result.get(3);
        } else if (nombre.equalsIgnoreCase("picaro")) {
            this.nombre = nombre;
            this.ataque = 240;
            this.vida = 240;
            this.defensa = 30;
            this.mana = 320;
            rutaimagen= "Imagenes/picaro.jpg";

//            Query query = ataques.query();
//            query.constrain(Habilidad.class);
//            query.descend("clase").constrain("picaro");
//            ObjectSet result = query.execute();
            normal = (Habilidad) result.get(0);
            uno = (Habilidad) result.get(1);
            dos = (Habilidad) result.get(2);
            tres = (Habilidad) result.get(3);
        }
        if (nombre.equalsIgnoreCase("guardian")) {
            this.nombre = nombre;
            this.ataque = 100;
            this.vida = 450;
            this.defensa = 100;
            this.mana = 230;
            this.imagen = new ImageIcon("guardian.jpg");
            rutaimagen= "Imagenes/guardian.jpg";

//            Query query = ataques.query();
//            query.constrain(Habilidad.class);
//            query.descend("clase").constrain("guardian");
//            ObjectSet result = query.execute();
            normal = (Habilidad) result.get(0);
            uno = (Habilidad) result.get(1);
            dos = (Habilidad) result.get(2);
            tres = (Habilidad) result.get(3);
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getVida() {
        return this.vida;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public int getDefensa() {
        return this.defensa;
    }

    public int getMana() {
        return this.mana;
    }

    public ImageIcon getImagen() {
        return this.imagen;
    }

    public Habilidad getNormal() {
        return normal;
    }

    public Habilidad getUno() {
        return uno;
    }

    public Habilidad getDos() {
        return dos;
    }

    public Habilidad getTres() {
        return tres;
    }

    public String getRutaimagen() {
        return rutaimagen;
    }
    
    
}
