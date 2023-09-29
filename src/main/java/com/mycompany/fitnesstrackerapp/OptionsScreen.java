/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitnesstrackerapp;

/**
 * Represents the options screen of the fitness tracker app.
 * Users can choose from various features such as diet planning, activity log, and exercise program.
 */

public class OptionsScreen extends javax.swing.JFrame {

    /**
     * Creates new form OptionsScreen
     */
    public OptionsScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDietPlanning = new javax.swing.JButton();
        btnActivityLog = new javax.swing.JButton();
        btnExerciseProgram = new javax.swing.JButton();
        lblIntro = new javax.swing.JLabel();
        lblIntro2 = new javax.swing.JLabel();
        lblIntro3 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setText("Choose From One the Features Below");

        btnDietPlanning.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        btnDietPlanning.setText("Diet Planning");
        btnDietPlanning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDietPlanningActionPerformed(evt);
            }
        });

        btnActivityLog.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        btnActivityLog.setText("Activity Log");
        btnActivityLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivityLogActionPerformed(evt);
            }
        });

        btnExerciseProgram.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        btnExerciseProgram.setText("Exercise Program");
        btnExerciseProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExerciseProgramActionPerformed(evt);
            }
        });

        lblIntro.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        lblIntro.setText("Find a diet for yourself and figure out your macro needs.");

        lblIntro2.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        lblIntro2.setText("Keep track of and view your fitness journey.");

        lblIntro3.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        lblIntro3.setText("Find some exercises to suit your fitness goals.");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblIntro, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblIntro3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblIntro2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActivityLog)
                            .addComponent(btnDietPlanning)
                            .addComponent(btnExerciseProgram))
                        .addContainerGap(41, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIntro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDietPlanning))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActivityLog)
                    .addComponent(lblIntro2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExerciseProgram)
                    .addComponent(lblIntro3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    // Pressing this button brings the user to the DietPlans screen
    private void btnDietPlanningActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        
        // Navigate to the DietPlan to see further details
        DietPlans dietPlan = new DietPlans();
        dietPlan.setVisible(true);
        this.dispose();
    }                                               
    
    // Pressing this button brings the user to the ActivityLog screen
    private void btnActivityLogActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        
        // Navigate to the ActivityLog to see further features
        ActivityLogJFrame activityLog = new ActivityLogJFrame();
        activityLog.setVisible(true);
        this.dispose();
    }                                              

    // Pressing this button brings the user to the ExcerciseProgram screen
    private void btnExerciseProgramActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        
        // Navigate to the ExerciseProgramGUI to see further features
        ExerciseProgramGUI exerciseProgram = new ExerciseProgramGUI();
        exerciseProgram.setVisible(true);
        this.dispose();
    }                                                  

    // Exits program
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        
        System.exit(0);
    }                                       

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OptionsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionsScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnActivityLog;
    private javax.swing.JButton btnDietPlanning;
    private javax.swing.JButton btnExerciseProgram;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblIntro;
    private javax.swing.JLabel lblIntro2;
    private javax.swing.JLabel lblIntro3;
    // End of variables declaration                   
}