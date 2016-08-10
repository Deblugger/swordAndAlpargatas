/*
Clase creada especificamente para crear los ataques de cada personaje.
Estas habilidades no se modificaran en principio, pero se han colocado
set por si algun arma o armadura pudiese modificarlos.
 */

package proyectobachata;


public class Habilidad {
    private int daniobase, mana, recupvida, recupmana, subiratq, subirdef;
    private String nombre, descripcion, clase;
    private double escalado;

    public Habilidad(String nombre, int daniobase, double escalado, int mana, int recupvida, int subiratq, int subirdef, String descripcion, String clase) {
        this.nombre= nombre;
        this.daniobase = daniobase;
        this.escalado = escalado;
        this.mana = mana;
        this.recupvida = recupvida;
        this.subiratq = subiratq;
        this.subirdef = subirdef;
        this.descripcion = descripcion;
        this.clase = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDaniobase() {
        return daniobase;
    }

    public void setDaniobase(int daniobase) {
        this.daniobase = daniobase;
    }

    public double getEscalado() {
        return escalado;
    }

    public void setEscalado(int escalado) {
        this.escalado = escalado;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getRecupvida() {
        return recupvida;
    }

    public void setRecupvida(int recupvida) {
        this.recupvida = recupvida;
    }

    public int getRecupmana() {
        return recupmana;
    }

    public void setRecupmana(int recupmana) {
        this.recupmana = recupmana;
    }

    public int getSubiratq() {
        return subiratq;
    }

    public void setSubiratq(int subiratq) {
        this.subiratq = subiratq;
    }

    public int getSubirdef() {
        return subirdef;
    }

    public void setSubirdef(int subirdef) {
        this.subirdef = subirdef;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
