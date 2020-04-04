package org.example.pattern.command;

public class Invoker {

    CommandExecutor on;
    CommandExecutor off;
    CommandExecutor dim;
    CommandExecutor brighten;

    public Invoker(CommandExecutor on, CommandExecutor off, CommandExecutor dim, CommandExecutor brighten) {
        this.on = on;
        this.off = off;
        this.dim = dim;
        this.brighten = brighten;
    }

    public void turnTheLightsOn(){
        on.execute();
    }

    public void turnTheLightsOff(){
        off.execute();
    }

    public void dimTheLights(){
        dim.execute();
    }

    public void brightenTheLights(){
        brighten.execute();
    }
}
