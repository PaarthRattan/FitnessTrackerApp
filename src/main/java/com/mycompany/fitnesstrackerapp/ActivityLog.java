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
 * @author Viho
 */
public class ActivityLog {
    private UserProfile userProfile; // An instance of UserProfile

    public ActivityLog(UserProfile userProfile) {
        this.userProfile = userProfile;
    }
    

    // Access user attributes using the UserProfile instance and its getter methods
        int age = userProfile.getAge();
        boolean isMale = userProfile.isMale();
        float heightFeet = userProfile.getHeightFeet();
        float heightInches = userProfile.getHeightInches();
        float weightPounds = userProfile.getWeightPounds();
        int activityLevelChoice = userProfile.getActivityLevelChoice();
        int weightGoal = userProfile.getWeightGoal();


    
    }
        
        
        
        
        
        
        
    
    

