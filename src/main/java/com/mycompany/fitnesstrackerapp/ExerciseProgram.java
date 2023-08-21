/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitnesstrackerapp;

import java.io.BufferedReader; //importing reader to read text file
import java.io.FileReader; //importing the file reader
import java.io.IOException; //importing an exception
import java.util.ArrayList; //importing the properties to use an arrayList
import java.util.HashMap; //importing HashMap to make the code run faster and smoother
import java.util.List; //importing the properties to use a List
import java.util.Map; //importing map to make the code run faster and smoother 
import java.util.Scanner;//importing to gain users input

public class ExerciseProgram {
    public static void main(String[] args) {
        List<Exercise> exercises = readExercisesFromFile("exercises.txt"); //Listens everything in the text
        Map<String, List<Exercise>> categorizedExercises = categorizeExercises(exercises); //creates a List

        Scanner scanner = new Scanner(System.in); //invokes scanner method 
        String continueFlag = "Y"; //creates a variable 

        while (continueFlag.equalsIgnoreCase("Y")) {//if the user enters Y
            System.out.println("Available options:"); //The user is prompted
            System.out.println("1. View exercises by category");  //The user is prompted
            System.out.println("2. View exercises that require a gym");  //The user is prompted
            System.out.println("3. View exercises that don't require a gym");  //The user is prompted
            System.out.println("4. View exercises by calories/hour (Standard Calories and depends upon person so subjected by scale)");  //The user is prompted
            System.out.print("Enter an option (1/2/3/4): ");  //The user is prompted
            String option = scanner.nextLine(); //gaining the user

            if ("1".equals(option)) { //if the answer is one
                System.out.println("Available Categories: Cardio, Strength, Both"); 
                System.out.print("Enter a category: ");
                String category = scanner.nextLine();

                List<Exercise> exercisesInCategory = categorizedExercises.getOrDefault(category.toUpperCase(), new ArrayList<>());

                if (!exercisesInCategory.isEmpty()) {
                    System.out.println("Exercises in the " + category + " category:");
                    for (Exercise exercise : exercisesInCategory) {
                        System.out.println(exercise.name + ": " + exercise.caloriesBurned + ", Gym Required: " + exercise.gymRequired);
                    }

                    int countInCategory = countExercisesInCategory(exercisesInCategory);
                    System.out.println("Total exercises in " + category + " category: " + countInCategory);
                } else {
                    System.out.println("No exercises found in the " + category + " category.");
                }
                
            } else if ("2".equals(option)) {
                List<Exercise> gymRequiredExercises = getGymRequiredExercises(exercises);
                if (!gymRequiredExercises.isEmpty()) {
                    System.out.println("Exercises that require a gym:");
                    for (Exercise exercise : gymRequiredExercises) {
                        System.out.println(exercise.name + ": " + exercise.caloriesBurned);
                    }
                } else {
                    System.out.println("No exercises found that require a gym.");
                }
            } else if ("3".equals(option)) {
                displayExercisesNotRequiringGym(exercises);
            } else if ("4".equals(option)) {
                System.out.print("Enter minimum calories: ");
                int minCalories = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter maximum calories: ");
                int maxCalories = Integer.parseInt(scanner.nextLine());

                List<Exercise> exercisesInRange = getExercisesInRange(exercises, minCalories, maxCalories);
                if (!exercisesInRange.isEmpty()) {
                    System.out.println("Exercises within the specified calorie range:");
                    for (Exercise exercise : exercisesInRange) {
                        System.out.println(exercise.name + ": " + exercise.caloriesBurned);
                    }
                } else {
                    System.out.println("No exercises found within the specified calorie range.");
                }
            } else {
                System.out.println("Invalid option. Please enter a valid option.");
            }

            System.out.print("Do you want to rerun the program? (Y/N): ");
            continueFlag = scanner.nextLine();
        }
    }
    
   public static List<Exercise> getExercisesInRange(List<Exercise> exercises, int minCalories, int maxCalories) {
    List<Exercise> exercisesInRange = new ArrayList<>();
    for (Exercise exercise : exercises) {
        if (exercise.caloriesBurned >= minCalories && exercise.caloriesBurned <= maxCalories) {
            exercisesInRange.add(exercise);
        }
    }
    return exercisesInRange;
   }
    
    
    public static List<Exercise> getGymRequiredExercises(List<Exercise> exercises) {
        List<Exercise> gymRequiredExercises = new ArrayList<>();
        for (Exercise exercise : exercises) {
            if ("Yes".equalsIgnoreCase(exercise.gymRequired)) {
                gymRequiredExercises.add(exercise);
            }
        }
        return gymRequiredExercises;
    }

    public static List<Exercise> readExercisesFromFile(String fileName) {
        List<Exercise> exercises = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String name = parts[0];
                    int caloriesBurned = Integer.parseInt(parts[1]);
                    String focus = parts[2];
                    String gymRequired = parts[3];
                    exercises.add(new Exercise(name, caloriesBurned, focus, gymRequired));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading exercises file: " + e.getMessage());
        }
        return exercises;
    }

    public static Map<String, List<Exercise>> categorizeExercises(List<Exercise> exercises) {
        Map<String, List<Exercise>> categorizedExercises = new HashMap<>();

        for (Exercise exercise : exercises) {
            String focus = exercise.focus.toUpperCase();
            categorizedExercises.computeIfAbsent(focus, k -> new ArrayList<>()).add(exercise);
            if ("BOTH".equals(focus)) {
                categorizedExercises.computeIfAbsent("CARDIO", k -> new ArrayList<>()).add(exercise);
                categorizedExercises.computeIfAbsent("STRENGTH", k -> new ArrayList<>()).add(exercise);
            }
        }

        return categorizedExercises;
    }
    
     public static int countExercisesInCategory(List<Exercise> exercises) {
        return exercises.size();
    }
     
    public static void displayExercisesNotRequiringGym(List<Exercise> exercises) {
    List<Exercise> exercisesNotRequiringGym = getExercisesNotRequiringGym(exercises);

    if (!exercisesNotRequiringGym.isEmpty()) {
        System.out.println("Exercises that don't require a gym:");
        for (Exercise exercise : exercisesNotRequiringGym) {
            System.out.println(exercise.name + ": " + exercise.caloriesBurned);
        }
    } else {
        System.out.println("All exercises require a gym.");
    }
}

    public static List<Exercise> getExercisesNotRequiringGym(List<Exercise> exercises) {
        List<Exercise> exercisesNotRequiringGym = new ArrayList<>();
        for (Exercise exercise : exercises) {
            if ("No".equalsIgnoreCase(exercise.gymRequired)) {
                exercisesNotRequiringGym.add(exercise);
            }
        }
        return exercisesNotRequiringGym;
    }
    
}
