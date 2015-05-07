package com.gft.mlwz.util

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class BinaryConverterTest extends Specification {

    @Shared
    private BinaryConverter underTest

    def setupSpec() {
        underTest = new BinaryConverter()
    }

    @Unroll
    def "should convert #i to binary value #b"() {
        expect:
            underTest.convertInt(i) == b
        where:
            i << [0, 1, 2, 3, 4, 5, 6, 7, 8]
            b << ["0", "1", "10", "11", "100", "101", "110", "111", "1000"]
    }

    @Unroll
    def "should convert int #i to binary value #b second approach"() {
        expect:
            underTest.convertInt(i) == b
        where:
            i | b
            0 | "0"
            1 | "1"
            2 | "10"
            3 | "11"
            4 | "100"
            5 | "101"
            6 | "110"
            7 | "111"
            8 | "1000"
    }

    def "should convert single int value to binary representation"() {
        expect:
            underTest.convertInt(16) == "10000"
    }
}
