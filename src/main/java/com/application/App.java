package com.application;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private final Scanner scanner;
    private ArrayList<WiseSaying> wiseSayingList;

    public App(Scanner scanner) {
        this.scanner = scanner;
        this.wiseSayingList = new ArrayList<>();
    }

    public void run() {
        int id = 0;
        System.out.println("== Wise Saying Application ==");
        System.out.println("1. post");
        System.out.println("2. list");
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

                WiseSaying wiseSaying = new WiseSaying(id, author, content);
                this.wiseSayingList.add(wiseSaying);

            } else if (command.equals("list")) {
                System.out.println("=".repeat(31));
                if (this.wiseSayingList.isEmpty()) {
                    System.out.println("There is no list in this application.");
                    continue;
                }
                System.out.println("Id / Author / Content");
                System.out.println("-".repeat(27));

                for (int i = this.wiseSayingList.size() - 1; i >= 0; i--) {
                    WiseSaying wiseSaying = this.wiseSayingList.get(i);
                    System.out.println(wiseSaying.getId() + " / " + wiseSaying.getAuthor() + " / " + wiseSaying.getContent());
                }

            } else if (command.equals("help")) {
                System.out.println("=".repeat(31));
                System.out.println("1. post");
                System.out.println("2. list");
                System.out.println("0. terminate");
            } else {
                System.out.println("Please enter the valid command.");
                System.out.println("If you want to know commands, then enter the \"help\".");
            }
        }
    }
}
