package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    private final Feline feline = new Feline();
    List<String> felineFood = List.of("Животные", "Птицы", "Рыба");
    String felineFamily = "Кошачьи";
    int kittensNum = 1;

    @Test
    public void eatMeatTest() throws Exception {
        assertEquals(felineFood, feline.eatMeat());
    }

    @Test
    public void getFamileTest() {
        assertEquals(felineFamily, feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        assertEquals(kittensNum, feline.getKittens());
    }

}
