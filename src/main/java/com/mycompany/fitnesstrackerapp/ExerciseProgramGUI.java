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


/*
In this class, the program evaluates what the user desires and lists exercises 
along with the calories burnt and other such properties of the exercise. It 
aids the user to know what exercises to do if they want to burn calories or gain muscle. 
 */

public class ExerciseProgramGUI extends javax.swing.JFrame {
    List<Exercise> exercises = readExercisesFromFile("exercises.txt"); //Listens everything in the text
    Map<String, List<Exercise>> categorizedExercises = categorizeExercises(exercises); //creates a List

    public ExerciseProgramGUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtOutputs = new javax.swing.JTextArea();
        butBack = new javax.swing.JButton();
        txtCategory = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtUpdate = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        butGym = new javax.swing.JButton();
        txtGymAvailability = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        butCalories = new javax.swing.JButton();
        txtMinCalories = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMaxCalories = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        butCategory = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        txtOutput.setEditable(false);
        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 51, 255));
        jTextField2.setText("Exercise Program");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("This feature will help you choose your perfect exercise depending on your needs!");

        txtOutputs.setEditable(false);
        txtOutputs.setColumns(20);
        txtOutputs.setRows(5);
        jScrollPane3.setViewportView(txtOutputs);

        butBack.setText("Back");
        butBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBackActionPerformed(evt);
            }
        });

        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });

        jLabel4.setText("These are the List of Exercises Depending on your Requirements!!!");

        txtUpdate.setEditable(false);
        txtUpdate.setColumns(20);
        txtUpdate.setRows(5);
        jScrollPane4.setViewportView(txtUpdate);

        jLabel5.setText("The Categories are Cardio, Strength or Both!");

        butGym.setText("View Exercise depending on Gym Availabiltiy");
        butGym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGymActionPerformed(evt);
            }
        });

        txtGymAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGymAvailabilityActionPerformed(evt);
            }
        });

        jLabel6.setText("Simply enter 'yes' or 'no'");

        butCalories.setText("View Exercise by Calories Burned");
        butCalories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCaloriesActionPerformed(evt);
            }
        });

        txtMinCalories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinCaloriesActionPerformed(evt);
            }
        });

        jLabel7.setText("Enter the minimum number at the top");

        txtMaxCalories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxCaloriesActionPerformed(evt);
            }
        });

        jLabel8.setText("Enter the maximum number at the bottom");

        butCategory.setText("View Exercise by Category");
        butCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCategoryActionPerformed(evt);
            }
        });

        jLabel9.setText("*These Calories are per hour of average BMI of 22*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butBack)
                                .addGap(204, 204, 204))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGap(26, 26, 26)
                                                    .addComponent(butCategory)
                                                    .addGap(66, 66, 66)
                                                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jLabel6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(butGym)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtGymAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(butCalories)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtMaxCalories, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addGap(57, 57, 57)
                                                        .addComponent(txtMinCalories, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addGap(104, 104, 104))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addGap(230, 230, 230)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butBack))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(butCategory))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(butGym)
                                    .addComponent(txtGymAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butCalories)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMinCalories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtMaxCalories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void butBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBackActionPerformed
        // Navigate back to the HomeScreen
        OptionsScreen optionsScreen = new OptionsScreen();
        optionsScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_butBackActionPerformed

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryActionPerformed

    }//GEN-LAST:event_txtCategoryActionPerformed

    private void butGymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGymActionPerformed
        // Get the user's choice of gym availability
        String choice = txtGymAvailability.getText();

        // Clear the text outputs area
        clear();

        // Check the user's choice and display corresponding exercises
        if (choice.equalsIgnoreCase("yes")) {
            // If choice is 'yes', display exercises that require a gym
            List<Exercise> gymRequiredExercises = getGymRequiredExercises(exercises);
            if (!gymRequiredExercises.isEmpty()) {
                txtOutputs.setText("Exercises that require a gym:\n");
                for (Exercise exercise : gymRequiredExercises) {
                    txtOutputs.append(exercise.name + ": " + exercise.caloriesBurned + "\n");
                }
            } else {
                txtOutputs.setText("No exercises found that require a gym. \n");
            }
        } else if (choice.equalsIgnoreCase("no")) {
            // If choice is 'no', display exercises that don't require a gym
            List<Exercise> exercisesNotRequiringGym = getExercisesNotRequiringGym(exercises);
            if (!exercisesNotRequiringGym.isEmpty()) {
                txtOutputs.setText("Exercises that don't require a gym:\n");
                for (Exercise exercise : exercisesNotRequiringGym) {
                    txtOutputs.append(exercise.name + ": " + exercise.caloriesBurned + "\n");
                }
            } else {
                txtOutputs.setText("All exercises require a gym.\n");
            }
        } else {
            // If choice is neither 'yes' nor 'no', display an error message
            txtUpdate.setText("Please enter a valid response of 'yes' or 'no'!\n");
        }
    }//GEN-LAST:event_butGymActionPerformed

    private void txtGymAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGymAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGymAvailabilityActionPerformed

    private void butCaloriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCaloriesActionPerformed
        String minCaloriesInput = txtMinCalories.getText().trim();  // Get the user input for minimum calories
        String maxCaloriesInput = txtMaxCalories.getText().trim();  // Get the user input for maximum calories

        try {
            // Parse the input into integer values
            int minCalories = Integer.parseInt(minCaloriesInput);
            int maxCalories = Integer.parseInt(maxCaloriesInput);
            // Clear the text outputs area
            clear();
            
        if (minCalories < 0 || maxCalories < 0) { // if the user enters improper inputs for calories, the following will be shown in the txtUpdate so the user is known of the issue 
            if (minCalories < 0 && maxCalories < 0) {
                txtUpdate.setText("Please enter valid positive numbers for both minimum and maximum calories per hour!");
            } else if (minCalories < 0) {
                txtUpdate.setText("Please enter a valid positive number for the minimum calories per hour!");
            } else if (minCalories > maxCalories){
            } else {
                txtUpdate.setText("Please enter a valid positive number for the maximum calories per hour!");
            }
        }         
        else {
            // Retrieve and display exercises within the specified calorie range
            List<Exercise> exercisesInRange = getExercisesInRange(exercises, minCalories, maxCalories);
            if (!exercisesInRange.isEmpty()) {
                txtOutputs.setText("Exercises within the specified calorie range:\n");
                for (Exercise exercise : exercisesInRange) {
                    txtOutputs.append(exercise.name + ": " + exercise.caloriesBurned + "\n");
                }
            } 
        }
        } catch (NumberFormatException e) {
            // Display an error message if the user did not provide valid integer values for calories
            txtUpdate.setText("Please enter valid integer values for calories.\n");
        }
    }//GEN-LAST:event_butCaloriesActionPerformed

    private void txtMinCaloriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinCaloriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinCaloriesActionPerformed

    private void txtMaxCaloriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxCaloriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxCaloriesActionPerformed

    private void butCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCategoryActionPerformed
        String category = txtCategory.getText(); //gets the text
        clear(); //clears everything else

        List<Exercise> exercisesInCategory = categorizedExercises.getOrDefault(category.toUpperCase(), new ArrayList<>()); //Lists

        if (!exercisesInCategory.isEmpty()) { //if the list is not empty
            txtUpdate.setText(("Exercises in the " + category + " category:")); //shows all the categoryif (!exercisesInCategory.isEmpty()) {
        // Display exercises in the selected category
        for (Exercise exercise : exercisesInCategory) {
            txtOutputs.append(exercise.name + ": " + exercise.caloriesBurned + ", Gym Required: " + exercise.gymRequired + "\n");
        }
        // Count and display total exercises in the category
        int countInCategory = countExercisesInCategory(exercisesInCategory);
        txtOutputs.append("Total exercises in " + category + " category: " + countInCategory);
        } else {
            // Display a message if no exercises are found in the selected category
            txtOutputs.setText("No exercises found in the " + category + " category. Please make sure you entered one of the options correctly!");
    }
    }//GEN-LAST:event_butCategoryActionPerformed
  
    // Returns a list of exercises that fall within the specified Calorie range
    public static List<Exercise> getExercisesInRange(List<Exercise> exercises, int minCalories, int maxCalories) {
        List<Exercise> exercisesInRange = new ArrayList<>();
        for (Exercise exercise : exercises) {
            if (exercise.caloriesBurned >= minCalories && exercise.caloriesBurned <= maxCalories) {
                exercisesInRange.add(exercise); 
            }
        }
        return exercisesInRange;
    }

    // Returns a list of exercises that require a gym
    public static List<Exercise> getGymRequiredExercises(List<Exercise> exercises) {
        List<Exercise> gymRequiredExercises = new ArrayList<>();
        for (Exercise exercise : exercises) {
            if ("Yes".equalsIgnoreCase(exercise.gymRequired)) {
                gymRequiredExercises.add(exercise);
            }
        }
        return gymRequiredExercises;
    }

    // Reads exercises from a text file and returns a list of exercise objects
    public static List<Exercise> readExercisesFromFile(String fileName) {
        List<Exercise> exercises = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String name = parts[0].trim(); // Remove leading/trailing spaces
                    int caloriesBurned = Integer.parseInt(parts[1].trim()); // Remove leading/trailing spaces
                    String focus = parts[2].trim(); // Remove leading/trailing spaces
                    String gymRequired = parts[3].trim(); // Remove leading/trailing spaces
                    exercises.add(new Exercise(name, caloriesBurned, focus, gymRequired));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading exercises file: " + e.getMessage());
        }
        return exercises;
    }

    // Categorizes exercises based on their focus and returns a map of categories to exercise lists
    public static Map<String, List<Exercise>> categorizeExercises(List<Exercise> exercises) {
        Map<String, List<Exercise>> categorizedExercises = new HashMap<>();

        for (Exercise exercise : exercises) {
            String focus = exercise.focus.toUpperCase();
            categorizedExercises.computeIfAbsent(focus, k -> new ArrayList<>()).add(exercise);
            if ("BOTH".equals(focus)) {
                categorizedExercises.computeIfAbsent("CARDIO", k -> new ArrayList<>()).add(exercise);
                categorizedExercises.computeIfAbsent("STRENGTH", k -> new ArrayList<>()).add(exercise);
            }
        }

        return categorizedExercises;
    }

    // Counts the number of exercises in a given category
    public static int countExercisesInCategory(List<Exercise> exercises) {
        return exercises.size();
    }

    // Displays exercises that do not require a gym
    public static void displayExercisesNotRequiringGym(List<Exercise> exercises) {
        List<Exercise> exercisesNotRequiringGym = getExercisesNotRequiringGym(exercises);

        if (!exercisesNotRequiringGym.isEmpty()) {
            System.out.println("Exercises that don't require a gym:");
            for (Exercise exercise : exercisesNotRequiringGym) {
                System.out.println(exercise.name + ": " + exercise.caloriesBurned);
            }
        } else {
            System.out.println("All exercises require a gym.");
        }
    }

    // Returns a list of exercises that do not require a gym
    public static List<Exercise> getExercisesNotRequiringGym(List<Exercise> exercises) {
        List<Exercise> exercisesNotRequiringGym = new ArrayList<>();
        for (Exercise exercise : exercises) {
            if ("No".equalsIgnoreCase(exercise.gymRequired)) {
                exercisesNotRequiringGym.add(exercise);
            }
        }
        return exercisesNotRequiringGym;
    }

    // Clears the text fields and outputs in the GUI
    public void clear() {
        txtOutputs.setText("");
        txtUpdate.setText("");
        txtMinCalories.setText("");
        txtMaxCalories.setText("");
        txtCategory.setText("");
        txtGymAvailability.setText("");
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
            java.util.logging.Logger.getLogger(ExerciseProgramGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExerciseProgramGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExerciseProgramGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExerciseProgramGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExerciseProgramGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butBack;
    private javax.swing.JButton butCalories;
    private javax.swing.JButton butCategory;
    private javax.swing.JButton butGym;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtGymAvailability;
    private javax.swing.JTextField txtMaxCalories;
    private javax.swing.JTextField txtMinCalories;
    private javax.swing.JTextArea txtOutput;
    private javax.swing.JTextArea txtOutputs;
    private javax.swing.JTextArea txtUpdate;
    // End of variables declaration//GEN-END:variables
}
