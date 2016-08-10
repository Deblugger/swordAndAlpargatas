/*************************************************************************************
* Interfaz gráfica dedicada a la creación de un personaje que se añadirá a la base
* de datos.
* 
* Al crear el personaje se comprueba que el nombre esté libre en la base de datos
* así como que no contenga numeros o carácteres especiales, solo letras.
* 
* Al crearlo el personaje se asocia al jugador.
* 
* Los botones laterales de la izquierda sirven para elegir la clase, al pulsar
* algún boton, la variable de la clase toma el valor determinado, y cambia el campo
* de descripción según la clase.
*************************************************************************************/

package proyectobachata;

import com.db4o.ObjectContainer;
import javax.swing.JOptionPane;


public class NuevoPersonajeGUI extends javax.swing.JDialog {
    
    private Usuario user;
    private BaseDatos bdo;
    private ObjectContainer bd;
    private Clase claseselec;
//    private String sexopj;
    
    public NuevoPersonajeGUI(java.awt.Frame parent, Usuario usuario, ObjectContainer bd) {
        super(parent, true);
        user= usuario;
        bdo=new BaseDatos();
        this.bd= bd;
        initComponents();
        this.setVisible(true);
//        Personaje a= new Personaje("pepe", bdo.cogerClase(bd, "guerrero"));
//        bd.store(a);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Guerrero");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Pícaro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Mago");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Guardián");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(230, 230, 230));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton5.setText("Crear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cancelar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setText("Descripcion:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        claseselec= bdo.cogerClase(bd,"guerrero");
        jTextArea1.setText("Implacable y fiero guerrero, fuerte y ágil " + "\n"  
                + "a partes iguales, entrenado en las artes"+ "\n" +  
                "más disciplinarias por maestros, el guerrero" + "\n" 
                + "no teme, no siente, solo destruye.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        claseselec=bdo.cogerClase(bd,"mago");
        jTextArea1.setText("El mago es capaz de manejar" +  "\n" 
                + "los elementos arcanos según" +  "\n" 
                + "sus intereses y usarlos para sus fines, "+ "\n" 
                + "totalmente imparcial y avaricioso," + "\n"  
                + "un mago no mira más que por si mismo.");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        claseselec=bdo.cogerClase(bd,"picaro");
        jTextArea1.setText("Asesino implacable, el pícaro" + "\n" 
                +"aprovecha la oscuridad para atacar"+ "\n"
                + "a sus victimas desde la espalda."+ "\n" 
                +"Empapando sus cuchillos en veneno, si no" + "\n"
                +"te mata él, te matarán sus enfermedades.");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        claseselec=bdo.cogerClase(bd,"guardian");
        jTextArea1.setText("Honor, lealtad, disciplina, obediencia." + "\n" 
                + "El guardíán no cuestiona, el guardián no duda," + "\n" 
                + "el guardián actúa. Su gran resistencia hace que" + "\n" 
                +"pueda aguantar grandes sesiones de combate" + "\n" 
                +"sin despeinarse.");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Primero comprobamos que el nombre esté bien escrito.
        boolean noLetra=false;
        
        if(jTextField1.getText().length()<=20){
           
            for(int i=0; i<jTextField1.getText().length() && !noLetra;i++){
                if(!((jTextField1.getText().charAt(i)>='A' && jTextField1.getText().charAt(i)<='Z')
                        || (jTextField1.getText().charAt(i)>='a' && jTextField1.getText().charAt(i)<='z'))){
                    noLetra=true;
                    JOptionPane.showMessageDialog(this, "El nombre solo puede tener letras");
                }
                    
            }
            //Después comprobamos que el personaje no exista.
            if(!noLetra){
                if(bdo.buscarPersonaje(bdo.volcarTodosPersonajes(bd),jTextField1.getText())==-1){
                    Personaje a= new Personaje(jTextField1.getText(), claseselec);
                    bd.store(a);
                    boolean hecho=user.aniadirPersonaje(a);
//                    Personaje[] pjs= user.getPersonajes();
//                    for(int i=0; i<4 && !hecho; i++){
//                        if(pjs[i]==null){
//                            hecho=true;
//                            pjs[i]=a;
//                        }
//                    }
                    if(hecho){
                        
//                        user.setPersonajes(pjs);
                        JOptionPane.showMessageDialog(this,"Personaje creado correctamente");
                        bd.store(user);
                        this.dispose();
                        
                    }
					
                }
            }else{
                JOptionPane.showMessageDialog(this,"Ese nombre ya existe en la base de datos");
            }
            
        }else{
           JOptionPane.showMessageDialog(this,"La longitud máxima es de 20.");
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
