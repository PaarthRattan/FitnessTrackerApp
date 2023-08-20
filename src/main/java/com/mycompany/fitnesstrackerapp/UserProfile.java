/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesstrackerapp;

/**
 *
 * @author admin
 */
public class UserProfile {
    
    private int age;    
    private String name;
    private int weight; // subject to change incase we want different data type
    private int height; // subject to change incase we want different data type
    private String exerciseLevel;
    private String username;
    private String password;
//  private String userGoals; Depends on if we want to add this to our code or not
//
//    /**
//     * Get the value of userGoals
//     *
//     * @return the value of userGoals
//     */
//    public String getUserGoals() {
//        return userGoals;
//    }
//
//    /**
//     * Set the value of userGoals
//     *
//     * @param userGoals new value of userGoals
//     */
//    public void setUserGoals(String userGoals) {
//        this.userGoals = userGoals;
//    }


    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Get the value of username
     *
     * @return the value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the value of username
     *
     * @param username new value of username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Get the value of exerciseLevel
     *
     * @return the value of exerciseLevel
     */
    public String getExerciseLevel() {
        return exerciseLevel;
    }

    /**
     * Set the value of exerciseLevel
     *
     * @param exerciseLevel new value of exerciseLevel
     */
    public void setExerciseLevel(String exerciseLevel) {
        this.exerciseLevel = exerciseLevel;
    }


    /**
     * Get the value of height
     *
     * @return the value of height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set the value of height
     *
     * @param height new value of height
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Get the value of weight
     *
     * @return the value of weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Set the value of weight
     *
     * @param weight new value of weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }


    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /*
    * Change based on what we wish to display in the text file. 
    */
    @Override
    public String toString() {
        return "UserProfile{" + "age=" + age + ", name=" + name + ", weight=" + weight + ", height=" + height + ", exerciseLevel=" + exerciseLevel + ", username=" + username + ", password=" + password + '}';
    }
    
    

}
