package com.mycompany.fitnesstrackerapp;

import java.io.*;
import java.util.ArrayList;

/**
 * The UserProfile class manages user profiles, including account creation,
 * login, and data storage. It follows the Singleton pattern to ensure a
 * single instance throughout the application.
 */
public class UserProfile {

    private static UserProfile instance = null; // Singleton instance
    private static ArrayList < User > users = new ArrayList < > ();
    private static final String FILE_PATH = "userInfo"; // File path for storing user data

    // Private constructor to prevent external instantiation
    // Initialize users and other members here...
    // You can load existing user data from the file if needed
    private UserProfile() {
        // You can perform initialization tasks here if needed.
        // For example, you might load existing user data from the file.
    }

    // Singleton pattern: get an instance of the UserProfile class
    public static UserProfile getInstance() {
        if (instance == null) {
            instance = new UserProfile();
        }
        return instance;
    }

    // Check if a username is already taken by an existing user
    public boolean isUsernameTaken(String username) {
        for (User user: users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    // Create a new user account
    public boolean createAccount(String username, String password, String sex, double height, float weightPounds, int age, String name) {
        // Check if a user with the same username already exists
        if (isUsernameTaken(username)) {
            return false; // Username is already taken
        }

        User newUser = new User(username, password, sex, height, weightPounds, age, name);
        users.add(newUser);
        return saveUserData(); // Save the updated user data to the file
    }

    // Save user data to the file
    private boolean saveUserData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (User user: users) {
                // Write user data in CSV format to the file
                writer.write(user.getUsername() + "," +
                    user.getPassword() + "," +
                    user.getSex() + "," +
                    user.getHeight() + "," +
                    user.getWeightPounds() + "," +
                    user.getAge() + "," +
                    user.getName());
                writer.newLine();
            }
            return true;
        } catch (IOException e) {
            System.err.println("Error while saving user data: " + e.getMessage());
            return false;
        }
    }

    // Perform user login
    public boolean login(String username, String password) {
        ArrayList < User > storedUsers = readUserDataFromFile();
        for (User user: storedUsers) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true; // Login successful
            }
        }
        return false; // Login failed
    }

    // Read user data from the file
    private ArrayList < User > readUserDataFromFile() {
        ArrayList < User > storedUsers = new ArrayList < > ();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length == 7) {
                    String storedUsername = userData[0];
                    String storedPassword = userData[1];
                    String storedSex = userData[2];
                    double storedHeight = Double.parseDouble(userData[3]);
                    float storedWeightPounds = Float.parseFloat(userData[4]);
                    int storedAge = Integer.parseInt(userData[5]);
                    String storedName = userData[6];
                    User storedUser = new User(storedUsername, storedPassword, storedSex, storedHeight, storedWeightPounds, storedAge, storedName);
                    storedUsers.add(storedUser);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading user data from file.");
        }
        return storedUsers;
    }
}
