package org.example.pattern.command;

public class BrightenCommand implements CommandExecutor {

    LightBulb lightBulb;

    public BrightenCommand(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void execute() {
        lightBulb.brighten();
    }
}
