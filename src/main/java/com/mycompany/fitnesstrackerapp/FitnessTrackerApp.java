/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.fitnesstrackerapp;

import java.util.Scanner;

/**
 *
 * @author paarth
 */
public class FitnessTrackerApp {
Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UserProfile userProfile = new UserProfile(); // Create an instance of UserProfile
        userProfile.collectAndSaveUserInput();
       
        
    }
    
}
