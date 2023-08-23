/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitnesstrackerapp;
import java.io.BufferedReader; //importing reader to read text file
import java.io.FileReader; //importing the file reader
import java.io.IOException; //importing an exception
import java.util.ArrayList; //importing the properties to use an arrayList
import java.util.HashMap; //importing HashMap to make the code run faster and smoother
import java.util.List; //importing the properties to use a List
import java.util.Map; //importing map to make the code run faster and smoother 

//int age = User.getAge();

/**
 *
 * @author sande
 */
public class DietPlans extends javax.swing.JFrame {
        List<User> userInfoList = new ArrayList<>();
    /**
     * Creates new form DietPlans
     */
    public DietPlans() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butBack = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtOutputs = new javax.swing.JTextArea();
        ButtonGroupActivity = new javax.swing.ButtonGroup();
        ButtonGroupMacro = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        butBack1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaintenanceCalories = new javax.swing.JTextField();
        txtProteinIntake = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnFindDiets = new javax.swing.JButton();
        btnSedentary = new javax.swing.JRadioButton();
        btnLightActive = new javax.swing.JRadioButton();
        btnModActive = new javax.swing.JRadioButton();
        btnVeryActive = new javax.swing.JRadioButton();
        btnExtraActive = new javax.swing.JRadioButton();
        btnCalories = new javax.swing.JButton();
        btnProtein = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGain = new javax.swing.JRadioButton();
        btnLose = new javax.swing.JRadioButton();
        btnMaintain = new javax.swing.JRadioButton();

