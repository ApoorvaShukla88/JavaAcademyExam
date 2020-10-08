package com.dtcc.exams.arrays.integerarrayutils;

import com.dtcc.exams.arrays.IntegerArrayUtils;
import org.junit.Assert;
import org.junit.Test;

public class AddTest {
    @Test
    public void testAdd1() {
        // given
        Integer valueToBeAdded = 10;
        Integer[] intArray = {1, 3, 2, 5, 4, 7, 6};
        Integer[] expected = {1, 3, 2, 5, 4, 7, 6, valueToBeAdded};

        // when
        Integer[] actual = IntegerArrayUtils.add(intArray, valueToBeAdded);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd2() {
        // given
        Integer firstValueToBeAdded = 10;
        Integer secondValueToBeAdded = 17;
        Integer[] intArray = {1, 3, 2, 5, 4, 7, 6};
        Integer[] expected = {1, 3, 2, 5, 4, 7, 6, firstValueToBeAdded, secondValueToBeAdded};

        // when
        Integer[] actual = IntegerArrayUtils.add(intArray, firstValueToBeAdded);
        actual = IntegerArrayUtils.add(actual, secondValueToBeAdded);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}