package org.example.pattern.command


import spock.lang.Specification

class BulbTest extends Specification {

    void 'test bulb'() {
        given:
        LightBulb bulb = new LightBulb()
        CommandExecutor on = new TurnOnCommand(bulb)
        CommandExecutor off = new TurnOffCommand(bulb)
        CommandExecutor dim = new DimCommand(bulb)
        CommandExecutor brighten = new BrightenCommand(bulb)
        Invoker lightInvoker = new Invoker(on, off, dim, brighten)
        expect:
        lightInvoker.turnTheLightsOn()
        lightInvoker.dimTheLights()
        lightInvoker.brightenTheLights()
        lightInvoker.turnTheLightsOff()
    }
}
