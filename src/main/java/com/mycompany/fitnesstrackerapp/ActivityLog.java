/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesstrackerapp;


/**
 *
 * @author VihoHuang
 */
public class ActivityLog {
    
    
    
    
    
        
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
