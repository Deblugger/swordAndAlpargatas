//Aqui vamos a definir la clase arma el cual tendrá una clase especifica que será la única que podrá usarla,
//un nombre, un precio y finalmente contendrá los atributos que se aplicaran al daño, vida y mana.
package proyectobachata;


public class Arma {
    
    private String clase;
    private String nombre;
    private int ataque;
    private int vida;
    private int mana;
    private  int precio;

    public Arma(String clase, String nombre, int ataque, int vida, int mana, int precio) {
        this.clase = clase;
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        this.mana = mana;
        this.precio = precio;
    }

    public String getClase() {
        return clase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }


    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public int getPrecio() {
        return precio;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
