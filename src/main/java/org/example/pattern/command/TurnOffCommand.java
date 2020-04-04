package org.example.pattern.command;

public class TurnOffCommand implements CommandExecutor {

    LightBulb lightBulb;

    public TurnOffCommand(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void execute() {
        lightBulb.off();
    }
}
