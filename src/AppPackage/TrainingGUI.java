/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.awt.Color;
import java.awt.Dialog.ModalityType;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import net.iharder.dnd.FileDrop;

/**
 *
 * @author Lenovo
 */
public class TrainingGUI extends javax.swing.JFrame {

    /**
     * Creates new form StartGUI
     */
    public TrainingGUI() {
        initComponents();
        
        
        this.setEnabled(true);
        
        jPanel1.setBackground(new Color(0,0,0,170));
        jLabel5.setVisible(false);
        jLabel7.setVisible(false);
        
        new  FileDrop( pnlContentTraining, new FileDrop.Listener()
        {   public void  filesDropped( java.io.File[] files )
            {   
                for( int i = 0; i < files.length; i++ )
                {       
                    BufferedImage img = null;
                        try {
                            img = ImageIO.read(new File(files[i].getCanonicalPath()));                            
                            lblGetfilename.setText(files[i].getCanonicalPath());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        Image dimg = img.getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(),
                        Image.SCALE_SMOOTH);
                        
                        jLabel4.setIcon(new ImageIcon(dimg));
                        jLabel3.hide();
                }
            }   // end filesDropped
        }); // end FileDrop.Listener
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGetfilename = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Training_Melanoma = new javax.swing.JLabel();
        Melanoma_Trial = new javax.swing.JLabel();
        Setting = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        spImgProcessing = new javax.swing.JSeparator();
        lblImgProcessing = new javax.swing.JLabel();
        lblLearningObject = new javax.swing.JLabel();
        spLearningObject = new javax.swing.JSeparator();
        pnlContentTraining = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        lblGetfilename.setText("lblGetfilename");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(78, 78, 78));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(198, 233, 41));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 220, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 270, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\MechineLearning-Melanoma\\src\\MediaPackage\\Desain-Flashscreen.png")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\MechineLearning-Melanoma\\src\\MediaPackage\\Delete_48px.png")); // NOI18N
        jLabel1.setToolTipText("Exit");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 50, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 750, 50));

        jPanel4.setBackground(new java.awt.Color(198, 233, 41));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\MechineLearning-Melanoma\\src\\MediaPackage\\Menu_32px.png")); // NOI18N

        Training_Melanoma.setBackground(new java.awt.Color(221, 255, 70));
        Training_Melanoma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Training_Melanoma.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\MechineLearning-Melanoma\\src\\MediaPackage\\MindMap_32px.png")); // NOI18N
        Training_Melanoma.setToolTipText("Training of Melanoma");
        Training_Melanoma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Training_Melanoma.setOpaque(true);

        Melanoma_Trial.setBackground(new java.awt.Color(209, 255, 0));
        Melanoma_Trial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Melanoma_Trial.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\MechineLearning-Melanoma\\src\\MediaPackage\\SearchProperty_32px.png")); // NOI18N
        Melanoma_Trial.setToolTipText("Melanoma Trial");
        Melanoma_Trial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Melanoma_Trial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Melanoma_TrialMouseClicked(evt);
            }
        });

        Setting.setBackground(new java.awt.Color(209, 255, 0));
        Setting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Setting.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\MechineLearning-Melanoma\\src\\MediaPackage\\Settings_32px.png")); // NOI18N
        Setting.setToolTipText("Setting");
        Setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(Training_Melanoma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Melanoma_Trial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Setting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel6)
                .addGap(82, 82, 82)
                .addComponent(Training_Melanoma, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(Melanoma_Trial, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(Setting, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 580));

        jPanel5.setBackground(new java.awt.Color(36, 47, 65));

        spImgProcessing.setForeground(new java.awt.Color(60, 63, 65));

        lblImgProcessing.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblImgProcessing.setForeground(new java.awt.Color(255, 255, 255));
        lblImgProcessing.setText("ImageProcessing");
        lblImgProcessing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgProcessingMouseClicked(evt);
            }
        });

        lblLearningObject.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLearningObject.setForeground(new java.awt.Color(255, 255, 255));
        lblLearningObject.setText("LearningObject");
        lblLearningObject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLearningObjectMouseClicked(evt);
            }
        });

        spLearningObject.setForeground(new java.awt.Color(60, 63, 65));

        pnlContentTraining.setBackground(new java.awt.Color(78, 78, 78));
        pnlContentTraining.setForeground(new java.awt.Color(78, 78, 78));
        pnlContentTraining.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlContentTrainingMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\MechineLearning-Melanoma\\src\\MediaPackage\\Upload_96px.png")); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Drop file to upload");

        javax.swing.GroupLayout pnlContentTrainingLayout = new javax.swing.GroupLayout(pnlContentTraining);
        pnlContentTraining.setLayout(pnlContentTrainingLayout);
        pnlContentTrainingLayout.setHorizontalGroup(
            pnlContentTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentTrainingLayout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addGroup(pnlContentTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentTrainingLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentTrainingLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(221, 221, 221))))
        );
        pnlContentTrainingLayout.setVerticalGroup(
            pnlContentTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentTrainingLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\MechineLearning-Melanoma\\src\\MediaPackage\\loader.gif")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Please wait ...");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(spImgProcessing, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblImgProcessing))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(spLearningObject, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblLearningObject))
                .addGap(134, 134, 134))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel7))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel5)))
                .addContainerGap(256, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(86, Short.MAX_VALUE)
                    .addComponent(pnlContentTraining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblImgProcessing)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spImgProcessing, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblLearningObject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spLearningObject, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(37, Short.MAX_VALUE)
                    .addComponent(pnlContentTraining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(116, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 750, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 570));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\MechineLearning-Melanoma\\src\\MediaPackage\\Untitled-1.png")); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 810, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void Melanoma_TrialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Melanoma_TrialMouseClicked
        // TODO add your handling code here:
        MelanomatrialGUI t = new MelanomatrialGUI();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_Melanoma_TrialMouseClicked

    private void SettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingMouseClicked
        // TODO add your handling code here:
        SettingGUI t = new SettingGUI();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_SettingMouseClicked

    private void lblImgProcessingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgProcessingMouseClicked
        // TODO add your handling code here:
        if(lblGetfilename.getText().equals("lblGetfilename")){
            JOptionPane.showConfirmDialog(null,
                                           "Input your data on spcae !",
                                           "Machinelearning Melanoma", 
                                           JOptionPane.CANCEL_OPTION,
                                           JOptionPane.WARNING_MESSAGE); 
        }
        else{            
            pnlContentTraining.setVisible(false);
            jLabel5.setVisible(true);
            jLabel7.setVisible(true);
            spImgProcessing.setBackground(new Color(0,171,235));
            spLearningObject.setBackground(new Color(255,255,255));
            
            
        }
    }//GEN-LAST:event_lblImgProcessingMouseClicked

    private void lblLearningObjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLearningObjectMouseClicked
        // TODO add your handling code here:
        spLearningObject.setBackground(new Color(0,171,235));
        spImgProcessing.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_lblLearningObjectMouseClicked

    private void pnlContentTrainingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlContentTrainingMouseClicked
        // TODO add your handling code here:
        new  FileDrop( pnlContentTraining, new FileDrop.Listener()
        {   public void  filesDropped( java.io.File[] files )
            {   
                for( int i = 0; i < files.length; i++ )
                {   try
                    {   //jLabel3.setText(files[i].getCanonicalPath() + "\n" );
                        jLabel4.setIcon(new ImageIcon(files[i].getCanonicalPath()));
                        jLabel3.hide();
                    }   // end try
                    catch( java.io.IOException e ) {}
                }   // end for: through each dropped file
            }   // end filesDropped
        }); // end FileDrop.Listener
    }//GEN-LAST:event_pnlContentTrainingMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrainingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    Thread.sleep(2000);
                }catch(Exception ex){
                    
                }
                
                new TrainingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Melanoma_Trial;
    private javax.swing.JLabel Setting;
    private javax.swing.JLabel Training_Melanoma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblGetfilename;
    private javax.swing.JLabel lblImgProcessing;
    private javax.swing.JLabel lblLearningObject;
    private javax.swing.JPanel pnlContentTraining;
    private javax.swing.JSeparator spImgProcessing;
    private javax.swing.JSeparator spLearningObject;
    // End of variables declaration//GEN-END:variables
}
