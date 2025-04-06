package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;
    String expectedSound = "Мяу";
    List<String> catsFood = List.of("Животные", "Птицы", "Рыба");

    @Mock
    private Feline feline;

    @Before
    public void setUp() {
       cat = new Cat(feline);
    }

    @Test
    public void getSoundTest() {
        assertEquals(expectedSound, cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(catsFood, cat.getFood());
    }


}
