package com.application;

import java.util.Scanner;

public class App {

    private final Scanner scanner;

    public App(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        int id = 0;
        System.out.println("== Wise Saying Application ==");
        System.out.println("1. post");
        System.out.println("0. terminate");

        while(true) {
            System.out.println("=".repeat(31));
            System.out.printf("Command: ");
            String command = this.scanner.nextLine().trim().toLowerCase();

            if (command.equals("terminate")) {
                System.out.println("Application has been terminated.");
                return;
            } else if (command.equals("post")) {
                System.out.println("=".repeat(31));
                System.out.printf("Content: ");
                String content = this.scanner.nextLine().trim();
                System.out.printf("Author: ");
                String author = this.scanner.nextLine().trim();

                System.out.println("=".repeat(31));
                System.out.printf("#%d wise saying has been posted.\n", ++id);
            } else if (command.equals("help")) {
                System.out.println("=".repeat(31));
                System.out.println("1. post");
                System.out.println("0. terminate");
            } else {
                System.out.println("Please enter the valid command.");
                System.out.println("If you want to know commands, then enter the \"help\".");
            }
        }
    }
}
