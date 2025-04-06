package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String gender;
    private final boolean hasMane;

    public LionParametrizedTest(String gender, boolean hasMane) {
        this.gender = gender;
        this.hasMane = hasMane;
    }

    @Parameters
    public static Object [][] getLionInfo() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(gender, feline);
        assertEquals(hasMane, lion.doesHaveMane());
    }

}
