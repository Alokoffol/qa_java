package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@org.junit.jupiter.api.extension.ExtendWith(MockitoExtension.class)
class LionParameterizedTest {

    @Mock
    private Feline feline;

    @ParameterizedTest
    @ValueSource(strings = {"", "Неизвестно", "123", "Male"})
    void testDoesHaveManeThrowsExceptionForInvalidSex(String invalidSex) {
        Exception exception = assertThrows(Exception.class,
                () -> new Lion(invalidSex, feline));

        assertEquals("Используйте допустимые значения пола животного - самец или самка",
                exception.getMessage());
    }
}