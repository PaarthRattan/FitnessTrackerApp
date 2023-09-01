/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesstrackerapp;

/**
 * Represents an exercise in the fitness tracker app.
 * This class stores information about the exercise, including name, calories burned,
 * focus area, and whether it requires a gym.
 */
public class Exercise {
    // Instance variables
    String name; 
    int caloriesBurned;
    String focus;
    String gymRequired;
       
    /**
     * Constructor for creating an Exercise object.
     * @param name The name of the exercise.
     * @param caloriesBurned The calories burned per session of the exercise.
     * @param focus The focus area of the exercise (e.g., cardio, strength, flexibility).
     * @param gymRequired Whether the exercise requires a gym (yes or no).
     */
    public Exercise(String name, int caloriesBurned, String focus, String gymRequired) {
        this.name = name;
        this.caloriesBurned = caloriesBurned;
        this.focus = focus;
        this.gymRequired = gymRequired; 
    }
}
