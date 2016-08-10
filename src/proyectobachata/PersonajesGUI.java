/**
 * ***********************************************************************************
 * Interfaz gráfica dedicada a que un jugador escoja su personaje, en ella el
 * jugador puede decidir con cual conectar, si borrarlo o si crear uno nuevo en
 * caso de que haya algún hueco disponible.
 *
 * Al borrar un personaje se asegura de que no ha sido un error y de ser así no
 * lo elimina.
 *
 * El personaje se elimina del Vector que tiene cada objeto de la clase Usuario,
 * además de ser eliminado de la base de datos de personajes.
************************************************************************************
 */
package proyectobachata;

import com.db4o.ObjectContainer;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PersonajesGUI extends javax.swing.JDialog {

    private Usuario user;
    private BaseDatos bdo;
    private ObjectContainer bd;
    private Personaje[] pjs;

    public PersonajesGUI(java.awt.Frame parent, Usuario usuario, ObjectContainer bd) {
        super(parent, true);
        user = usuario;
        bdo = new BaseDatos();
        this.bd = bd;
        initComponents();

        pjs = user.getPersonajes();
        colocarPersonajes(pjs);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        conectar2 = new javax.swing.JButton();
        borrar2 = new javax.swing.JButton();
        imagen2 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        ataque2 = new javax.swing.JLabel();
        defensa2 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        clase2 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        nivel2 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        vida2 = new javax.swing.JLabel();
        mana2 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        experiencia2 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        clase1 = new javax.swing.JLabel();
        nivel1 = new javax.swing.JLabel();
        experiencia1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ataque1 = new javax.swing.JLabel();
        defensa1 = new javax.swing.JLabel();
        vida1 = new javax.swing.JLabel();
        mana1 = new javax.swing.JLabel();
        conectar1 = new javax.swing.JButton();
        borrar1 = new javax.swing.JButton();
        imagen1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        borrar3 = new javax.swing.JButton();
        mana3 = new javax.swing.JLabel();
        vida3 = new javax.swing.JLabel();
        defensa3 = new javax.swing.JLabel();
        ataque3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        conectar3 = new javax.swing.JButton();
        experiencia3 = new javax.swing.JLabel();
        nivel3 = new javax.swing.JLabel();
        clase3 = new javax.swing.JLabel();
        nombre3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        imagen3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        borrar4 = new javax.swing.JButton();
        conectar4 = new javax.swing.JButton();
        imagen4 = new javax.swing.JLabel();
        ataque4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        defensa4 = new javax.swing.JLabel();
        vida4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mana4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        nombre4 = new javax.swing.JLabel();
        clase4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        nivel4 = new javax.swing.JLabel();
        experiencia4 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(565, 120));

        conectar2.setText("Conectar");
        conectar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectar2ActionPerformed(evt);
            }
        });

        borrar2.setText("Borrar");
        borrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar2ActionPerformed(evt);
            }
        });

        imagen2.setText("imagen2");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Nombre:");

        nombre2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombre2.setText("nombre1");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Ataque:");

        ataque2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ataque2.setText("ataque1");

        defensa2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        defensa2.setText("defensa1");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Defensa:");

        clase2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clase2.setText("clase1");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Clase:");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Nivel:");

        nivel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nivel2.setText("nivel1");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Vida:");

        vida2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vida2.setText("vida1");

        mana2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mana2.setText("mana1");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Mana:");

        experiencia2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        experiencia2.setText("experiencia1");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Experiencia:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel37)
                    .addComponent(jLabel40)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre2)
                    .addComponent(clase2)
                    .addComponent(nivel2)
                    .addComponent(experiencia2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mana2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel38)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ataque2)
                            .addComponent(defensa2)
                            .addComponent(vida2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(conectar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(conectar2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel34)
                                .addComponent(ataque2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel35)
                                .addComponent(defensa2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel38)
                                .addComponent(vida2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel39)
                                .addComponent(mana2)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel33)
                                .addComponent(nombre2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel36)
                                .addComponent(clase2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel37)
                                .addComponent(nivel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel40)
                                .addComponent(experiencia2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setPreferredSize(new java.awt.Dimension(565, 125));
        jPanel3.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Clase:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nivel:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Experiencia:");

        nombre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombre1.setText("nombre1");

        clase1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clase1.setText("clase1");

        nivel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nivel1.setText("nivel1");

        experiencia1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        experiencia1.setText("experiencia1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ataque:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Defensa:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Vida:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mana:");

        ataque1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ataque1.setText("ataque1");

        defensa1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        defensa1.setText("defensa1");

        vida1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vida1.setText("vida1");

        mana1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mana1.setText("mana1");

        conectar1.setText("Conectar");
        conectar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectar1ActionPerformed(evt);
            }
        });

        borrar1.setText("Borrar");
        borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar1ActionPerformed(evt);
            }
        });

        imagen1.setText("imagen1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre1)
                    .addComponent(clase1)
                    .addComponent(nivel1)
                    .addComponent(experiencia1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mana1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ataque1)
                            .addComponent(defensa1)
                            .addComponent(vida1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(conectar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(conectar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(ataque1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(defensa1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(vida1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(mana1)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(nombre1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(clase1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(nivel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(experiencia1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(imagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.setPreferredSize(new java.awt.Dimension(565, 120));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Nombre:");

        borrar3.setText("Borrar");
        borrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar3ActionPerformed(evt);
            }
        });

        mana3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mana3.setText("mana1");

        vida3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vida3.setText("vida1");

        defensa3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        defensa3.setText("defensa1");

        ataque3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ataque3.setText("ataque1");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Ataque:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Defensa:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Vida:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Mana:");

        conectar3.setText("Conectar");
        conectar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectar3ActionPerformed(evt);
            }
        });

        experiencia3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        experiencia3.setText("experiencia1");

        nivel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nivel3.setText("nivel1");

        clase3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clase3.setText("clase1");

        nombre3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombre3.setText("nombre1");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Clase:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Nivel:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Experiencia:");

        imagen3.setText("imagen3");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel17)
                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre3)
                    .addComponent(clase3)
                    .addComponent(nivel3)
                    .addComponent(experiencia3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(defensa3)
                            .addComponent(ataque3)
                            .addComponent(vida3)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mana3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(conectar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(nombre3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(clase3)))
                            .addComponent(conectar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(nivel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(experiencia3)))
                            .addComponent(borrar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(ataque3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(defensa3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(vida3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(mana3))
                        .addGap(1, 1, 1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.setPreferredSize(new java.awt.Dimension(565, 120));

        borrar4.setText("Borrar");
        borrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar4ActionPerformed(evt);
            }
        });

        conectar4.setText("Conectar");
        conectar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectar4ActionPerformed(evt);
            }
        });

        imagen4.setText("imagen4");

        ataque4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ataque4.setText("ataque1");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Ataque:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Defensa:");

        defensa4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        defensa4.setText("defensa1");

        vida4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vida4.setText("vida1");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Vida:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Mana:");

        mana4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mana4.setText("mana1");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Nombre:");

        nombre4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombre4.setText("nombre1");

        clase4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clase4.setText("clase1");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Clase:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Nivel:");

        nivel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nivel4.setText("nivel1");

        experiencia4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        experiencia4.setText("experiencia1");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Experiencia:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(imagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel25)
                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre4)
                    .addComponent(clase4)
                    .addComponent(nivel4)
                    .addComponent(experiencia4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mana4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ataque4)
                            .addComponent(defensa4)
                            .addComponent(vida4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(conectar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(conectar4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel25)
                                .addComponent(nombre4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26)
                                .addComponent(clase4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel27)
                                .addComponent(nivel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel28)
                                .addComponent(experiencia4)))
                        .addComponent(imagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(ataque4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(defensa4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(vida4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(mana4)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Nuevo Personaje");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colocarPersonajes(Personaje[] a) {
        user.imprimirPersonajes();
        if (a[0] == null) {
            nombre1.setText(null);
            clase1.setText(null);
            nivel1.setText(null);
            experiencia1.setText(null);
            ataque1.setText(null);
            defensa1.setText(null);
            vida1.setText(null);
            mana1.setText(null);
            imagen1.setText(null);
            imagen1.setIcon(null);
            conectar1.setEnabled(false);
            borrar1.setEnabled(false);
        } else {
            nombre1.setText(a[0].getNombre());
            clase1.setText(a[0].getClase().getNombre());
            nivel1.setText("" + a[0].getNivel());
            experiencia1.setText("" + a[0].getExperiencia());
            ataque1.setText("" + a[0].getAtaque());
            defensa1.setText("" + a[0].getDefensa());
            vida1.setText("" + a[0].getVida());
            mana1.setText("" + a[0].getMana());
            imagen1.setText(null);
//            ImageIcon KH= new ImageIcon(new ImageIcon(a[0].getClase().getRutaimagen()).getImage().getScaledInstance(124,124, Image.SCALE_DEFAULT));
//            imagen1.setIcon(KH);
//            if(a[0].getClase().getNombre())
//            imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobachata/Imágenes/guerrero.jpg")));
            colocarImagen(imagen1,a[0]);
            conectar1.setEnabled(true);
            borrar1.setEnabled(true);
        }
        if (a[1] == null) {
            nombre2.setText("");
            clase2.setText("");
            nivel2.setText("");
            experiencia2.setText("");
            ataque2.setText(null);
            defensa2.setText(null);
            vida2.setText(null);
            mana2.setText(null);
            imagen2.setText(null);
            imagen2.setIcon(null);
            conectar2.setEnabled(false);
            borrar2.setEnabled(false);
        } else {
            nombre2.setText(a[1].getNombre());
            clase2.setText(a[1].getClase().getNombre());
            nivel2.setText("" + a[1].getNivel());
            experiencia2.setText("" + a[1].getExperiencia());
            ataque2.setText("" + a[1].getAtaque());
            defensa2.setText("" + a[1].getDefensa());
            vida2.setText("" + a[1].getVida());
            mana2.setText("" + a[1].getMana());
            imagen2.setText(null);
//            imagen2.setIcon(a[1].getClase().getImagen());
            conectar2.setEnabled(true);
            borrar2.setEnabled(true);
            colocarImagen(imagen2,a[1]);
        }
        if (a[2] == null) {
            nombre3.setText(null);
            clase3.setText(null);
            nivel3.setText(null);
            experiencia3.setText(null);
            ataque3.setText(null);
            defensa3.setText(null);
            vida3.setText(null);
            mana3.setText(null);
            imagen3.setText(null);
            imagen3.setIcon(null);
            conectar3.setEnabled(false);
            borrar3.setEnabled(false);
        } else {
            nombre3.setText(a[2].getNombre());
            clase3.setText(a[2].getClase().getNombre());
            nivel3.setText("" + a[2].getNivel());
            experiencia3.setText("" + a[2].getExperiencia());
            ataque3.setText("" + a[2].getAtaque());
            defensa3.setText("" + a[2].getDefensa());
            vida3.setText("" + a[2].getVida());
            mana3.setText("" + a[2].getMana());
            imagen3.setText(null);
//            imagen3.setIcon(a[2].getClase().getImagen());
            conectar3.setEnabled(true);
            borrar3.setEnabled(true);
            colocarImagen(imagen3,a[2]);
        }
        if (a[3] == null) {
            nombre4.setText(null);
            clase4.setText(null);
            nivel4.setText(null);
            experiencia4.setText(null);
            ataque4.setText(null);
            defensa4.setText(null);
            vida4.setText(null);
            mana4.setText(null);
            imagen4.setText(null);
            imagen4.setIcon(null);
            conectar4.setEnabled(false);
            borrar4.setEnabled(false);
        } else {
            nombre4.setText(a[3].getNombre());
            clase4.setText(a[3].getClase().getNombre());
            nivel4.setText("" + a[3].getNivel());
            experiencia4.setText("" + a[3].getExperiencia());
            ataque4.setText("" + a[3].getAtaque());
            defensa4.setText("" + a[3].getDefensa());
            vida4.setText("" + a[3].getVida());
            mana4.setText("" + a[3].getMana());
            imagen4.setText(null);
//            imagen4.setIcon(a[3].getClase().getImagen());
            conectar4.setEnabled(true);
            borrar4.setEnabled(true);
            colocarImagen(imagen4,a[3]);
        }
        this.setVisible(true);
    }
    private void borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar1ActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "¿Seguro?");
        if (res == 0) {
            user.borrarPersonaje(nombre1.getText());
            bdo.borrarPersonaje(bd, nombre1.getText());
            pjs = user.getPersonajes();
            colocarPersonajes(pjs);
            bd.store(user);
        }


    }//GEN-LAST:event_borrar1ActionPerformed

    private void borrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar2ActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "¿Seguro?");

        if (res == 0) {

            user.borrarPersonaje(nombre2.getText());
            bdo.borrarPersonaje(bd, nombre2.getText());
            pjs = user.getPersonajes();
            colocarPersonajes(pjs);
            bd.store(user);
        }
    }//GEN-LAST:event_borrar2ActionPerformed

    private void colocarImagen(JLabel img, Personaje pj){
        if(pj.getClase().getNombre().equalsIgnoreCase("guerrero")){
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobachata/Imágenes/guerrero.jpg")));
        }else if(pj.getClase().getNombre().equalsIgnoreCase("mago")){
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobachata/Imágenes/mago.jpg")));
        }else if(pj.getClase().getNombre().equalsIgnoreCase("picaro")){
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobachata/Imágenes/picaro.jpg")));
        }else if(pj.getClase().getNombre().equalsIgnoreCase("guardian")){
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobachata/Imágenes/guardian.jpg")));
        }
    }
    private void borrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar4ActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "¿Seguro?");
        if (res == 0) {
            user.borrarPersonaje(nombre4.getText());
            bdo.borrarPersonaje(bd, nombre4.getText());
            pjs = user.getPersonajes();
            colocarPersonajes(pjs);
            bd.store(user);
        }
    }//GEN-LAST:event_borrar4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean espacio = false;
        for (int i = 0; i < 4; i++) {

            if (pjs[i] == null) {
                espacio = true;

            }
        }
        if (espacio) {
            NuevoPersonajeGUI nuevoPj = new NuevoPersonajeGUI(null, user, bd);
            colocarPersonajes(user.getPersonajes());
        } else {
            JOptionPane.showMessageDialog(null, "No tienes espacio para más personajes.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void conectar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectar1ActionPerformed
        Personaje pjj = user.getPersonajes()[0];
        Mapa map = new Mapa(null, pjj, bd);
        colocarPersonajes(pjs);
    }//GEN-LAST:event_conectar1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void conectar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectar2ActionPerformed
        Personaje pjj = user.getPersonajes()[1];
        Mapa map = new Mapa(null, pjj, bd);
        colocarPersonajes(pjs);
    }//GEN-LAST:event_conectar2ActionPerformed

    private void conectar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectar4ActionPerformed
        Personaje pjj = user.getPersonajes()[3];
        Mapa map = new Mapa(null, pjj, bd);
        colocarPersonajes(pjs);
    }//GEN-LAST:event_conectar4ActionPerformed

    private void conectar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectar3ActionPerformed
        Personaje pjj = user.getPersonajes()[2];
        Mapa map = new Mapa(null, pjj, bd);colocarPersonajes(pjs);
    }//GEN-LAST:event_conectar3ActionPerformed

    private void borrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar3ActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "¿Seguro?");
        if (res == 0) {
            user.borrarPersonaje(nombre3.getText());
            bdo.borrarPersonaje(bd, nombre3.getText());
            pjs = user.getPersonajes();
            colocarPersonajes(pjs);
            bd.store(user);
        }
    }//GEN-LAST:event_borrar3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ataque1;
    private javax.swing.JLabel ataque2;
    private javax.swing.JLabel ataque3;
    private javax.swing.JLabel ataque4;
    private javax.swing.JButton borrar1;
    private javax.swing.JButton borrar2;
    private javax.swing.JButton borrar3;
    private javax.swing.JButton borrar4;
    private javax.swing.JLabel clase1;
    private javax.swing.JLabel clase2;
    private javax.swing.JLabel clase3;
    private javax.swing.JLabel clase4;
    private javax.swing.JButton conectar1;
    private javax.swing.JButton conectar2;
    private javax.swing.JButton conectar3;
    private javax.swing.JButton conectar4;
    private javax.swing.JLabel defensa1;
    private javax.swing.JLabel defensa2;
    private javax.swing.JLabel defensa3;
    private javax.swing.JLabel defensa4;
    private javax.swing.JLabel experiencia1;
    private javax.swing.JLabel experiencia2;
    private javax.swing.JLabel experiencia3;
    private javax.swing.JLabel experiencia4;
    private javax.swing.JLabel imagen1;
    private javax.swing.JLabel imagen2;
    private javax.swing.JLabel imagen3;
    private javax.swing.JLabel imagen4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel mana1;
    private javax.swing.JLabel mana2;
    private javax.swing.JLabel mana3;
    private javax.swing.JLabel mana4;
    private javax.swing.JLabel nivel1;
    private javax.swing.JLabel nivel2;
    private javax.swing.JLabel nivel3;
    private javax.swing.JLabel nivel4;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel nombre4;
    private javax.swing.JLabel vida1;
    private javax.swing.JLabel vida2;
    private javax.swing.JLabel vida3;
    private javax.swing.JLabel vida4;
    // End of variables declaration//GEN-END:variables
}
