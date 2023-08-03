package com.hillel.calculator;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class ParametrizedValues {
    public static Stream<Arguments> getValuesSub() {
        return Stream.of(
                Arguments.of(5, 3, 2),
                Arguments.of(-2, -2, 0),
                Arguments.of(10, 4, 6)
        );
    }
}
