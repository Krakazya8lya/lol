package ru.sibsutis.lab1pleasework;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void max_isCorrect() {
        assertEquals(MainActivity.Max(1,2), 2);
        assertEquals(MainActivity.Max(2,2), 2);
        assertEquals(MainActivity.Max(3,2), 3);
        assertEquals(MainActivity.Max(1,-5), 1);
    }

    @Test
    public void min_isCorrect() {
        assertEquals(MainActivity.Min(1,2), 1);
        assertEquals(MainActivity.Min(2,2), 2);
        assertEquals(MainActivity.Min(3,2), 2);
        assertEquals(MainActivity.Min(1,-5), -5);
    }
}