package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LionTest {
    @Mock
    private Feline feline;

    @Test
    void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    void testDoesHaveManeMale() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    void testDoesHaveManeFemale() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    void testGetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expected);
        assertEquals(expected, lion.getFood());
    }

    @Test
    void testInvalidSexException() {
        Exception exception = assertThrows(Exception.class,
                () -> new Lion("Неизвестно", feline));
        assertEquals("Используйте допустимые значения пола животного - самец или самка",
                exception.getMessage());
    }

    @Test
    void testGetFoodException() throws Exception {
        Lion lion = new Lion("Самец", feline);
        when(feline.eatMeat()).thenThrow(new Exception("Ошибка"));
        Exception exception = assertThrows(Exception.class, lion::getFood);
        assertEquals("Ошибка", exception.getMessage());
    }
}