        butBack.setText("Back");
        butBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBackActionPerformed(evt);
            }
        });

        txtOutputs.setEditable(false);
        txtOutputs.setColumns(20);
        txtOutputs.setRows(5);
        jScrollPane3.setViewportView(txtOutputs);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Diet Plan");

        jLabel2.setText("Here you are given names of diets to choose from along with foods that correspond with the diet depending on your BMI and protein requirements.");

        butBack1.setText("Back");
        butBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBack1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Daily Calories:");

        jLabel5.setText("Protein Intake (g) :");

        txtMaintenanceCalories.setEditable(false);
        txtMaintenanceCalories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaintenanceCaloriesActionPerformed(evt);
            }
        });

        txtProteinIntake.setEditable(false);

        txtOutput.setEditable(false);
        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane5.setViewportView(txtOutput);

        jLabel6.setText("Choose your activity level and find diets, calculate your protein needs, and calculate your calorie needs.");

        btnFindDiets.setText("Find Diets");
        btnFindDiets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindDietsActionPerformed(evt);
            }
        });

        ButtonGroupActivity.add(btnSedentary);
        btnSedentary.setText("Sedentary");
        btnSedentary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSedentaryActionPerformed(evt);
            }
        });

        ButtonGroupActivity.add(btnLightActive);
        btnLightActive.setText("Lightly Active");
        btnLightActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLightActiveActionPerformed(evt);
            }
        });

        ButtonGroupActivity.add(btnModActive);
        btnModActive.setText("Moderately Active");
        btnModActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActiveActionPerformed(evt);
            }
        });

        ButtonGroupActivity.add(btnVeryActive);
        btnVeryActive.setText("Very Active");
        btnVeryActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeryActiveActionPerformed(evt);
            }
        });

        ButtonGroupActivity.add(btnExtraActive);
        btnExtraActive.setText("Extra Active");
        btnExtraActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtraActiveActionPerformed(evt);
            }
        });

        btnCalories.setText("Calculate Daily Calories");
        btnCalories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaloriesActionPerformed(evt);
            }
        });

        btnProtein.setText("Calculate Daily Protein Intake");
        btnProtein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProteinActionPerformed(evt);
            }
        });

        jLabel3.setText("You may also calculate  your protein requirements and calorie requirements.");

        jLabel7.setText("Choose maintain, loose, or gain weight to calculate your macros:");

        ButtonGroupMacro.add(btnGain);
        btnGain.setText("Gain");
        btnGain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGainActionPerformed(evt);
            }
        });

        ButtonGroupMacro.add(btnLose);
        btnLose.setText("Lose");
        btnLose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoseActionPerformed(evt);
            }
        });

        ButtonGroupMacro.add(btnMaintain);
        btnMaintain.setText("Maintain");
        btnMaintain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaintainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(269, 269, 269)
                .addComponent(butBack1)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLose)
                            .addComponent(btnMaintain))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(0, 123, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtProteinIntake, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtMaintenanceCalories, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(307, 307, 307)
                                .addComponent(btnProtein)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLightActive)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSedentary)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnModActive)
                                        .addComponent(btnVeryActive)
                                        .addComponent(btnFindDiets)
                                        .addComponent(btnExtraActive))
                                    .addGap(377, 377, 377)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnGain)
                        .addGap(304, 304, 304)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(194, 194, 194))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCalories)
                                    .addGap(85, 85, 85))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(butBack1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSedentary)
                        .addGap(8, 8, 8)
                        .addComponent(btnLightActive)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModActive)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVeryActive)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExtraActive)
                        .addGap(18, 18, 18)
                        .addComponent(btnFindDiets)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMaintenanceCalories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalories)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProteinIntake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProtein)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGain)
                        .addGap(18, 18, 18)
                        .addComponent(btnLose)
                        .addGap(18, 18, 18)
                        .addComponent(btnMaintain)
                        .addGap(101, 101, 101))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBackActionPerformed

    }//GEN-LAST:event_butBackActionPerformed

    private void butBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBack1ActionPerformed
        // Navigate back to the HomeScreen
        OptionsScreen optionsScreen = new OptionsScreen();
        optionsScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_butBack1ActionPerformed

    private void btnFindDietsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindDietsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFindDietsActionPerformed

    private void txtMaintenanceCaloriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaintenanceCaloriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaintenanceCaloriesActionPerformed

    private void btnCaloriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaloriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCaloriesActionPerformed

    private void btnProteinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProteinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProteinActionPerformed

    private void btnSedentaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSedentaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSedentaryActionPerformed

    private void btnLightActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLightActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLightActiveActionPerformed

    private void btnModActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModActiveActionPerformed

    private void btnVeryActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeryActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVeryActiveActionPerformed

    private void btnExtraActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtraActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExtraActiveActionPerformed

    private void btnGainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGainActionPerformed

    private void btnLoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoseActionPerformed

    private void btnMaintainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaintainActionPerformed

    private double calculateProteinIntake(User user) {
    double bmr;

    if (user.getSex().equalsIgnoreCase("male")) {
        bmr = 10 * user.getWeight() + 6.25 * user.getHeight() - 5 * user.getAge() + 5;
    } else {
        bmr = 10 * user.getWeight() + 6.25 * user.getHeight() - 5 * user.getAge() - 161;
    }

    double activityMultiplier;

    switch (user.getActivityLevel()) {
        case "sedentary":
            activityMultiplier = 1.2;
            break;
        case "lightly active":
            activityMultiplier = 1.375;
            break;
        case "moderately active":
            activityMultiplier = 1.55;
            break;
        case "very active":
            activityMultiplier = 1.725;
            break;
        case "extra active":
            activityMultiplier = 1.9;
            break;
        default:
            activityMultiplier = 1.0;
            break;
    }

    double adjustedCalories = bmr * activityMultiplier;

    if (user.getGoal().equalsIgnoreCase("weight loss")) {
        adjustedCalories *= 0.9; // Reduce by 10%
    } else if (user.getGoal().equalsIgnoreCase("weight gain")) {
        adjustedCalories += 500;
    }

    double proteinIntake = (adjustedCalories * 0.4) / 4; // Convert calories to grams

    return proteinIntake;
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
            java.util.logging.Logger.getLogger(DietPlans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DietPlans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DietPlans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DietPlans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DietPlans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ButtonGroupActivity;
    private javax.swing.ButtonGroup ButtonGroupMacro;
    private javax.swing.JButton btnCalories;
    private javax.swing.JRadioButton btnExtraActive;
    private javax.swing.JButton btnFindDiets;
    private javax.swing.JRadioButton btnGain;
    private javax.swing.JRadioButton btnLightActive;
    private javax.swing.JRadioButton btnLose;
    private javax.swing.JRadioButton btnMaintain;
    private javax.swing.JRadioButton btnModActive;
    private javax.swing.JButton btnProtein;
    private javax.swing.JRadioButton btnSedentary;
    private javax.swing.JRadioButton btnVeryActive;
    private javax.swing.JButton butBack;
    private javax.swing.JButton butBack1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField txtMaintenanceCalories;
    private javax.swing.JTextArea txtOutput;
    private javax.swing.JTextArea txtOutputs;
    private javax.swing.JTextField txtProteinIntake;
    // End of variables declaration//GEN-END:variables
}
