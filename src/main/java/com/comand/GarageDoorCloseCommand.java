package com.comand;

public class GarageDoorCloseCommand implements Command{

    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }
}
