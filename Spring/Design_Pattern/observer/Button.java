package com.company.design.observer;

public class Button {
    private String name;
    private IButtinListener buttonListener;

    public Button(String name){
        this.name= name;
    }

    public void click(String message){
        buttonListener.clickEvent(message);
    }

    public void addListener(IButtinListener buttonListener){
        this.buttonListener= buttonListener;
    }
}
