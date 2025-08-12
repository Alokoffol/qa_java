package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CatTest {
    @Mock
    private Feline feline;
    private Cat cat;

    @BeforeEach
    void setUp() {
        cat = new Cat(feline);
    }

    @Test
    void testGetSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void testGetFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expected);
        assertEquals(expected, cat.getFood());
    }

    @Test
    void testGetFoodException() throws Exception {
        when(feline.eatMeat()).thenThrow(new Exception("Ошибка"));
        Exception exception = assertThrows(Exception.class, () -> cat.getFood());
        assertEquals("Ошибка", exception.getMessage());
    }
}