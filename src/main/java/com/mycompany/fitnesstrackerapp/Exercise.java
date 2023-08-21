/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesstrackerapp;

/**
 *
 * @author sande
 */
public class Exercise {
    //instance variables
    String name; 
    int caloriesBurned;
    String focus;
    String gymRequired;
       
    public Exercise(String name, int caloriesBurned, String focus, String gymRequired) {
        this.name = name;
        this.caloriesBurned = caloriesBurned;
        this.focus = focus;
        this.gymRequired = gymRequired; 
    }
}
