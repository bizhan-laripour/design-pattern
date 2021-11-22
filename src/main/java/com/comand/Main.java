package com.comand;

public class Main {
    public static void main(String[] args) {

        Light light = new Light();// receiver
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor); //
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(garageDoorCloseCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();
    }
}
