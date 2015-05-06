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
            underTest.convertInt(i) == b
        where:
            i << [0, 1, 2, 3, 4, 5, 6, 7, 8]
            b << ["0", "1", "10", "11", "100", "101", "110", "111", "1000"]
    }
}
