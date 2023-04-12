/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fenetre;
//bibliothèques
import java.awt.BorderLayout;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

//projet L2 MIASHS Amel BOUABDELLAH BOURSALI 400000259 et Ayoub KHAYEF ALLAH 40000476
/**
 *
 * @author boursaliamel
 */
public class Electio extends javax.swing.JFrame {

    
    private JButton connexion;
    Connection con;
    PreparedStatement pst ;
        Connection co = null;
        ResultSet Rs = null;
        PreparedStatement ps= null;
    /**
     * Creates new form Electio
     */
    public Electio() {
        initComponents();
    }
 /**
  * permet de se connecter à la base SQL bdproject1 via SQLITE
  *  
  */
public void Connect() throws SQLException{
     try {
            Class.forName("org.sqlite.JDBC");
            co = DriverManager.getConnection("jdbc:sqlite:bdprojet1.db"); 
            System.out.println("Connection Etablie");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erreur de connection");
            e.printStackTrace();
        }finally{
            try{
                Rs.close();
                pst.close();
            }catch(Exception e){
                
            }
        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        seconnecter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        mdp = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        inscription = new javax.swing.JButton();
        Homme = new javax.swing.JRadioButton();
        Femme = new javax.swing.JRadioButton();
        txtmdp = new javax.swing.JPasswordField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1271, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel4.setFont(new java.awt.Font("Kohinoor Telugu", 0, 18)); // NOI18N
        jLabel4.setText("Mot de passe :");

        jLabel3.setFont(new java.awt.Font("Kohinoor Telugu", 0, 18)); // NOI18N
        jLabel3.setText("Identifiant :");

        seconnecter.setBackground(new java.awt.Color(255, 255, 255));
        seconnecter.setText("Connexion");
        seconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seconnecterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Kohinoor Bangla", 1, 18)); // NOI18N
        jTextField4.setText("Veuillez entrer votre identifiant et votre mot de passe");
        jTextField4.setBorder(null);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Kohinoor Bangla", 1, 18)); // NOI18N
        jTextField5.setText("Vous n'êtes pas encore inscrit ? Créer votre compte dès maintenant !");
        jTextField5.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Kohinoor Telugu", 0, 18)); // NOI18N
        jLabel6.setText("Nom :");

        jLabel9.setFont(new java.awt.Font("Kohinoor Telugu", 0, 18)); // NOI18N
        jLabel9.setText("Prénom :");

        jLabel10.setFont(new java.awt.Font("Kohinoor Telugu", 0, 18)); // NOI18N
        jLabel10.setText("Sexe :");

        jLabel11.setFont(new java.awt.Font("Kohinoor Telugu", 0, 18)); // NOI18N
        jLabel11.setText("Identifiant :");

        jLabel12.setFont(new java.awt.Font("Kohinoor Telugu", 0, 18)); // NOI18N
        jLabel12.setText("Mot de passe :");

        inscription.setBackground(new java.awt.Color(255, 255, 255));
        inscription.setText("S'inscrire");
        inscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscriptionActionPerformed(evt);
            }
        });

        buttonGroup8.add(Homme);
        Homme.setText("Homme");

        buttonGroup8.add(Femme);
        Femme.setText("Femme");

        txtmdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmdpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mdp, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(495, 495, 495)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seconnecter))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(inscription, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(33, 33, 33)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(64, 64, 64)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtid)
                                                .addComponent(txtPrenom)
                                                .addComponent(txtNom)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(Homme)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                                    .addComponent(Femme))
                                                .addComponent(txtmdp)))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mdp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(seconnecter)
                        .addGap(27, 27, 27)))
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Homme)
                        .addComponent(Femme)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmdp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inscription)
                .addGap(131, 131, 131))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 204, 255));
        jLabel5.setText("Plateforme de vote de ");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 204, 255));
        jLabel7.setText("L'Université Paris Nanterre");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fenetre/logoufr-SEGMI.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addComponent(jLabel2)
                .addGap(70, 70, 70)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(707, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
        );

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Kohinoor Telugu", 0, 16)); // NOI18N
        jTextPane1.setText("Bienvenue sur le site officiel de vote de l'Université Paris Nanterre !\n\nC'est la première plateforme en ligne de vote. \nSimple et facile d'utilisation, elle permet aux étudiants de pouvoir voter et   \nélir leur représentant pour la durée de 1 ans​.\nDéveloppé par deux étudiants en MIASHS Ayoub Khayef-Allah et Amel Boursali,  \nClic&vote.net à été élu meilleur projet des L2 MIASHS 2022. \nIl respecte le cadre réglementaire et sécurité défini par l'Éducation nationale.  \nCet espace est uniquement accessible à la communauté des étudiants à l'aide \nd'un identifiant et d'un mot de passe unique pour chaque utilisateur.   ​​\n\nBonne navigation !​");
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3564, 3564, 3564)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
                                            
    
    private void seconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seconnecterActionPerformed

       /** permet de verifier si l'étudiant est inscrit dans la base de donnée en vérifiiant si son identifiant et mot de passe 
       * est dans la base bdprojet1
       * 
       */
        try {
            Connect();
            ps = co.prepareStatement("select * from utilisateur where id=?  and mdp=?");
            ps.setString(1, id.getText().toString());
         
            ps.setString(2, mdp.getText().toString() );
            Rs = ps.executeQuery();

            if (Rs.next()) {
                
             super.dispose();
             //permet de se rendre dans la page d'accueil
             new Connexion().setVisible(true);
             this.setVisible(false);


            } else {
                
            JOptionPane.showMessageDialog(null, "Identifiant et/ou mot de passe incorrect","ERREUR",JOptionPane.ERROR_MESSAGE);
            co.close();
            
           
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Identifiant et/ou mot de passe incorrect","ERREUR",JOptionPane.ERROR_MESSAGE);
            
        } finally{
            try{
                Rs.close();
                pst.close();
            }catch(Exception e){
                
            }
        }
        
        
    }//GEN-LAST:event_seconnecterActionPerformed
  
    @SuppressWarnings("deprecation")
    private void inscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscriptionActionPerformed
      //permet d'inscrire l'étudiant dans la base de donnée bdprojet1 pour qu'il puisse enfin se connecter         
        try{
    Class.forName("org.sqlite.JDBC");
    con = DriverManager.getConnection("jdbc:sqlite:bdprojet1.db");
    String sql = "insert into utilisateur(id,mdp,nom,prenom)values(?,?,?,?)";
    pst = con.prepareStatement(sql);
    pst.setString(1,txtid.getText());
    pst.setString(2,txtmdp.getText());
    pst.setString(3,txtNom.getText());
    pst.setString(4,txtPrenom.getText());
    pst.execute();
    con.close();
    
    JOptionPane.showMessageDialog(null,txtNom.getText().toString()+" : "+" Enregistrement reussi");
    }catch (Exception e){
    JOptionPane.showMessageDialog(null,"erreur" +e.getMessage());


    
        }finally{
            try{
                Rs.close();
                pst.close();
            }catch(Exception e){
                
            }
        }

  
    }//GEN-LAST:event_inscriptionActionPerformed



    private void txtmdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmdpActionPerformed

    private void ShowPanel(JPanel m){ 
      m.setSize(558,439);
      m.setLocation(0, 0);
      
      content.removeAll();
      content.add(m ,BorderLayout.CENTER);
      content.revalidate();
      content.repaint();
    }
 /* @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Electio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Electio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Electio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Electio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Electio().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Femme;
    private javax.swing.JRadioButton Homme;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JTextField id;
    private javax.swing.JButton inscription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField mdp;
    private javax.swing.JButton seconnecter;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtid;
    private javax.swing.JPasswordField txtmdp;
    // End of variables declaration//GEN-END:variables

    private boolean Homme(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void Femme(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   

}

