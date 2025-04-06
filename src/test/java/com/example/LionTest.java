package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    String lionAnimalKind = "Хищник";
    String lionSex = "Самец";
    String lionIncorrectSex = "Самкец";
    List<String> lionsFood = List.of("Животные", "Птицы", "Рыба");
    int lionKittensNum = 1;

    @Mock
    Feline feline;

    @Test
    public void getFoodTest() throws Exception { //метод должен быть именно таким, как в классе
        Lion lion = new Lion(lionSex, feline);
        Mockito.when(feline.getFood(lionAnimalKind)).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        assertEquals(lionsFood, actual);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(lionSex, feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(lionSex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(lionKittensNum, lion.getKittens());
    }

    @Test(expected = Exception.class)
    public void LionCreateExceptionTest() throws Exception {
        Lion lion = new Lion(lionIncorrectSex, feline);
    }



}
