/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesstrackerapp;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author paarth
 */
public class DietPlan {
    public void calculateProteinIntake() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age (years): ");
            int age = scanner.nextInt();

            int sexChoice;
            boolean isMale = false;
            do {
                System.out.print("Enter your sex (1 for Male, 2 for Female): ");
                sexChoice = scanner.nextInt();
                if (sexChoice == 1) {
                    isMale = true;
                } else if (sexChoice == 2) {
                    isMale = false;
                } else {
                    System.out.println("Invalid sex choice. Please enter 1 for Male or 2 for Female.");
                }
            } while (sexChoice != 1 && sexChoice != 2);

            System.out.print("Enter your height (Feet, maximum 8): ");
            float heightFeet;
            do {
                heightFeet = scanner.nextFloat();
                if (heightFeet < 0 || heightFeet > 8) {
                    System.out.println("Invalid height. Please enter a value between 0 and 8 feet.");
                }
            } while (heightFeet < 0 || heightFeet > 8);

            System.out.print("Enter your height (Inches, maximum 11): ");
            float heightInches;
            do {
                heightInches = scanner.nextFloat();
                if (heightInches < 0 || heightInches >= 12) {
                    System.out.println("Invalid height. Please enter a value between 0 and 11 inches.");
                }
            } while (heightInches < 0 || heightInches >= 12);

            System.out.print("Enter your weight (Pounds): ");
            float weightPounds = scanner.nextFloat();

            System.out.print("Enter your current activity level (1 to 5):\n" +
                    "1. Sedentary\n" +
                    "2. Lightly active\n" +
                    "3. Moderately active\n" +
                    "4. Very active\n" +
                    "5. Extra active\n" +
                    "Select an option: ");
            int activityLevelChoice = scanner.nextInt();

            if (activityLevelChoice < 1 || activityLevelChoice > 5) {
                System.out.println("Invalid activity level choice. Please select a number between 1 and 5.");
                return;
            }

            float activityMultiplier = getActivityMultiplier(activityLevelChoice);

            System.out.print("Enter your weight goal (1 for Maintain, 2 for Lose, 3 for Gain): ");
            int weightGoal = scanner.nextInt();

            if (weightGoal < 1 || weightGoal > 3) {
                System.out.println("Invalid weight goal choice. Please select 1, 2, or 3.");
                return;
            }

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
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numerical values.");
        } finally {
            scanner.close();
        }
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