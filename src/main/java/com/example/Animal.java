package com.example;

import java.util.List;

public class Animal {

    public List<String> getFood(String animalKind) throws Exception {
        if ("Травоядное".equalsIgnoreCase(animalKind)) {
            return List.of("Трава", "Различные растения");
        } else if ("Хищник".equalsIgnoreCase(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба");
        } else {
            throw new Exception("Некорректный вид животного, используйте значение Хищник или Травоядное");
        }
    }

    public String getFamily() {
        return "\u0421\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442 \u043D\u0435\u0441\u043A\u043E\u043B\u043A\u043E \u0441\u0435\u043C\u0435\u0439\u0441\u0442\u0432: \u0437\u0430\u044F\u0447\u044C\u0438, \u0431\u0435\u043B\u0438\u0447\u044C\u0438, \u043C\u044B\u0448\u0438\u043D\u044B\u0435, \u043A\u043E\u0448\u0430\u0447\u044C\u0438, \u043F\u0441\u043E\u0432\u044B\u0435, \u043C\u0435\u0434\u0432\u0435\u0436\u044C\u0438, \u043A\u0443\u043D\u044C\u0438";
    }
}