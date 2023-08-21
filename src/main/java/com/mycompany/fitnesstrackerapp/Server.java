    package com.mycompany.fitnesstrackerapp;

    import java.util.ArrayList;
    import java.util.InputMismatchException;
    import java.util.List;
    import java.util.Scanner;

    public class Server {
        private ArrayList<User> userList;

        public Server() {
            this.userList = new ArrayList<>();
        }

    // Method to collect user details interactively
    public User collectUserDetails() {
        Scanner scanner = new Scanner(System.in);

        User user = new User(); // Create a new user instance

        try {
            System.out.print("Enter your username: ");
            user.setUsername(scanner.nextLine());

            System.out.print("Enter your password: ");
            user.setPassword(scanner.nextLine());

            int age;
            do {
                System.out.print("Enter your age (years, between 16 and 80): ");
                age = scanner.nextInt();
                if (age < 16 || age > 80) {
                    System.out.println("Invalid age. Please enter an age between 16 and 80.");
                }
            } while (age < 16 || age > 80);

            user.setAge(age);

            scanner.nextLine(); // Consume the newline character

            do {
                System.out.print("Enter your sex (1 for Male, 2 for Female): ");
                int sexChoice = scanner.nextInt();
                if (sexChoice == 1) {
                    user.setMale(true);
                } else if (sexChoice == 2) {
                    user.setMale(false);
                } else {
                    System.out.println("Invalid sex choice. Please enter 1 for Male or 2 for Female.");
                }
            } while (!user.isMale() && user.isMale());

            do {
                System.out.print("Enter your height (Feet, maximum 8): ");
                user.setHeightFeet(scanner.nextFloat());
                if (user.getHeightFeet() < 0 || user.getHeightFeet() > 8) {
                    System.out.println("Invalid height. Please enter a value between 0 and 8 feet.");
                }
            } while (user.getHeightFeet() < 0 || user.getHeightFeet() > 8);

            do {
                System.out.print("Enter your height (Inches, maximum 11): ");
                user.setHeightInches(scanner.nextFloat());
                if (user.getHeightInches() < 0 || user.getHeightInches() >= 12) {
                    System.out.println("Invalid height. Please enter a value between 0 and 11 inches.");
                }
            } while (user.getHeightInches() < 0 || user.getHeightInches() >= 12);

            System.out.print("Enter your weight (Pounds): ");
            user.setWeightPounds(scanner.nextFloat());

            do {
                System.out.print("Enter your current activity level (1 to 5):\n" +
                        "1. Sedentary\n" +
                        "2. Lightly active\n" +
                        "3. Moderately active\n" +
                        "4. Very active\n" +
                        "5. Extra active\n" +
                        "Select an option: ");
                user.setActivityLevelChoice(scanner.nextInt());
                if (user.getActivityLevelChoice() < 1 || user.getActivityLevelChoice() > 5) {
                    System.out.println("Invalid activity level choice. Please select a number between 1 and 5.");
                }
            } while (user.getActivityLevelChoice() < 1 || user.getActivityLevelChoice() > 5);

            do {
                System.out.print("Enter your weight goal (1 for Maintain, 2 for Lose, 3 for Gain): ");
                user.setWeightGoal(scanner.nextInt());
                if (user.getWeightGoal() < 1 || user.getWeightGoal() > 3) {
                    System.out.println("Invalid weight goal choice. Please select 1, 2, or 3.");
                }
            } while (user.getWeightGoal() < 1 || user.getWeightGoal() > 3);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numerical values.");
        } finally {
            scanner.close();
        }

        return user;
    }


        // Enter registration details
        public User enterRegistrationDetails() {
            User newUser = collectUserDetails();
            userList.add(newUser);
            return newUser;
        }

        // Store user data to the database
        public void storeUserData() {
            Database database = new Database();
            database.storeData(userList);
        }

        // Method to complete the registration process
        public void completeRegistration(User user) {
            // Additional logic to complete registration if needed
            System.out.println("Registration complete.");
        }
    }