package com.example;

import java.util.List;
import java.nio.charset.StandardCharsets;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    public String getFamily() {
        return new String("Кошачьи".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }
}