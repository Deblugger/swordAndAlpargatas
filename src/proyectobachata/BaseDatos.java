/*
 Esta es una clase creada especificamente para añadir
 todos los métodos que van a trabajar directamente
 con la base de datos.
 */
package proyectobachata;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.util.Random;

public class BaseDatos {


    public BaseDatos() {
    }

    public ObjectSet volcarTodoUsuarios(ObjectContainer bd) {
        Query query = bd.query();
        query.constrain(Usuario.class);

        ObjectSet res = query.execute();
        return res;
    }

    public void mostrarResultado(ObjectSet res) {
        System.out.println("Recuperados " + res.size() + " Objetos");
        while (res.hasNext()) {
            System.out.println(res.next());
        }
    }

    public Clase cogerClase(ObjectContainer bd, String clase) {
        Query query = bd.query();
        query.constrain(Clase.class);
        query.descend("nombre").constrain(clase);
        ObjectSet res = query.execute();
        Clase seleccion = (Clase) res.get(0);
        return seleccion;
    }

    public int buscarPersonaje(ObjectSet res, String nom) {
        for (int i = 0; i < res.size(); i++) {
            Personaje pj = (Personaje) res.get(i);
            if (pj.getNombre().equalsIgnoreCase(nom)) {
                return i;
            }
        }
        return -1;
    }

    public ObjectSet volcarTodosPersonajes(ObjectContainer bd) {
        Query query = bd.query();
        query.constrain(Personaje.class);

        ObjectSet res = query.execute();
        return res;
    }

    public void borrarPersonaje(ObjectContainer bd, String nom) {
        ObjectSet todos = volcarTodosPersonajes(bd);
        for (int i = 0; i < todos.size(); i++) {
            Personaje a = (Personaje) todos.get(i);
            if (a.getNombre().equalsIgnoreCase(nom)) {
                bd.delete(a);
                break;
            }
        }

    }

    public Personaje personajeAleatorio(ObjectContainer bd) {
        ObjectSet todos = volcarTodosPersonajes(bd);
        Random rnd = new Random();
        return (Personaje) todos.get(rnd.nextInt(todos.size()));
    }

    public Usuario buscarUsuario(ObjectContainer bd, String nom) {
        ObjectSet todos = volcarTodoUsuarios(bd);
        for (int i = 0; i < todos.size(); i++) {
            Usuario a = (Usuario) todos.get(i);
            if (a.getNombre().equalsIgnoreCase(nom)) {
                return a;
            }
        }
        return null;
    }

    public Arma buscarArma(ObjectContainer bd, String nom) {
        ObjectSet todos = volcarTodasArmas(bd);
        for (int i = 0; i < todos.size(); i++) {
            Arma a = (Arma) todos.get(i);
            if (a.getNombre().equalsIgnoreCase(nom)) {
                return a;
            }
        }
        return null;
    }

    public Armadura buscarArmadura(ObjectContainer bd, String nom) {
        ObjectSet todos = volcarTodasArmaduras(bd);
        for (int i = 0; i < todos.size(); i++) {
            Armadura a = (Armadura) todos.get(i);
            if (a.getNombre().equalsIgnoreCase(nom)) {
                return a;
            }
        }
        return null;
    }

    public ObjectSet volcarTodasArmas(ObjectContainer bd) {
        Query query = bd.query();
        query.constrain(Arma.class);
        ObjectSet res = query.execute();
        return res;
    }

    public ObjectSet volcarTodasArmaduras(ObjectContainer bd) {
        Query query = bd.query();
        query.constrain(Armadura.class);
        ObjectSet res = query.execute();
        return res;
    }

    public ObjectSet volcarTodasHabilidadesClase(ObjectContainer bd, String clase) {
        Query query = bd.query();
        query.constrain(Habilidad.class);
        query.descend("clase").constrain(clase);
        ObjectSet res = query.execute();
        return res;
    }

    public Arma[] armasAleatorias(ObjectSet res) {
        Random rnd = new Random();
        Arma[] armas = new Arma[4];
        for (int i = 0; i < 4; i++) {
            armas[i] = (Arma) res.get(rnd.nextInt(res.size()));
        }
        return armas;
    }

