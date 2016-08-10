/*
 Interfaz para los combates. Esta clase te asigna un oponente aleatorio de la base de datos,
 coge sus atributos "vida" y "maná" y los coloca en label así como una imagen dependiendo de su clase.

 La inteligencia artificial utilizada 
 */
package proyectobachata;

import com.db4o.ObjectContainer;
import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Coliseo extends javax.swing.JDialog {
    
    private ObjectContainer bdo;
    private Personaje tupj, enemigo;
    private Random rnd = new Random();
    private int turno = 0, estrategia = rnd.nextInt(3);
    
    
    private InteligenciaArtificial ia;
    
    public Coliseo(java.awt.Frame parent, Personaje pj, ObjectContainer bd) {
        super(parent, true);
        initComponents();

        // Rellenamos los jLabel de la interfaz con informacion de ambos personajes.
        tupj = pj;
        bdo = bd;
        BaseDatos datos = new BaseDatos();
        
        enemigo = datos.personajeAleatorio(bdo);
        while (enemigo.getNombre().equalsIgnoreCase(tupj.getNombre())) {
            enemigo = datos.personajeAleatorio(bdo);
        }
        ia = new InteligenciaArtificial(enemigo, tupj);
        this.jLabel13.setText(enemigo.getNombre());
        this.jLabel14.setText(tupj.getNombre());
        this.jLabel2.setIcon(tupj.getClase().getImagen());
        this.jLabel3.setIcon(enemigo.getClase().getImagen());
        System.out.println(tupj.getNombre());
        System.out.println(enemigo.getNombre());
        enemigo.setVidaactual(enemigo.getVida());
        enemigo.setManaactual(enemigo.getMana());
        actualizarContadores();
        this.jButton1.setText(tupj.getClase().getNormal().getNombre());
        this.jButton2.setText(tupj.getClase().getUno().getNombre());
        this.jButton3.setText(tupj.getClase().getDos().getNombre());
        this.jButton4.setText(tupj.getClase().getTres().getNombre());
        this.jButton5.setText(enemigo.getClase().getNormal().getNombre());
        this.jButton6.setText(enemigo.getClase().getUno().getNombre());
        this.jButton7.setText(enemigo.getClase().getDos().getNombre());
        this.jButton8.setText(enemigo.getClase().getTres().getNombre());
        colocarImagen(jLabel2,tupj);
        colocarImagenEnemigo(jLabel3,enemigo);
        this.jButton5.setEnabled(false);
        this.jButton6.setEnabled(false);
        this.jButton7.setEnabled(false);
        this.jButton8.setEnabled(false);
        this.setVisible(true);
        // Fase de combate

    }
    
    private void colocarImagen(JLabel img, Personaje pj){
        if(pj.getClase().getNombre().equalsIgnoreCase("guerrero")){
            ImageIcon icono= new ImageIcon(getClass().getResource("/proyectobachata/Imágenes/guerrero_arena.png"));
            img.setIcon(new ImageIcon(icono.getImage().getScaledInstance(200, 297, Image.SCALE_DEFAULT)));
        }else if(pj.getClase().getNombre().equalsIgnoreCase("mago")){
            ImageIcon icono= new ImageIcon(getClass().getResource("/proyectobachata/Imágenes/mago_arena.png"));
            img.setIcon(new ImageIcon(icono.getImage().getScaledInstance(200, 297, Image.SCALE_DEFAULT)));
        }else if(pj.getClase().getNombre().equalsIgnoreCase("picaro")){
            ImageIcon icono= new ImageIcon(getClass().getResource("/proyectobachata/Imágenes/picaro_arena.png"));
            img.setIcon(new ImageIcon(icono.getImage().getScaledInstance(200, 297, Image.SCALE_DEFAULT)));
        }else if(pj.getClase().getNombre().equalsIgnoreCase("guardian")){
            ImageIcon icono= new ImageIcon(getClass().getResource("/proyectobachata/Imágenes/guardian_arena.png"));
            img.setIcon(new ImageIcon(icono.getImage().getScaledInstance(200, 297, Image.SCALE_DEFAULT)));
        }
    }
    
    private void colocarImagenEnemigo(JLabel img, Personaje pj){
        if(pj.getClase().getNombre().equalsIgnoreCase("guerrero")){
            ImageIcon icono= new ImageIcon(getClass().getResource("/proyectobachata/Imágenes/guerrero_arena_ene.png"));
            img.setIcon(new ImageIcon(icono.getImage().getScaledInstance(200, 297, Image.SCALE_DEFAULT)));
        }else if(pj.getClase().getNombre().equalsIgnoreCase("mago")){
            ImageIcon icono= new ImageIcon(getClass().getResource("/proyectobachata/Imágenes/mago_arena_ene.png"));
            img.setIcon(new ImageIcon(icono.getImage().getScaledInstance(200, 297, Image.SCALE_DEFAULT)));
        }else if(pj.getClase().getNombre().equalsIgnoreCase("picaro")){
            ImageIcon icono= new ImageIcon(getClass().getResource("/proyectobachata/Imágenes/picaro_arena_ene.png"));
            img.setIcon(new ImageIcon(icono.getImage().getScaledInstance(200, 297, Image.SCALE_DEFAULT)));
        }else if(pj.getClase().getNombre().equalsIgnoreCase("guardian")){
            ImageIcon icono= new ImageIcon(getClass().getResource("/proyectobachata/Imágenes/guardian_arena_ene.png"));
            img.setIcon(new ImageIcon(icono.getImage().getScaledInstance(200, 297, Image.SCALE_DEFAULT)));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, -1, -1));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, -1, -1));

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 210, 300));

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel4.setText("Vida:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel5.setText("Maná:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        jLabel7.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        jButton5.setText("jButton5");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, -1, -1));

        jButton6.setText("jButton6");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, -1, -1));

        jButton7.setText("jButton7");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, -1, -1));

        jButton8.setText("jButton8");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 570, -1, -1));

        jLabel8.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel8.setText("Vida:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, -1));

        jLabel9.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel10.setText("Maná:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, -1, -1));

        jLabel11.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobachata/Imágenes/vs_v1.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 260, 250));

        jLabel13.setFont(new java.awt.Font("Viner Hand ITC", 0, 48)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 140, 420, -1));

        jLabel14.setFont(new java.awt.Font("Viner Hand ITC", 0, 48)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 470, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, 210, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobachata/Imágenes/Coliseo_v4.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tupj.usarBasico(enemigo);
        actualizarContadores();
        if (!combateTerminado()) {
            ia.estrategia(turno, estrategia);
            actualizarContadores();
            turno++;
            if(combateTerminado()){
                    deshabilitarBotones();
                }
        } else {
            deshabilitarBotones();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (tupj.getManaactual() >= tupj.getClase().getUno().getMana()) {
            tupj.usarUno(enemigo);
            actualizarContadores();
            
            if (!combateTerminado()) {
                ia.estrategia(turno, estrategia);
                actualizarContadores();
                turno++;
                if(combateTerminado()){
                    deshabilitarBotones();
                }
            } else {
                deshabilitarBotones();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No tienes maná suficiente.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (tupj.getManaactual() >= tupj.getClase().getDos().getMana()) {
            tupj.usarDos(enemigo);
            actualizarContadores();
            if (!combateTerminado()) {
                ia.estrategia(turno, estrategia);
                actualizarContadores();
                turno++;
                if(combateTerminado()){
                    deshabilitarBotones();
                    
                }
            } else {
                deshabilitarBotones();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No tienes maná suficiente.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (tupj.getManaactual() >= tupj.getClase().getTres().getMana()) {
            tupj.usarTres(enemigo);
            actualizarContadores();
            
            if (!combateTerminado()) {
                
                ia.estrategia(turno, estrategia);
                actualizarContadores();
                turno++;
                if(combateTerminado()){
                    deshabilitarBotones();
                }
            } else {
                deshabilitarBotones();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No tienes maná suficiente.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    
    public void actualizarContadores() {
        this.jLabel6.setText("" + tupj.getVidaactual());
        this.jLabel7.setText("" + tupj.getManaactual());
        this.jLabel9.setText("" + enemigo.getVidaactual());
        this.jLabel11.setText("" + enemigo.getManaactual());
    }
    
    private void deshabilitarBotones() {
        this.jButton1.setEnabled(false);
        this.jButton2.setEnabled(false);
        this.jButton3.setEnabled(false);
        this.jButton4.setEnabled(false);
        
        if (tupj.getVidaactual() > 0) {
            tupj.setOro(tupj.getOro() + 75);
            tupj.setExperiencia(tupj.getExperiencia() + 60);
            JOptionPane.showMessageDialog(this, "El combate ha terminado. Has ganado.");
            if(tupj.getExperiencia()>=tupj.getExperiencianecesaria()){
                tupj.subirNivel();
            }
            bdo.store(tupj);
            this.dispose();
        } else {
            tupj.setOro(tupj.getOro() + 35);
            tupj.setExperiencia(tupj.getExperiencia() + 20);
            JOptionPane.showMessageDialog(this, "El combate ha terminado. Has perdido.");
            tupj.setVidaactual(tupj.getVida()/5);
            tupj.setManaactual(tupj.getMana()/5);
            if(tupj.getExperiencia()>=tupj.getExperiencianecesaria()){
                tupj.subirNivel();
            }
            bdo.store(tupj);
            this.dispose();
        }
    }
    
    public boolean combateTerminado() {
        if (enemigo.getVidaactual() <= 0 || tupj.getVidaactual() <= 0) {
            return true;
        }
        return false;
    }
    
    public void esperar() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
// Mensaje en caso de que falle
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
