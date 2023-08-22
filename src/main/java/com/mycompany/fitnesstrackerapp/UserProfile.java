package com.mycompany.fitnesstrackerapp;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserProfile {
   
    private static ArrayList < User > users = new ArrayList < > ();
    private static final String FILE_PATH = "userInfo";
    Scanner scanner = new Scanner(System.in);
    
    public void collectAndSaveUserInput() {
        System.out.println("Thank you for deciding to use our Fitness Tracker App. Let's get your account created.");

        String username = collectValidUsername();
        String password = collectValidPassword();
        String name = collectValidName();
        int age = collectValidAge();
        boolean isMale = collectValidSex();
        float heightFeet = collectValidHeightFeet();
        float heightInches = collectValidHeightInches();
        float weightPounds = collectValidWeight();
        int activityLevelChoice = collectValidActivityLevel();

        // Create a User object and add it to the list of users
        User newUser = new User(username, password, isMale, heightFeet * 12 + heightInches, weightPounds, activityLevelChoice, name);
        users.add(newUser);

        // After creating the User object and adding it to the list, call the saveUserData method
        saveUserData();
        System.out.println("User account created successfully.");
        
    }
    
    private String collectValidUsername() {
        String username;
        do {
            System.out.print("Enter your username (8 to 20 characters): ");
            username = scanner.nextLine();
            if (username.length() < 8 || username.length() > 20) {
                System.out.println("Username must be between 8 and 20 characters.");
            }
        } while (username.length() < 8 || username.length() > 20);
        return username;
    }

    private String collectValidPassword() {
        String password;
        do {
            System.out.print("Enter your password (at least 8 characters): ");
            password = scanner.nextLine();
            if (password.length() < 8) {
                System.out.println("Password must be at least 8 characters long.");
            }
        } while (password.length() < 8);
        return password;
    }

    private String collectValidName() {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    private int collectValidAge() {
        int age;
        do {
            System.out.print("Enter your age (16 to 80 years): ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age < 16 || age > 80) {
                    System.out.println("Age must be between 16 and 80 years.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid age input. Please enter a valid number.");
                age = -1; // Set age to an invalid value to loop again
            }
        } while (age < 16 || age > 80);
        return age;
    }

    private boolean collectValidSex() {
        boolean isMale;
        do {
            System.out.print("Enter your sex (1 for Male, 2 for Female): ");
            int sexChoice;
            try {
                sexChoice = Integer.parseInt(scanner.nextLine());
                if (sexChoice == 1) {
                    isMale = true;
                } else if (sexChoice == 2) {
                    isMale = false;
                } else {
                    System.out.println("Invalid sex choice. Please enter 1 for Male or 2 for Female.");
                    isMale = false; // Reset isMale to false in case of invalid input
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter 1 for Male or 2 for Female.");
                isMale = false; // Reset isMale to false in case of invalid input
            }
        } while (!isMale);
        return isMale;
    }

    private float collectValidHeightFeet() {
        float heightFeet;
        do {
            System.out.print("Enter your height (Feet, maximum 8): ");
            try {
                heightFeet = Float.parseFloat(scanner.nextLine());
                if (heightFeet < 0 || heightFeet > 8) {
                    System.out.println("Invalid height. Please enter a value between 0 and 8 feet.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                heightFeet = -1; // Set heightFeet to an invalid value to loop again
            }
        } while (heightFeet < 0 || heightFeet > 8);
        return heightFeet;
    }

    private float collectValidHeightInches() {
        float heightInches;
        do {
            System.out.print("Enter your height (Inches, maximum 11): ");
            try {
                heightInches = Float.parseFloat(scanner.nextLine());
                if (heightInches < 0 || heightInches >= 12) {
                    System.out.println("Invalid height. Please enter a value between 0 and 11 inches.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                heightInches = -1; // Set heightInches to an invalid value to loop again
            }
        } while (heightInches < 0 || heightInches >= 12);
        return heightInches;
    }

    private float collectValidWeight() {
        float weightPounds;
        do {
            System.out.print("Enter your weight (Pounds): ");
            try {
                weightPounds = Float.parseFloat(scanner.nextLine());
                if (weightPounds < 0) {
                    System.out.println("Invalid weight. Please enter a non-negative value.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                weightPounds = -1; // Set weightPounds to an invalid value to loop again
            }
        } while (weightPounds < 0);
        return weightPounds;
    }

    private int collectValidActivityLevel() {
        int activityLevelChoice;
        do {
            System.out.print("Enter your current activity level (1 to 5):\n" +
                    "1. Sedentary\n" +
                    "2. Lightly active\n" +
                    "3. Moderately active\n" +
                    "4. Very active\n" +
                    "5. Extra active\n" +
                    "Select an option: ");
            try {
                activityLevelChoice = Integer.parseInt(scanner.nextLine());
                if (activityLevelChoice < 1 || activityLevelChoice > 5) {
                    System.out.println("Invalid activity level choice. Please select a number between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                activityLevelChoice = -1; // Set activityLevelChoice to an invalid value to loop again
            }
        } while (activityLevelChoice < 1 || activityLevelChoice > 5);
        return activityLevelChoice;
    }

     
    private void saveUserData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (User user : users) {
                // Write each user's information to the file
                writer.write(user.getUsername() + "," +
                             user.getPassword() + "," +
                             user.getIsMale() + "," +
                             user.getHeight() + "," +
                             user.getWeightPounds() + "," +
                             user.getActivityLevelChoice() + "," +
                             user.getName());
                writer.newLine();
            }
            System.out.println("User data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error while saving user data: " + e.getMessage());
        }
    }
    
    public boolean login(String username, String password) {
        // Read user data from the file and store it in memory
        ArrayList<User> storedUsers = readUserDataFromFile();

        // Search for a user with the provided username and password
        for (User user : storedUsers) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                // Found a matching user
                return true;
            }
        }

        // No matching user found
        System.out.println("Account does not exist.");
        return false;
    }
    
    private ArrayList<User> readUserDataFromFile() {
        ArrayList<User> storedUsers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Parse each line to create User objects and add them to the list
                String[] userData = line.split(",");
                if (userData.length == 7) {
                    String storedUsername = userData[0];
                    String storedPassword = userData[1];
                    boolean storedIsMale = Boolean.parseBoolean(userData[2]);
                    double storedHeight = Double.parseDouble(userData[3]);
                    float storedWeightPounds = Float.parseFloat(userData[4]);
                    int storedActivityLevelChoice = Integer.parseInt(userData[5]);
                    String storedName = userData[6];

                    User storedUser = new User(storedUsername, storedPassword, storedIsMale, storedHeight, storedWeightPounds, storedActivityLevelChoice, storedName);
                    storedUsers.add(storedUser);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading user data from file.");
        }

        return storedUsers;
    }
}
