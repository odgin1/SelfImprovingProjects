package org.example.pattern.command;

public class TurnOnCommand implements CommandExecutor {

    LightBulb lightBulb;

    public TurnOnCommand(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void execute() {
        lightBulb.on();
    }
}
