/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesstrackerapp;

/**
 *
 * @author paart
 */
public class User {
    private String username;
    private String password;
    private boolean isMale;
    private double height;
    private float weightPounds;
    private int activityLevelChoice;
    private String name;

    // Constructor
    public User(String username, String password, boolean isMale, double height,
                float weightPounds, int activityLevelChoice, String name) {
        this.username = username;
        this.password = password;
        this.isMale = isMale;
        this.height = height;
        this.weightPounds = weightPounds;
        this.activityLevelChoice = activityLevelChoice;
        this.name = name;
    }

    // Getter methods
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public double getHeight() {
        return height;
    }

    public float getWeightPounds() {
        return weightPounds;
    }

    public int getActivityLevelChoice() {
        return activityLevelChoice;
    }

    public String getName() {
        return name;
    }

    public void setUsername(String username) {
        this.username = username;
    }
  
    // Setter method for password
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setMale(boolean male) {
        isMale = male;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setWeightPounds(float weightPounds) {
        this.weightPounds = weightPounds;
    }
    
    public void setActivityLevelChoice(int activityLevelChoice) {
        this.activityLevelChoice = activityLevelChoice;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
