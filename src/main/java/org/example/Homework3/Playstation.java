package org.example.Homework3;

public class Playstation {
    private boolean isOpen;
    private GameController controller;

    public void open() {
        if (isOpen) {
            throw new RuntimeException("Playstation is already open.");
        }
        System.out.println("Playstation is now open.");
        isOpen = true;
    }

    public void shutdown() {
        if (!isOpen) {
            throw new RuntimeException("Playstation is already shutdown.");
        }
        System.out.println("Playstation is shutting down.");
        isOpen = false;
    }

    public void addController(GameController controller) {
        this.controller = controller;
        System.out.println("Controller added to the Playstation.");
    }

    public void playGame() {
        if (!isOpen) {
            throw new RuntimeException("Playstation is closed. Cannot play the game.");
        }
        System.out.println("Game started!");
    }
}
