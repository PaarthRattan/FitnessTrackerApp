/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitnesstrackerapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author VihoHuang
 */
public class ActivityLogJFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginJFrame
     */
    public ActivityLogJFrame(){
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBig = new javax.swing.JTextArea();
        txtSmall = new javax.swing.JTextField();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        btnCaloriesBurntAscending = new javax.swing.JRadioButton();
        btnChronoAscending = new javax.swing.JRadioButton();
        BtnChronoDescending = new javax.swing.JRadioButton();
        btnCategoryCardio = new javax.swing.JRadioButton();
        btnSort = new javax.swing.JButton();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        txtCalsBurned = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        btnAddActivity = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnCategoryStrength = new javax.swing.JRadioButton();
        txtName = new javax.swing.JTextField();
        lbl9 = new javax.swing.JLabel();
        txtNeedsGym = new javax.swing.JTextField();
        lbl10 = new javax.swing.JLabel();
        btnCaloriesBurntDescending = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Activity Logs");

        lbl.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl.setText("Activity Logs");

        txtBig.setEditable(false);
        txtBig.setColumns(20);
        txtBig.setRows(5);
        jScrollPane1.setViewportView(txtBig);

        txtSmall.setEditable(false);

        lbl1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl1.setText("View past activity logs:");

        lbl2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl2.setText("Sort By:");

        buttonGroup1.add(btnCaloriesBurntAscending);
        btnCaloriesBurntAscending.setText("Calories Burnt (Ascending)");
        btnCaloriesBurntAscending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaloriesBurntAscendingActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnChronoAscending);
        btnChronoAscending.setText("Chronological (Ascending)");
        btnChronoAscending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChronoAscendingActionPerformed(evt);
            }
        });

        buttonGroup1.add(BtnChronoDescending);
        BtnChronoDescending.setText("Chronological (Descending)");
        BtnChronoDescending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChronoDescendingActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnCategoryCardio);
        btnCategoryCardio.setText("Category: Cardio");
        btnCategoryCardio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryCardioActionPerformed(evt);
            }
        });

        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        lbl3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl3.setText("Add activity to log:");

        lbl4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl4.setText("Category (cardio or strength):");

        lbl5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbl6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl6.setText("Calories Burned:");

        lbl7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl7.setText("Date (MM/DD/YYYY):");

        btnAddActivity.setText("Add Activity");
        btnAddActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActivityActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnCategoryStrength);
        btnCategoryStrength.setText("Category: Strength");

        lbl9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl9.setText("Name of exercise:");

        lbl10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl10.setText("Needs gym? (yes or no)");

        buttonGroup1.add(btnCaloriesBurntDescending);
        btnCaloriesBurntDescending.setText("Calories Burnt (Descending)");
        btnCaloriesBurntDescending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaloriesBurntDescendingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(lbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl2)
                            .addComponent(btnCaloriesBurntAscending)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(lbl5))
                            .addComponent(lbl3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl7)
                                .addGap(18, 18, 18)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl6)
                                .addGap(18, 18, 18)
                                .addComponent(txtCalsBurned, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAddActivity)
                            .addComponent(btnChronoAscending)
                            .addComponent(BtnChronoDescending)
                            .addComponent(btnCategoryCardio)
                            .addComponent(btnCategoryStrength)
                            .addComponent(btnSort)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl10)
                                .addGap(18, 18, 18)
                                .addComponent(txtNeedsGym, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl9)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCaloriesBurntDescending)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl4)
                                .addGap(18, 18, 18)
                                .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSmall, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSmall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1)
                    .addComponent(btnBack))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCaloriesBurntAscending)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCaloriesBurntDescending)
                        .addGap(3, 3, 3)
                        .addComponent(btnChronoAscending)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnChronoDescending)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCategoryCardio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCategoryStrength)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSort)
                        .addGap(69, 69, 69)
                        .addComponent(lbl3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl9)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl6)
                            .addComponent(txtCalsBurned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl4)
                            .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl10)
                            .addComponent(txtNeedsGym, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl7)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddActivity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl5)))
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
     // Variables to store exercise details
    String name = ""; // Name of the exercise
    int cals = 0; // Calories burned during the exercise
    String category = ""; // Category of the exercise (Cardio or Strength)
    String needsGym = ""; // Whether the exercise requires a gym (yes or no)
    String date = ""; // Date when the exercise was performed
    BufferedReader reader = null;
    String username = "";

    private void setUsername(){
        try {
            reader = new BufferedReader(new FileReader("Username.txt"));
            if(reader.ready()){
                username = reader.readLine();
                reader.close();
            }
            else{
                txtSmall.setText("There is no user.");
            }
}
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(ActivityLogJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        catch (IOException ex) {
            Logger.getLogger(ActivityLogJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void btnCaloriesBurntAscendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaloriesBurntAscendingActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCaloriesBurntAscendingActionPerformed

    private void btnChronoAscendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChronoAscendingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChronoAscendingActionPerformed

    private void BtnChronoDescendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChronoDescendingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnChronoDescendingActionPerformed

    private void btnCategoryCardioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryCardioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCategoryCardioActionPerformed

    // Handler for the "Sort" button click event
    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        // TODO add your handling code here:
        // Clear the JTextArea
        txtBig.setText("");
        
        // Check if a sorting order is selected
        if (!BtnChronoDescending.isSelected() && !btnCaloriesBurntAscending.isSelected() && !btnCaloriesBurntDescending.isSelected()
            && !btnCategoryCardio.isSelected() && !btnCategoryStrength.isSelected() && !btnChronoAscending.isSelected()) {
            txtSmall.setText("Please choose a sorting order.");
        }
        
        // Sort and display based on selected sorting order
        else{
            // Clear any previous error messages
            txtSmall.setText("");
            
            // Check the selected sorting order and perform the appropriate sorting
            if (btnCaloriesBurntAscending.isSelected()) {
                sortActivityLogByCaloriesAscending();
            }
            
            else if (btnCaloriesBurntDescending.isSelected()) {
                sortActivityLogByCaloriesDescending();
            }
            
            else if (btnChronoAscending.isSelected()) {
                
                sortLogsChronoAscending();
            } 
            
            else if (BtnChronoDescending.isSelected()) {
                sortLogsChronoDescending();
            } 
            
            else if (btnCategoryCardio.isSelected()) {
                sortActivityLogByCardio();
            }
            
            else if (btnCategoryStrength.isSelected()) {
                sortActivityLogByStrength();
            }
        }
        
        
        
        
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnCaloriesBurntDescendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaloriesBurntDescendingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCaloriesBurntDescendingActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Navigate back to the HomeScreen
        OptionsScreen optionsScreen = new OptionsScreen();
        optionsScreen.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActivityActionPerformed
        // TODO add your handling code here:
        ArrayList <String> logs = new ArrayList<>();
        try {
             txtSmall.setText("");
            if (txtCalsBurned.getText().equalsIgnoreCase("") && txtCategory.getText().equalsIgnoreCase("")
                && txtDate.getText().equalsIgnoreCase("") && txtName.getText().equalsIgnoreCase("") 
                && txtDate.getText().equalsIgnoreCase("")) {
                txtSmall.setText("Error: fields are blank");
            }
            
            name = txtName.getText();
            cals = Integer.parseInt(txtCalsBurned.getText());
            category = txtCategory.getText();
            needsGym = txtNeedsGym.getText();
            date = txtDate.getText();
            
            
            if (!needsGym.equalsIgnoreCase("yes") && !needsGym.equalsIgnoreCase("no")) {
                txtSmall.setText("Enter yes or no for 'needs gym'");
                
            }
            else if (!category.equalsIgnoreCase("cardio") && !category.equalsIgnoreCase("strength")) {
               txtSmall.setText("Enter a valid category");
            }
            
            else if (cals > 1500 || cals < 0) {
                txtSmall.setText("Enter a valid amount of calories burned");
            }
            else if (!isValidDate(date)){
                txtSmall.setText("Enter a date in the valid format (MM/DD/YYYY)");
            }
            
            else{
                storeOldLogs(logs, "ActivityLog.txt");
                addLog(logs, "ActivityLog.txt");
                txtSmall.setText("Added Successfully.");
                txtCalsBurned.setText("");
                txtCategory.setText("");
                txtDate.setText("");
                txtName.setText("");
                txtNeedsGym.setText("");
            }
        }  
        catch (NumberFormatException nfe) {
            txtSmall.setText("Error: enter valid values");
        }
    }//GEN-LAST:event_btnAddActivityActionPerformed
  
    //Method to check if date entered by user is of valid format,*/
    private boolean isValidDate(String date) {
        // Create a SimpleDateFormat instance with the desired date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        // Set lenient to false, so the date parsing is strict and won't tolerate invalid dates
        dateFormat.setLenient(false);

        try {
            // Try to parse the provided date using the defined format
            Date parsedDate = dateFormat.parse(date);
            String[] dateParts = date.split("/");

            // Check if the date was successfully split into three parts (MM, DD, YYYY)
            if (dateParts.length == 3) {
                int day = Integer.parseInt(dateParts[1]);
                int month = Integer.parseInt(dateParts[0]);
                int year = Integer.parseInt(dateParts[2]);

                // Check if day, month, and year values are within valid ranges
                if (day >= 1 && day <= 31 && month >= 1 && month <= 12 && year >= 1000 && year <= 9999) {
                    return true; // Valid date format
                }
            }
        } catch (ParseException | NumberFormatException e) {
            // Parsing failed (invalid date format or non-numeric values)
        }
        return false; // Invalid date format
    }
    
    
    private void sortActivityLogByCardio() {
        List<String> activityLogLines = new ArrayList<>();

        // Read the activity log file and populate the activityLogLines list
        try (BufferedReader reader = new BufferedReader(new FileReader("ActivityLog.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                activityLogLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Filter out invalid log entries
        List<String> validLogs = activityLogLines.stream()
                .filter(log -> {
                    String[] exerciseParts = log.split(",");
                    return exerciseParts.length >= 2 && exerciseParts[2].equalsIgnoreCase("Cardio");
                })
                .collect(Collectors.toList());

        // Sort the valid logs by calories in descending order
        validLogs.sort((log1, log2) -> {
            int calories1 = Integer.parseInt(log1.split(",")[1]);
            int calories2 = Integer.parseInt(log2.split(",")[1]);
            return Integer.compare(calories2, calories1);
        });

        // Get the current user's logs and print them
        getActivityLogsForCurrentUser(validLogs);
    }

    private void sortActivityLogByStrength() {
        List<String> activityLogLines = new ArrayList<>();

        // Read the activity log file and populate the activityLogLines list
        try (BufferedReader reader = new BufferedReader(new FileReader("ActivityLog.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                activityLogLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Filter out invalid log entries
        List<String> validLogs = activityLogLines.stream()
                .filter(log -> {
                    String[] exerciseParts = log.split(",");
                    return exerciseParts.length >= 2 && exerciseParts[2].equalsIgnoreCase("Strength");
                })
                .collect(Collectors.toList());

        // Sort the valid logs by calories in descending order
        validLogs.sort((log1, log2) -> {
            int calories1 = Integer.parseInt(log1.split(",")[1]);
            int calories2 = Integer.parseInt(log2.split(",")[1]);
            return Integer.compare(calories2, calories1);
        });

        // Get the current user's logs and print them
        getActivityLogsForCurrentUser(validLogs);
    }

    // Method to sort exercises by calories burnt in ascending order
    private void sortActivityLogByCaloriesAscending() {
        List<String> activityLogLines = new ArrayList<>();

        // Read the activity log file and populate the activityLogLines list
        try (BufferedReader reader = new BufferedReader(new FileReader("ActivityLog.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                activityLogLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Filter out invalid log entries
        List<String> validLogs = activityLogLines.stream()
                .filter(log -> log.split(",").length >= 2)
                .collect(Collectors.toList());

        // Sort the valid logs by calories in ascending order
        validLogs.sort((log1, log2) -> {
            int calories1 = Integer.parseInt(log1.split(",")[1]);
            int calories2 = Integer.parseInt(log2.split(",")[1]);
            return Integer.compare(calories1, calories2);
        });

        // Get the current user's logs and print them
        getActivityLogsForCurrentUser(validLogs);
    }

    private void sortActivityLogByCaloriesDescending() {
        List<String> activityLogLines = new ArrayList<>();

        // Read the activity log file and populate the activityLogLines list
        try (BufferedReader reader = new BufferedReader(new FileReader("ActivityLog.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                activityLogLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Filter out invalid log entries
        List<String> validLogs = activityLogLines.stream()
                .filter(log -> log.split(",").length >= 2)
                .collect(Collectors.toList());

        // Sort the valid logs by calories in descending order
        validLogs.sort((log1, log2) -> {
            int calories1 = Integer.parseInt(log1.split(",")[1]);
            int calories2 = Integer.parseInt(log2.split(",")[1]);
            return Integer.compare(calories2, calories1);
        });

        // Get the current user's logs and print them
        getActivityLogsForCurrentUser(validLogs);
    }

    private void sortLogsChronoAscending() {
        List<String> activityLogLines = new ArrayList<>();

        // Read the activity log file and populate the activityLogLines list
        try (BufferedReader reader = new BufferedReader(new FileReader("ActivityLog.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                activityLogLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort the activity log lines based on dates in ascending order
        Collections.sort(activityLogLines, Comparator.comparing(ActivityLogJFrame::extractDate));

        getActivityLogsForCurrentUser(activityLogLines);
    }

    private void sortLogsChronoDescending() {
        List<String> activityLogLines = new ArrayList<>();

        // Read the activity log file and populate the activityLogLines list
        try (BufferedReader reader = new BufferedReader(new FileReader("ActivityLog.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                activityLogLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort the activity log lines based on dates in ascending order
        Collections.sort(activityLogLines, Comparator.comparing(ActivityLogJFrame::extractDate).reversed());

        getActivityLogsForCurrentUser(activityLogLines);
    }

     //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     
    // Retrieves activity logs for the username stored in Username.txt
    private void getActivityLogsForCurrentUser(List<String> activityLogLines) {
        String username = getUsernameFromFile("Username.txt");
        List<String> sortedLogs = getSortedLogsByUsername(username, activityLogLines);
        printActivityLogs(sortedLogs);  
    }

    // Retrieves username from a file
    private String getUsernameFromFile(String filepath) {
        String username = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            if (reader.ready()) {
                username = reader.readLine();
                System.out.println(username);
                reader.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(ActivityLogJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return username;
    }
    
    // Retrieves username from a file
    private List<String> getSortedLogsByUsername(String username, List<String> activityLogLines) {
        List<String> sortedLogs = new ArrayList<>();
        for (String line : activityLogLines) {
            if (line.contains(username)) {
                sortedLogs.add(line);
            }
        }
        // Sort the activity log lines based on the username
        Collections.sort(sortedLogs);
        return sortedLogs;
    }
    
    private void printActivityLogs(List<String> sortedLogs) {
        txtBig.append("Exercise, Calories, Category, Needs a Gym, Date, Username\n");
        for (String line : sortedLogs) {
            txtBig.append(line + "\n");
        }
    }

    // Retrieves activity logs with a specific username
    private void getActivityLogsByUsername(String username, List<String> logs) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ActivityLog.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] logParts = line.split(",");
                if (logParts[5].equals(username)) {
                    System.out.println(username + "!");
                    logs.add(line);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
    
    

    private static LocalDate extractDate(String line) {
        // Extract and parse the date from the line
        String dateString = line.split(",")[4].trim();
        return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }
    
    // Method to display sorted exercises in the JTextArea
    private void displaySortedActivityLog(List<String> sortedExercises) {
        txtBig.setText(""); // Clear the JTextArea
        txtBig.append("Exercise, Calories, Category, Needs a Gym, Date");
        for (String exercise : sortedExercises) {
            txtBig.append("\n" + exercise);
        }
    }
    
     private String createLog(){
        return name + "," + cals + "," + category + "," + needsGym + "," + date + "," + username;
    }
     
    
    
    private void storeOldLogs(List<String> logs, String filepath){
        try {
            BufferedReader r = new BufferedReader(new FileReader(filepath));

            while (r.ready()) {
                String store = r.readLine().toString();
                logs.add(store);
            }
        } catch (IOException ex) {
            Logger.getLogger(ActivityLogJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (String log : logs) {
            String store = log;
            System.out.println(store);
        }
    }
    
    private void addLog(List<String> logs, String filepath){
        try {
            FileWriter fileWriter = new FileWriter(filepath);
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            
            String activityLog = createLog();
            System.out.println(activityLog);
            logs.add(activityLog);
            for (int i = 0; i < logs.size(); i++) {
                if (!reader.ready()) {  
                    fileWriter.write(logs.get(i) + "\n");
                } else {
                    fileWriter.write("\r");
                    i--;
                }
            }   
            fileWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(ActivityLogJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(ActivityLogJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActivityLogJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActivityLogJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActivityLogJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActivityLogJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BtnChronoDescending;
    private javax.swing.JButton btnAddActivity;
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnCaloriesBurntAscending;
    private javax.swing.JRadioButton btnCaloriesBurntDescending;
    private javax.swing.JRadioButton btnCategoryCardio;
    private javax.swing.JRadioButton btnCategoryStrength;
    private javax.swing.JRadioButton btnChronoAscending;
    private javax.swing.JButton btnSort;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl9;
    private javax.swing.JTextArea txtBig;
    private javax.swing.JTextField txtCalsBurned;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNeedsGym;
    private javax.swing.JTextField txtSmall;
    // End of variables declaration//GEN-END:variables
}
