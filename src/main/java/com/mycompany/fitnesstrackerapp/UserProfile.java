/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesstrackerapp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class UserProfile {
    
    private int age;
    private boolean isMale;
    private float heightFeet;
    private float heightInches;
    private float weightPounds;
    private int activityLevelChoice;
    private int weightGoal;
    
    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method for isMale
    public boolean isMale() {
        return isMale;
    }

    // Setter method for isMale
    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    // Getter method for heightFeet
    public float getHeightFeet() {
        return heightFeet;
    }

    // Setter method for heightFeet
    public void setHeightFeet(float heightFeet) {
        this.heightFeet = heightFeet;
    }

    // Getter method for heightInches
    public float getHeightInches() {
        return heightInches;
    }

    // Setter method for heightInches
    public void setHeightInches(float heightInches) {
        this.heightInches = heightInches;
    }

    // Getter method for weightPounds
    public float getWeightPounds() {
        return weightPounds;
    }

    // Setter method for weightPounds
    public void setWeightPounds(float weightPounds) {
        this.weightPounds = weightPounds;
    }

    // Getter method for activityLevelChoice
    public int getActivityLevelChoice() {
        return activityLevelChoice;
    }

    // Setter method for activityLevelChoice
    public void setActivityLevelChoice(int activityLevelChoice) {
        this.activityLevelChoice = activityLevelChoice;
    }

    // Getter method for weightGoal
    public int getWeightGoal() {
        return weightGoal;
    }

    // Setter method for weightGoal
    public void setWeightGoal(int weightGoal) {
        this.weightGoal = weightGoal;
    }
    
    public void collectUserInput() {
        Scanner scanner = new Scanner(System.in);
        
        

        try {
            System.out.print("Enter your age (years): ");
            age = scanner.nextInt();

            do {
                System.out.print("Enter your sex (1 for Male, 2 for Female): ");
                int sexChoice = scanner.nextInt();
                if (sexChoice == 1) {
                    isMale = true;
                } else if (sexChoice == 2) {
                    isMale = false;
                } else {
                    System.out.println("Invalid sex choice. Please enter 1 for Male or 2 for Female.");
                }
            } while (!isMale && isMale);

            do {
                System.out.print("Enter your height (Feet, maximum 8): ");
                heightFeet = scanner.nextFloat();
                if (heightFeet < 0 || heightFeet > 8) {
                    System.out.println("Invalid height. Please enter a value between 0 and 8 feet.");
                }
            } while (heightFeet < 0 || heightFeet > 8);

            do {
                System.out.print("Enter your height (Inches, maximum 11): ");
                heightInches = scanner.nextFloat();
                if (heightInches < 0 || heightInches >= 12) {
                    System.out.println("Invalid height. Please enter a value between 0 and 11 inches.");
                }
            } while (heightInches < 0 || heightInches >= 12);

            System.out.print("Enter your weight (Pounds): ");
            weightPounds = scanner.nextFloat();

            do {
                System.out.print("Enter your current activity level (1 to 5):\n" +
                        "1. Sedentary\n" +
                        "2. Lightly active\n" +
                        "3. Moderately active\n" +
                        "4. Very active\n" +
                        "5. Extra active\n" +
                        "Select an option: ");
                activityLevelChoice = scanner.nextInt();
                if (activityLevelChoice < 1 || activityLevelChoice > 5) {
                    System.out.println("Invalid activity level choice. Please select a number between 1 and 5.");
                }
            } while (activityLevelChoice < 1 || activityLevelChoice > 5);

            do {
                System.out.print("Enter your weight goal (1 for Maintain, 2 for Lose, 3 for Gain): ");
                weightGoal = scanner.nextInt();
                if (weightGoal < 1 || weightGoal > 3) {
                    System.out.println("Invalid weight goal choice. Please select 1, 2, or 3.");
                }
            } while (weightGoal < 1 || weightGoal > 3);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numerical values.");
        } finally {
            scanner.close();
        }
    }
    
    

}
