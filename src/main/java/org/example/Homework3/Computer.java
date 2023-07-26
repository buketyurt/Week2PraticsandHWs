package org.example.Homework3;

public class Computer {
    private boolean isOpen;
    private GameController controller;

    public void open() {
        if (isOpen) {
            throw new RuntimeException("Computer is already open.");
        }
        System.out.println("Computer is now open.");
        isOpen = true;
    }

    public void shutdown() {
        if (!isOpen) {
            throw new RuntimeException("Computer is already shutdown.");
        }
        System.out.println("Computer is shutting down.");
        isOpen = false;
    }

    public void addController(GameController controller) {
        this.controller = controller;
        System.out.println("Controller added to the computer.");
    }

    public void playGame() {
        if (!isOpen) {
            throw new RuntimeException("Computer is closed. Cannot play the game.");
        }
        System.out.println("Game started!");
    }
}
