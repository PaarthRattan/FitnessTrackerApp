package com.mycompany.fitnesstrackerapp;

/**
 * Represents a user in the fitness tracker app.
 * This class stores user information including username, password, sex, height,
 * weight, activity level, age, and name.
 */
public class User {
    private String username;
    private String password;
    private String sex;
    private double height;
    private float weightPounds;
    private String activityLevelChoice;
    private int age;
    private String name;

    // Constructor with activity level, for calculating macros
    public User(String username, String password, String sex, double height,
                float weightPounds, String activityLevelChoice, int age, String name) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.height = height;
        this.weightPounds = weightPounds;
        this.activityLevelChoice = activityLevelChoice;
        this.age = age;
        this.name = name;
    }
    
    // Overloaded constructor without activity level, when making account
    public User(String username, String password, String sex, double height,
                float weightPounds, int age, String name) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.height = height;
        this.weightPounds = weightPounds;
        this.age = age;
        this.name = name;
    }

    // Getter methods
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public double getHeight() {
        return height;
    }

    public float getWeightPounds() {
        return weightPounds;
    }

    public String getActivityLevelChoice() {
        return activityLevelChoice;
    }
    
    public int getAge(){
        return age;
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
    
    public void setSex (String sex) {
        this.sex = sex;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setWeightPounds(float weightPounds) {
        this.weightPounds = weightPounds;
    }
    
    public void setActivityLevelChoice(String activityLevelChoice) {
        this.activityLevelChoice = activityLevelChoice;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
