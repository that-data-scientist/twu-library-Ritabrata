package com.twu.biblioteca.View;


import java.util.List;

public class MenuView {
    InputOutputHandler inputOutputHandler;

    public MenuView(InputOutputHandler inputOutputHandler){
        this.inputOutputHandler = inputOutputHandler;
    }


    public int displayMenuOptions(List<String> options) {
        for(String option : options)
        inputOutputHandler.writeMessage(option);

        try{
            return inputOutputHandler.input("Enter your choice");
        } catch (Exception e) {
            return 0;
        }
    }

    public void displayMessage(String message) {
        inputOutputHandler.writeMessage(message);
    }
}
