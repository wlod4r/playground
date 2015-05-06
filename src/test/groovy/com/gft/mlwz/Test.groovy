package com.gft.mlwz;

import spock.lang.Specification

class Test extends Specification {

    def "test"() {
        when:
            App app = new App()
        then:
            app.getMessage() == "Hello World!"
    }
}