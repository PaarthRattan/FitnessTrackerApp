package com.mycompany.fitnesstrackerapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutionException;
import javax.swing.SwingWorker;
import javax.swing.Timer;

/**
 *
 * @author paart
 */
public class CreateAccountScreen extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccountScreen
     */
    public CreateAccountScreen() {
        initComponents();
        initializeEventHandlers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SexButtonGroup = new javax.swing.ButtonGroup();
        lblIntro = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblSex = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        txtPassword = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnCreateAccount = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIntro.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblIntro.setText("Please Fill in the Fields Below:");

        lblUsername.setText("Username: ");

        lblPassword.setText("Password: ");

        lblName.setText("Name: ");

        lblAge.setText("Age (16 - 80): ");

        lblSex.setText("Sex: ");

        lblHeight.setText("Height (cm): ");

        lblWeight.setText("Weight (lbs)");

        SexButtonGroup.add(btnMale);
        btnMale.setText("Male");
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });

        SexButtonGroup.add(btnFemale);
        btnFemale.setText("Female");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        btnCreateAccount.setText("Create Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblIntro))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnCreateAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(btnBack)))
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSex)
                        .addGap(27, 27, 27)
                        .addComponent(btnMale)
                        .addGap(18, 18, 18)
                        .addComponent(btnFemale))
                    .addComponent(lblPassword)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHeight)
                            .addComponent(lblWeight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblUsername)
                            .addComponent(lblAge))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblIntro)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSex)
                    .addComponent(btnMale)
                    .addComponent(btnFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeight)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateAccount)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaleActionPerformed
    private boolean processing = false; // Flag to prevent multiple executions
    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        // TODO add your handling code here:
        
        if (processing) {
            return; // Prevent multiple executions
        }

        // Set the processing flag to true to prevent further executions
        processing = true;

        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String name = txtName.getText();
        int age;
        String sex;
        float height, weightPounds;

        try {
            age = Integer.parseInt(txtAge.getText());
            height = Float.parseFloat(txtHeight.getText());
            weightPounds = Float.parseFloat(txtWeight.getText());
        } catch (NumberFormatException e) {
            txtResult.setText("Invalid input. Please check your age, height, and weight.");
            processing = false; // Reset the processing flag on error
            return;
        }

        // Validate user input
        if (username.isEmpty() || password.isEmpty() || name.isEmpty() || txtAge.getText().isEmpty() || txtHeight.getText().isEmpty() || txtWeight.getText().isEmpty()) {
            txtResult.setText("Please fill in all fields.");
            processing = false; // Reset the processing flag on error
            return;
        }

        if (username.length() < 8 || username.length() > 20) {
            txtResult.setText("Username must be between 8 and 20 characters.");
            processing = false; // Reset the processing flag on error
            return;
        }

        if (password.length() < 8) {
            txtResult.setText("Password must be at least 8 characters long.");
            processing = false; // Reset the processing flag on error
            return;
        }

        if (age < 16 || age > 80) {
            txtResult.setText("Age must be between 16 and 80 years.");
            processing = false; // Reset the processing flag on error
            return;
        }

        if (height < 122) {
            txtResult.setText("Height must be at least 122 cm.");
            processing = false; // Reset the processing flag on error
            return;
        }

        // Determine the 'sex' based on the selected radio button
        if (btnMale.isSelected()) {
            sex = "Male";
        } else if (btnFemale.isSelected()) {
            sex = "Female";
        } else {
            txtResult.setText("Please select your sex.");
            processing = false; // Reset the processing flag on error
            return;
        }

        // Create a UserProfile instance
        UserProfile userProfile = UserProfile.getInstance();

        if (userProfile.isUsernameTaken(username)) {
            txtResult.setText("An account with this username already exists.");
            processing = false; // Reset the processing flag on error
            return;
        }


        SwingWorker<Boolean, Void> accountCreationWorker = new SwingWorker<Boolean, Void>() {
            @Override
            protected Boolean doInBackground() throws Exception {
                // Attempt to create the account
                return userProfile.createAccount(username, password, sex, height, weightPounds, age, name);
            }

            @Override
            protected void done() {
                try {
                    boolean accountCreated = get();

                    if (accountCreated) {
                        // Display success message
                        txtResult.setText("Account Created Successfully.");

                        // Create a timer with a delay of 1000 milliseconds (1 second)
                        int delay = 1000; // 1 second
                        Timer timer = new Timer(delay, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // Navigate to the next screen (HomeScreen) or perform other actions
                                HomeScreen homeScreen = new HomeScreen();
                                homeScreen.setVisible(true);
                                CreateAccountScreen.this.dispose();
                            }
                        });

                        // Start the timer
                        timer.setRepeats(false); // Set to non-repeating
                        timer.start();
                    } else {
                        txtResult.setText("Error creating account.");
                    }
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                    txtResult.setText("Error creating account.");
                } finally {
                    

                    // Reset the processing flag to allow future executions
                    processing = false;
                }
            }
        };

        // Execute the SwingWorker
        accountCreationWorker.execute();

    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        // Navigate back to the HomeScreen
        HomeScreen homeScreen = new HomeScreen();
        homeScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    // Event handler initialization
    private void initializeEventHandlers() {
        btnCreateAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCreateAccountActionPerformed(e);
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnBackActionPerformed(e);
            }
        });
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
            java.util.logging.Logger.getLogger(CreateAccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup SexButtonGroup;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblIntro;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}