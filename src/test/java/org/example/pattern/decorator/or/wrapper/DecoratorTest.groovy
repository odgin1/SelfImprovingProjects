package org.example.pattern.decorator.or.wrapper

import org.example.pattern.observer.Follower
import org.example.pattern.observer.NewsFollower
import org.example.pattern.observer.NewsMaker
import spock.lang.Specification

class DecoratorTest extends Specification {

    void 'test decoration'() {
        given:
        def message = 'Hello people!!!'
        Notification facebookAndGoogleNotification = new FacebookNotificationWrapper(new GoogleNotificationWrapper(new BaseNotification()))
        Notification emailNotification = new EmailNotificationWrapper(new BaseNotification())
        expect:
        facebookAndGoogleNotification.sendMessage(message)
        emailNotification.sendMessage(message)
    }
}