    public void introducirArmas(ObjectContainer bd) {
        Arma a1 = new Arma("guerrero", "Espada de la tempestad", 80, 0, 80, 60);
        Arma a2 = new Arma("guerrero", "Hacha de la desesperación", 150, 20, 150, 180);
        Arma a3 = new Arma("mago", "Bastón de la sabiduría", 50, 0, 100, 60);
        Arma a4 = new Arma("mago", "Bastón de la esperanza", 180, 30, 190, 180);
        Arma a5 = new Arma("picaro", "Daga de la indolencia", 90, 0, 80, 60);
        Arma a6 = new Arma("picaro", "Daga de las 5 maldiciones", 160, 50, 170, 180);
        Arma a7 = new Arma("guardian", "Mazo destructor", 70, 50, 60, 60);
        Arma a8 = new Arma("guardian", "Mazo milenario", 110, 100, 150, 180);
        bd.store(a1);
        bd.store(a2);
        bd.store(a3);
        bd.store(a4);
        bd.store(a5);
        bd.store(a6);
        bd.store(a7);
        bd.store(a8);

    }

    public Armadura[] armadurasAleatorias(ObjectSet res) {
        Random rnd = new Random();
        Armadura[] armaduras = new Armadura[4];
        for (int i = 0; i < 4; i++) {
            armaduras[i] = (Armadura) res.get(rnd.nextInt(res.size()));
        }
        return armaduras;
    }
    //            Armadura a = (Armadura) res.get(rnd.nextInt(res.size()));
//            for (int j = 0; j < 4; j++) {
//                if (armaduras[j] != null) {
//                    if (a.getNombre().equalsIgnoreCase(armaduras[j].getNombre())) {
//                        puede = false;
//                    } else {
//                        puede = true;
//                    }
//                }else{
//                    j--;
//                }
//
//            }
//            if (puede) {
//                armaduras[i] = a;
//            }
//        }

    public void introducirArmaduras(ObjectContainer bd) {
        Armadura ar1 = new Armadura("guerrero", "Peto de hierro", 60, 40, 60, 50);
        Armadura ar2 = new Armadura("guerrero", "Peto de adamantium", 130, 90, 120, 150);
        Armadura ar3 = new Armadura("mago", "Sombrero resistente", 30, 25, 100, 50);
        Armadura ar4 = new Armadura("mago", "Sombrero de Merlín", 90, 60, 160, 150);
        Armadura ar5 = new Armadura("picaro", "Cinturón de cuero", 50, 35, 80, 50);
        Armadura ar6 = new Armadura("picaro", "Guantes de Lancelot", 100, 60, 130, 150);
        Armadura ar7 = new Armadura("guardian", "Escudo de metal", 80, 60, 60, 50);
        Armadura ar8 = new Armadura("guardian", "Escudo de Arturo", 110, 100, 150, 180);
        bd.store(ar1);
        bd.store(ar2);
        bd.store(ar3);
        bd.store(ar4);
        bd.store(ar5);
        bd.store(ar6);
        bd.store(ar7);
        bd.store(ar8);

    }

