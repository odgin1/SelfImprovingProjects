package org.example.pattern.strategy

import spock.lang.Specification

class DuckClientTest extends Specification {

    void 'test duck client'() {
        given:
        EatingStrategy eatingFastStrategy = new EatingFastStrategy()
        EatingStrategy eatingSlowStrategy = new EatingSlowStrategy()
        QuackingStrategy englishQuacking = new EnglishQuackStrategy()
        QuackingStrategy romanianQuacking = new RomanianQuackStrategy()

        DuckClient duckClient1 = new DuckClient("John", "2", eatingFastStrategy, englishQuacking)
        DuckClient duckClient2 = new DuckClient("Ion", "2", eatingSlowStrategy, romanianQuacking)
        expect:
        duckClient1.toString().contains('John')
        duckClient1.eat()
        duckClient1.quack()

        duckClient2.toString().contains('Ion')
        duckClient2.eat()
        duckClient2.quack()
    }
}
