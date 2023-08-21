package com.mycompany.fitnesstrackerapp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private final String dataFileName = "user_data.txt";

    // Store user data to a file
    public void storeData(List<User> userList) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(dataFileName))) {
            outputStream.writeObject(userList);
            System.out.println("User data has been successfully stored.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error: Unable to store user data.");
        }
    }

    // Retrieve user data from a file
    public List<User> retrieveData() {
        List<User> userList = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(dataFileName))) {
            userList = (List<User>) inputStream.readObject();
            System.out.println("User data has been successfully
