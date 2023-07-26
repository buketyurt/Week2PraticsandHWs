package org.example.Homework3;

public class XBOXController implements GameController{
    @Override
    public void pressButton(String button) {
        System.out.println("XBOX Controller: " + button + " button pressed.");
    }
}
