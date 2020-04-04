package org.example.pattern.observer.or.listener


import spock.lang.Specification

class ObserverTest extends Specification {

    void 'test subscription'() {
        given:
        NewsMaker newsContentMaker = new NewsMaker()
        Follower vasea = new NewsFollower(newsContentMaker, "Vasea")
        Follower feghea = new NewsFollower(newsContentMaker, "Feghea")
        Follower irina = new NewsFollower(newsContentMaker, "Irina")

        expect:
        newsContentMaker.register(vasea)
        newsContentMaker.register(feghea)
        newsContentMaker.setState("Corona Virus warning")

        newsContentMaker.register(irina)
        newsContentMaker.setState("Tomorrow will be sunny")

        newsContentMaker.unregister(vasea)
        newsContentMaker.unregister(irina)
        newsContentMaker.setState("President is elected")
    }
}
