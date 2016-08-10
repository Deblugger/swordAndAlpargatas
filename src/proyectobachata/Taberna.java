/*
Interfaz de la taberna. Aqui se nos permite descansar
o tomar un refrigerio para recuperar vida por un modico
precio.
 */
package proyectobachata;

import com.db4o.ObjectContainer;
import javax.swing.JOptionPane;

public class Taberna extends javax.swing.JDialog {
    
    private BaseDatos bdc= new BaseDatos();
    private ObjectContainer bd;
    private Personaje personaje;
    
    public Taberna(java.awt.Frame parent, ObjectContainer bd, Personaje personaje) {
        super(parent, true);
        initComponents();
        this.bd=bd;
        this.personaje= personaje;
        this.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("\"Sirveme una cerveza\" (10 oros)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jButton2.setText("Descansar por completo. (50 oros)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, -1, -1));

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobachata/Imágenes/taberna-dentro.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(personaje.getOro()>=10){
            personaje.setVidaactual(personaje.getVidaactual() + 80);
            personaje.setManaactual(personaje.getManaactual() + 80);
            personaje.setOro(personaje.getOro()-10);
            JOptionPane.showMessageDialog(this, "Su vida y mana han sido restaurados en 80 puntos.");
            bd.store(personaje);
        }else{
            JOptionPane.showMessageDialog(this, "No tienes dinero suficiente.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(personaje.getOro()>=50){
            personaje.setVidaactual(personaje.getVida());
            personaje.setManaactual(personaje.getMana());
            personaje.setOro(personaje.getOro()-50);
            JOptionPane.showMessageDialog(this, "Su vida y mana han sido restaurados por completo.");
            bd.store(personaje);
        }else{
            JOptionPane.showMessageDialog(this, "No tienes dinero suficiente.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
