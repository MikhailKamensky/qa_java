package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParametrizedTest {
    private final int kittensNum;
    private final  int result;

    public FelineParametrizedTest(int kittensNum, int result) {
        this.kittensNum = kittensNum;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object [][] checkKittensNum() {
        return new Object[][] {
                {1, 1},
                {3, 3},
        };
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        assertEquals(result, feline.getKittens(kittensNum));
    }

}
