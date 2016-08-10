/*
 Clase diseñada para los jugadores en el que se guardarán los datos de los mismos
 con sus personajes, tendrán un máximo de 4 personajes cada uno, y un método de 
 recuperación de contraseña.
 */
package proyectobachata;

import com.db4o.ObjectContainer;

public class Usuario {

    private String nombre;
    private String password;
    private String pregunta; // Para recuperar la contraseña implementamos una pregunta y respuesta
    private String respuesta;
    private Personaje[] personajes;
    private BaseDatos bdo = new BaseDatos();

    public Usuario(String nombre, String password, String pregunta, String respuesta, ObjectContainer bd) {
        this.nombre = nombre;
        this.password = password;
        this.pregunta = pregunta;
        this.respuesta = respuesta;

        personajes = new Personaje[4];

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Personaje[] getPersonajes() {
        return personajes;
    }

    public boolean aniadirPersonaje(Personaje pj) {
        /*
         Metodo para añadir personajes al jugador, se comprueba que el vector
         esté libre para poder añadir y devuelve true o false para comprobar
         si se añade o no correctamente.
         */
        for (int i = 0; i < 4; i++) {
            if (personajes[i] == null) {
                personajes[i] = pj;
                return true;
            }
        }
        return false;
    }

    public boolean borrarPersonaje(String nombrepj) {

        /*
         Metodo para eliminar personajes del jugador, se comprueba que el personaje
         existe en el usuario y devuelve true o false para comprobar
         si se añade o no correctamente.
         */
        int pos = buscarPersonaje(nombrepj);
        if (pos != -1) {
            personajes[pos] = null;
            return true;
        } else {
            return false;
        }
    }

    public int buscarPersonaje(String nombrepj) {

        for (int i = 0; i < 4; i++) {

            if (personajes[i] != null) {
                
                String n = personajes[i].getNombre();

                if (nombrepj.equalsIgnoreCase(n)) {
                    return i;
                }

            }
        }
        return -1;
    }

    public void setPersonajes(Personaje[] personajes) {
        this.personajes = personajes;
    }

    public void imprimirPersonajes() {
        for (int i = 0; i < 4; i++) {
            System.out.println(personajes[i]);
        }
    }

}
