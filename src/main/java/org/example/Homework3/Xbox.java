package org.example.Homework3;

public class Xbox {
    private boolean isOpen;
    private GameController controller;
    public void open() {
        if (isOpen) {
            throw new RuntimeException("XBOX is already open.");
        }
        System.out.println("XBOX is now open.");
        isOpen = true;
    }

    public void shutdown() {
        if (!isOpen) {
            throw new RuntimeException("XBOX is already shutdown.");
        }
        System.out.println("XBOX is shutting down.");
        isOpen = false;
    }
    public void addController(GameController controller) {
        this.controller = controller;
        System.out.println("Controller added to the XBOX.");
    }

    public void playGame() {
        if (!isOpen) {
            throw new RuntimeException("XBOX is closed. Cannot play the game.");
        }
        System.out.println("Game started!");
    }
}
