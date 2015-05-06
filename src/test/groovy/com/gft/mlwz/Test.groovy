package com.gft.mlwz

import spock.lang.Shared;
import spock.lang.Specification

class Test extends Specification {

    @Shared
    private App app

    def setupSpec() {
        app = new App()
    }

    def "test"() {
        expect:
            app.getMessage() == "Hello World!"
    }

    def "test 2"() {
        expect:
            1 == 1
    }
}