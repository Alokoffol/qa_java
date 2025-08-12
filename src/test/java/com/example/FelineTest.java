package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FelineTest {
    private final Feline feline = new Feline();

    @Test
    void testEatMeat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    void testGetFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void testGetKittensDefault() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    void testGetKittensWithCount() {
        assertEquals(3, feline.getKittens(3));
    }

    @Test
    void testGetFoodException() {
        Exception exception = assertThrows(Exception.class,
                () -> feline.getFood("Неизвестный вид"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                exception.getMessage());
    }
}