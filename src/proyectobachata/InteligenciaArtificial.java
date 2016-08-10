/*
 Clase que servirá para declarar el funcionamiento de la Inteligencia artificial del 
 oponente a la hora de enfrentarse a el, no tiene niveles de dificultad, puesto que
 la dificultad de este juego reside en la posible diferencia de niveles y estadisticas
 de los diferentes personajes a los que te enfrentes.
 */
package proyectobachata;

import java.util.Random;
import javax.swing.JOptionPane;

public class InteligenciaArtificial {

    private int mana, vida, manaop, vidaop, estrategia, manaactual, vidaactual;
    private Habilidad ataquebasico, cura, buffo, ataquefuerte;
    private boolean tuturno = false;
    private Personaje personaje, oponente;
  
    
    
    public InteligenciaArtificial(Personaje personaje, Personaje oponente) {
        this.mana = personaje.getMana();
        this.vida = personaje.getVida();
        this.vidaop = oponente.getVidaactual();
        this.manaop = oponente.getManaactual();
        this.manaactual = personaje.getManaactual();
        this.vidaactual = personaje.getVidaactual();
        

        this.ataquebasico = personaje.getClase().getNormal();
        this.cura = personaje.getClase().getUno();
        this.buffo = personaje.getClase().getDos();
        this.ataquefuerte = personaje.getClase().getTres();

        this.personaje = personaje;
        this.oponente = oponente;

//        this.estrategia = rnd.nextInt(3);
//        if(estrategia==0)
//            estrategia0(turno);
//        else if(estrategia==1)
//            estrategia1(turno);
//        else if(estrategia==2)
//            estrategia2(turno);
    }

    public void estrategia(int cont, int str) {
        //Estrategia buffo
        if(str==0){
        if (cont % 7 == 0) {
            if (manaactual >= buffo.getMana()) {
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= ataquefuerte.getMana()) {
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
            } else if ((manaactual >= cura.getMana()) && (vidaactual < vida)) {
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
            } else {
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
            }

        } else if (cont % 7 == 1) {
            if (manaactual >= buffo.getMana()) {
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= ataquefuerte.getMana()) {
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
            } else if ((manaactual >= cura.getMana()) && (vidaactual < vida)) {
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
            } else {
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
            }

        } else if (cont % 7 == 2) {
            if (vidaactual < vida / 2 && manaactual >= cura.getMana()) {
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= ataquefuerte.getMana()) {
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= buffo.getMana()) {
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
            } else {
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
            }
        } else if (cont % 7 == 3) {
            if (manaactual >= ataquefuerte.getMana()) {
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
            } else if (vidaactual < vida && manaactual >= cura.getMana()) {
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= buffo.getMana()) {
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
            } else {
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
            }
        } else if (cont % 7 == 4) {
            if (manaactual >= ataquefuerte.getMana() && vidaactual > vida / 2) {
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
            } else if (vidaactual < vida / 2 && manaactual >= cura.getMana()) {
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= buffo.getMana()) {
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
            } else {
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
            }
        } else if (cont % 7 == 5) {
            if (vidaactual < vida / 1.5 && manaactual >= cura.getMana()) {
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= ataquefuerte.getMana()) {
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= buffo.getMana()) {
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
            } else {
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
            }
        } else if (cont % 7 == 6) {
            if (vidaactual < vida / 1.25 && manaactual >= cura.getMana()) {
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= ataquefuerte.getMana()) {
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= buffo.getMana()) {
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
                
            } else {
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
            }
        }
    }
    
    else if(str==1){
   
        if (cont % 7 == 0) {
            if (manaactual >= buffo.getMana()) {
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= ataquefuerte.getMana()) {
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
            } else if ((manaactual >= cura.getMana()) && (vidaactual < vida)) {
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
            } else {
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
            }
        } else if (cont % 7 == 1) {
            if (manaactual >= ataquefuerte.getMana() && vidaactual > vida / 2) {
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
            } else if (vidaactual < vida / 2 && manaactual >= cura.getMana()) {
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= buffo.getMana()) {
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
            } else {
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
            }
        } else if (cont % 7 == 2) {
            if (manaactual >= ataquefuerte.getMana() && vidaactual > vida / 2) {
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
            } else if (vidaactual < vida / 2 && manaactual >= cura.getMana()) {
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= buffo.getMana()) {
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
            } else {
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
            }
        } else if (cont % 7 == 3) {
            if (vidaactual < vida / 1.5 && manaactual >= cura.getMana()) {
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= ataquefuerte.getMana()) {
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= buffo.getMana()) {
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
            } else {
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
            }
        } else if (cont % 7 == 4) {
            if (manaactual >= buffo.getMana()) {
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= ataquefuerte.getMana()) {
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
            } else if ((manaactual >= cura.getMana()) && (vidaactual < vida)) {
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
            } else {
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
            }
        } else if (cont % 7 == 5) {
            if (vidaactual < vida / 1.25 && manaactual >= cura.getMana()) {
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= ataquefuerte.getMana()) {
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= buffo.getMana()) {
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
            } else {
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
            }
        } else if (cont % 7 == 6) {
            if (manaactual >= ataquefuerte.getMana() && vidaactual > vida / 2) {
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
            } else if (vidaactual < vida / 2 && manaactual >= cura.getMana()) {
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= buffo.getMana()) {
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
            } else {
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
            }
        }
    }
    else if(str==2){
    
        if (cont % 7 == 0 || cont % 7 == 1 || cont % 7 == 2 || cont % 7 == 5 || cont % 7 == 6) {
            if (manaactual >= ataquefuerte.getMana() && vidaactual > vida / 2) {
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
            } else if (vidaactual < vida / 2 && manaactual >= cura.getMana()) {
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= buffo.getMana()) {
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
            } else {
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
            }
        } else if (cont % 7 == 3 || cont % 7 == 4) {
            if (vidaactual < vida && manaactual >= cura.getMana()) {
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= buffo.getMana()) {
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
            } else if (manaactual >= ataquefuerte.getMana()) {
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
            } else {
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
            }
        }
    }
    else if (str==3){
        boolean hecho=false;
        Random rnd= new Random();
        while(!hecho){
            int ataq= rnd.nextInt(3);
            if(ataq==0 && manaactual>= ataquebasico.getMana()){
                personaje.usarBasico(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getNormal().getNombre());
                manaactual= personaje.getManaactual();
                hecho=true;
            }
            else if(ataq==2 && manaactual>= buffo.getMana() && manaactual>0){
                personaje.usarDos(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getDos().getNombre());
                manaactual= personaje.getManaactual();
                hecho=true;
            }
            else if(ataq==1 && manaactual>= cura.getMana() && vidaactual<vida && manaactual>0){
                personaje.usarUno(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getUno().getNombre());
                manaactual= personaje.getManaactual();
                hecho=true;
            }
            else if(ataq==3 && manaactual>= ataquefuerte.getMana() && manaactual>0){
                personaje.usarTres(oponente);
                JOptionPane.showMessageDialog(null, "Tu oponente ha usado: "+personaje.getClase().getTres().getNombre());
                manaactual= personaje.getManaactual();
                hecho=true;
            }
        }
    }
    }
    
}
