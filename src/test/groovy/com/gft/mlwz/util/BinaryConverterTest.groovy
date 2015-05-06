package com.gft.mlwz.util

import spock.lang.Shared
import spock.lang.Specification

class BinaryConverterTest extends Specification {

    @Shared
    private BinaryConverter underTest

    def setupSpec() {
        underTest = new BinaryConverter()
    }

    def "should convert int to binary value"() {
        expect:
            underTest.convertInt(0) == "0"
            underTest.convertInt(1) == "1"
            underTest.convertInt(2) == "10"
            underTest.convertInt(3) == "11"
            underTest.convertInt(4) == "100"
            underTest.convertInt(5) == "101"
            underTest.convertInt(6) == "110"
            underTest.convertInt(7) == "111"
            underTest.convertInt(8) == "1000"
    }
}