    public void introducirHabilidades(ObjectContainer bd) {
        Habilidad hg1 = new Habilidad("Estocada", 40, 0.2, 0, 0, 0, 0, "Golpe de espada", "guerrero");
        Habilidad hg2 = new Habilidad("Recuperar vida", 0, 0.2, 60, 60, 0, 0, "Recupera un trozo de vida", "guerrero");
        Habilidad hg3 = new Habilidad("Subir ataque", 0, 0.2, 50, 0, 30, 0, "Aumenta el ataque de tu guerrero", "guerrero");
        Habilidad hg4 = new Habilidad("Golpe maestro", 80, 0.2, 90, 0, 0, 0, "Golpe que daña gravemente a tu rival", "guerrero");
        Habilidad hm1 = new Habilidad("Golpe de bastón", 30, 0.2, 0, 0, 0, 0, "Golpea con el bastón a tu enemigo", "mago");
        Habilidad hm2 = new Habilidad("Recuperar vida", 0, 0.2, 80, 80, 0, 0, "Recupera un trozo de vida", "mago");
        Habilidad hm3 = new Habilidad("Subir ataque", 0, 0.2, 70, 0, 40, 0, "Aumenta el ataque de tu mago", "mago");
        Habilidad hm4 = new Habilidad("Hechizo de los 4 elementos", 90, 0.2, 110, 0, 0, 0, "Golpea al enemigo con la fuerza del agua, aire, fuego y tierra", "mago");
        Habilidad hp1 = new Habilidad("Golpe de puñal", 20, 0.2, 0, 0, 0, 0, "Apuñala a tu enemigo", "picaro");
        Habilidad hp2 = new Habilidad("Recuperar vida", 0, 0.2, 60, 50, 0, 0, "Recupera un trozo de vida", "picaro");
        Habilidad hp3 = new Habilidad("Subir ataque", 0, 0.2, 30, 0, 40, 0, "Aumenta el ataque de tu picaro", "picaro");
        Habilidad hp4 = new Habilidad("Robo del alma", 80, 0.2, 120, 0, 0, 0, "Lanza un ataque que afecta directamente al alma del enemigo", "picaro");
        Habilidad hgu1 = new Habilidad("Golpe de escudo", 15, 0.2, 0, 0, 0, 0, "Golpea con el escudo a tu enemigo", "guardian");
        Habilidad hgu2 = new Habilidad("Recuperar vida", 0, 0.2, 40, 70, 0, 0, "Recupera un trozo de vida", "guardian");
        Habilidad hgu3 = new Habilidad("Subir ataque", 0, 0.2, 30, 0, 40, 0, "Aumenta el ataque de tu guardian", "guardian");
        Habilidad hgu4 = new Habilidad("Destructor de huesos", 70, 0.2, 110, 0, 0, 0, "Lanza un ataque potente que destroza al enemigo", "guardian");
        bd.store(hg1);
        bd.store(hg2);
        bd.store(hg3);
        bd.store(hg4);
        bd.store(hm1);
        bd.store(hm2);
        bd.store(hm3);
        bd.store(hm4);
        bd.store(hp1);
        bd.store(hp2);
        bd.store(hp3);
        bd.store(hp4);
        bd.store(hgu1);
        bd.store(hgu2);
        bd.store(hgu3);
        bd.store(hgu4);

    }

    public void introducirClases(ObjectContainer bd) {
        Clase guerrero = new Clase("guerrero", volcarTodasHabilidadesClase(bd, "guerrero"));
        Clase mago = new Clase("mago", volcarTodasHabilidadesClase(bd, "mago"));
        Clase picaro = new Clase("picaro", volcarTodasHabilidadesClase(bd, "picaro"));
        Clase guardian = new Clase("guardian", volcarTodasHabilidadesClase(bd, "guardian"));
        bd.store(guerrero);
        bd.store(mago);
        bd.store(picaro);
        bd.store(guardian);

    }

    public void introducirMalos(ObjectContainer bd) {
        Clase guerrero = new Clase("guerrero", volcarTodasHabilidadesClase(bd, "guerrero"));
        Clase mago = new Clase("mago", volcarTodasHabilidadesClase(bd, "mago"));
        Clase picaro = new Clase("picaro", volcarTodasHabilidadesClase(bd, "picaro"));
        Clase guardian = new Clase("guardian", volcarTodasHabilidadesClase(bd, "guardian"));
        Personaje per1 = new Personaje("CopyRight", picaro);
        Personaje per2 = new Personaje("Pepelu", mago);
        Personaje per3 = new Personaje("CabezaDura", guardian);
        Personaje per4 = new Personaje("Baco", guerrero);
        for(int i=0; i<30; i++){
            per4.subirNivel();
        }
        Personaje per5 = new Personaje("AbrahamMateo", guerrero);
        Personaje per6 = new Personaje("Caminante", mago);
        bd.store(per1);
        bd.store(per2);
        bd.store(per3);
        bd.store(per4);
        bd.store(per5);
        bd.store(per6);
        

    }
}
