package org.example.pattern.decorator.or.wrapper

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
