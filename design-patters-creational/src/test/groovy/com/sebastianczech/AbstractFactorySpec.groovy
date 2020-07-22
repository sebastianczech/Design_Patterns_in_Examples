package com.sebastianczech

import spock.lang.Specification

class AbstractFactorySpec extends Specification {

    def "should return number 2"() {
        given:
        def a = new Integer(1)

        when:
        def b = a + 1

        then:
        b == 2
    }

    def "should return greater by one"(int input, int output) {
        given:
        def a = new Integer(1)

        expect:
        output == a + input

        where:
        input | output
        1     | 2
        24    | 25
        36    | 37
    }

}
