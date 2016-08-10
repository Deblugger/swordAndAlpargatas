/*
Clase de los personajes en el que se mostrarán la clase (guerrero, mago, ...)
la experiencia y todos sus atributos.
 */
package proyectobachata;

import javax.swing.JOptionPane;

public class Personaje {
    
    private String nombre;
    private Clase clase;
    
    private int vida, vidaactual;
    private int ataque, ataqueactual;
    private int defensa, defensaactual;
    private int mana, manaactual;
    
    private int nivel;
    private int experiencia, experiencianecesaria;
    
    private int oro;
    
    //private String sexo;
    
    public Personaje(String nombre, Clase clase) {
        /*
        Los atributos de ataque, vida, defensa y mana vienen dados por la clase
        del personaje, la experiencia necesaria irá avanzando conforme se suba
        de nivel.
        */
        this.nombre = nombre;
        this.clase = clase;
//        this.sexo= sexo;
        this.vida= clase.getVida();
        this.vidaactual=this.vida;
        this.experiencianecesaria=100;
        this.experiencia=0;
        this.ataque= clase.getAtaque();
        this.ataqueactual= this.ataque;
        this.defensa= clase.getDefensa();
        this.defensaactual= this.defensa;
        this.mana= clase.getMana();
        this.manaactual=this.mana;
        this.nivel=1;
        this.oro=0;
    }

    public String getNombre() {
        return nombre;
    }

    public Clase getClase() {
        return clase;
    }

    public int getVida() {
        return vida;
    }

    public int getVidaactual() {
        return vidaactual;
    }

    public int getAtaqueactual() {
        return ataqueactual;
    }

    public void setAtaqueactual(int ataqueactual) {
        this.ataqueactual = ataqueactual;
    }

    public int getDefensaactual() {
        return defensaactual;
    }

    public void setDefensaactual(int defensaactual) {
        this.defensaactual = defensaactual;
    }

    
    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getMana() {
        return mana;
    }

    public int getManaactual() {
        return manaactual;
    }

    public int getNivel() {
        return nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getExperiencianecesaria() {
        return experiencianecesaria;
    }

    public int getOro() {
        return oro;
    }

//    public String getSexo() {
//        return sexo;
//    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setVidaactual(int vidaactual) {
        this.vidaactual = vidaactual;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setManaactual(int manaactual) {
        this.manaactual = manaactual;
    }


    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setExperiencianecesaria(int experiencianecesaria) {
        this.experiencianecesaria = experiencianecesaria;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }
    
    public void subirNivel(){
        if(this.experiencia>=this.experiencianecesaria){
        this.nivel++;
        this.experiencia=this.experiencia-this.experiencianecesaria;
        this.experiencianecesaria+=200;
        
        if(this.clase.getNombre().equalsIgnoreCase("mago")){
            this.vida+=50;
            this.ataque+=100;
            this.defensa+=5;
            this.mana+=200;
        }
        
        if(this.clase.getNombre().equalsIgnoreCase("guerrero")){
            this.vida+=100;
            this.ataque+=60;
            this.defensa+=10;
            this.mana+=80;
        }
        
        if(this.clase.getNombre().equalsIgnoreCase("picaro")){ 
            this.vida+=70;
            this.ataque+=80;
            this.defensa+=7;
            this.mana+=130;
        }
        
        if(this.clase.getNombre().equalsIgnoreCase("guardian")){
            this.vida+=150;
            this.ataque+=30;
            this.defensa+=15;
            this.mana+=80;
        }
        
        this.manaactual=this.mana;
        this.vidaactual=this.vida;
        }
    }
    
    public void bajarMana(int baj){
        this.manaactual-=baj;
    }
    
    public void subirMana(int baj){
        this.manaactual+=baj;
    }
    
    public void bajarVida(double baj){
        this.vidaactual-=baj;
    }
    
    public void subirVida(int baj){
        this.vidaactual+=baj;
    }
    
    public void subirAtaque(int baj){
        this.ataqueactual+=baj;
    }
    
    public void subirDefensa(int baj){
        this.defensaactual+=baj;
    }
    public void usarBasico(Personaje op){
        op.bajarVida((clase.getNormal().getDaniobase()+(clase.getNormal().getDaniobase()*clase.getNormal().getEscalado()))-op.getDefensaactual()/100);
        
    }
    
    public void usarUno(Personaje op){
        
        subirVida(clase.getUno().getRecupvida());
        bajarMana(clase.getUno().getMana());
        
        
    }
    
    public void usarDos(Personaje op){
         
        subirDefensa(clase.getDos().getSubirdef());
        subirAtaque(clase.getDos().getSubiratq());
        bajarMana(clase.getDos().getMana());
         
    }
    
    public void usarTres(Personaje op){
       
        op.bajarVida((clase.getTres().getDaniobase()+(clase.getTres().getDaniobase()*clase.getTres().getEscalado()))-(op.getDefensaactual()/100));
        bajarMana(clase.getTres().getMana());
       
    }
}
