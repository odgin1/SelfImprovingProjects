package org.example.pattern.command;

public class DimCommand implements CommandExecutor {

    LightBulb lightBulb;

    public DimCommand(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void execute() {
        lightBulb.dim();
    }
}
