package com.comand;

public class RemoteControl {

    private Command command;

    public RemoteControl(){

    }

    public void pressButton(){
        this.command.execute();
    }

    public void setCommand(Command command){
        this.command = command;
    }
}
