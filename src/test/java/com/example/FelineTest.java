package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.charset.StandardCharsets;

class FelineTest {

    @Test
    void testGetFamily() {
        Feline feline = new Feline();
        String expected = new String("Кошачьи".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
        assertEquals(expected, feline.getFamily());
    }

    @Test
    void testGetKittensDefault() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    void testGetKittensWithCount() {
        Feline feline = new Feline();
        assertEquals(3, feline.getKittens(3));
    }

    @Test
    void testGetFood() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.getFood("Хищник");
        assertEquals(expectedFood, actualFood);
    }
}