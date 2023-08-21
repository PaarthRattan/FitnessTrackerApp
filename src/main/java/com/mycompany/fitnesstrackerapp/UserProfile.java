package com.mycompany.fitnesstrackerapp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserProfile {
    private File userInfo;

    public UserProfile(String username) {
        // Construct the user profile file based on the username
        this.userInfo = new File(username + "_profile.txt");
    }

    // Set user age in the profile
    public void setAge(int age) {
        try {
            FileWriter writer = new FileWriter(userInfo, true);
            writer.write("Age: " + age + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Set user name in the profile
    public void setName(String name) {
        try {
            FileWriter writer = new FileWriter(userInfo, true);
            writer.write("Name: " + name + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Set user weight in the profile
    public void setWeight(double weight) {
        try {
            FileWriter writer = new FileWriter(userInfo, true);
            writer.write("Weight: " + weight + " pounds\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Set user height in the profile
    public void setHeight(double height) {
        try {
            FileWriter writer = new FileWriter(userInfo, true);
            writer.write("Height: " + height + " inches\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Set user exercise level in the profile
    public void setExerciseLevel(String exerciseLevel) {
        try {
            FileWriter writer = new FileWriter(userInfo, true);
            writer.write("Exercise Level: " + exerciseLevel + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
