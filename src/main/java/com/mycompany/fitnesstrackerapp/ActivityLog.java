/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesstrackerapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author VihoHuang
 */
public class ActivityLog {
    private UserProfile userProfile; // An instance of UserProfile

    public ActivityLog(UserProfile userProfile) {
        this.userProfile = userProfile;
    }
    
    
    
    public static void displayActivities() {
        
        System.out.println("Here are a list of activies: ");
        
        try {
            // Create a FileReader, which is a type of Reader
            FileReader fileReader = new FileReader("example.txt");

            // Wrap the FileReader with a BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Now you can use the BufferedReader to read data
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Remember to close the BufferedReader when done
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        
    }
    
    
    // Access user attributes using the UserProfile instance and its getter methods
    int age = userProfile.getAge();
    boolean isMale = userProfile.isMale();
    float heightFeet = userProfile.getHeightFeet();
    float heightInches = userProfile.getHeightInches();
    float weightPounds = userProfile.getWeightPounds();
    int activityLevelChoice = userProfile.getActivityLevelChoice();
    int weightGoal = userProfile.getWeightGoal();

    public void calculateProteinIntake() {

        float activityMultiplier = getActivityMultiplier(activityLevelChoice);
        float bmr;

        if (isMale) {
            bmr = 10 * (weightPounds * 0.453592f) + 6.25f * ((heightFeet * 30.48f) + (heightInches * 2.54f)) - 5 * age + 5;
        } else {
            bmr = 10 * (weightPounds * 0.453592f) + 6.25f * ((heightFeet * 30.48f) + (heightInches * 2.54f)) - 5 * age - 161;
        }

        float calorieIntake;

        if (weightGoal == 2) { // Lose Weight
            calorieIntake = bmr * activityMultiplier * 0.8f;
        } else if (weightGoal == 3) { // Gain Weight
            calorieIntake = bmr * activityMultiplier + 500;
        } else { // Maintain Current Weight
            calorieIntake = bmr * activityMultiplier;
        }

        float proteinIntake = (calorieIntake * 0.4f) / 4; // 40% of calories from protein

        System.out.println("Recommended daily protein intake: " + String.format("%.2f", proteinIntake) + "g");
    }

    private static float getActivityMultiplier(int activityLevelChoice) {
        switch (activityLevelChoice) {
            case 1:
                return 1.2f; // Sedentary
            case 2:
                return 1.375f; // Lightly active
            case 3:
                return 1.55f; // Moderately active
            case 4:
                return 1.725f; // Very active
            case 5:
                return 1.9f; // Extra active
            default:
                return 1.0f; // Default to sedentary
        }
    }
        
        
        
        
        
        
        
    
    
}
