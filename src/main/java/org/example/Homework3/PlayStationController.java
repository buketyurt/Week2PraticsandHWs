package org.example.Homework3;

public class PlayStationController implements GameController{
    @Override
    public void pressButton(String button) {
        System.out.println("Playstation Controller: " + button + " button pressed.");
    }
}
