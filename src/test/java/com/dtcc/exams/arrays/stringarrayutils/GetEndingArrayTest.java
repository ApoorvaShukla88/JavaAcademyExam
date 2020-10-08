package com.dtcc.exams.arrays.stringarrayutils;

import com.dtcc.exams.arrays.StringArrayUtils;
import org.junit.Assert;
import org.junit.Test;

public class GetEndingArrayTest {
    @Test
    public void testGetEndingArrayFrom0() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"The", "Quick", "Brown", "Fox", "Jumps"};
        int startIndex = 0;

        // when
        String[] actual = StringArrayUtils.getEndingArray(input, startIndex);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetEndingArrayFrom1() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"Quick", "Brown", "Fox", "Jumps"};
        int startIndex = 1;

        // when
        String[] actual = StringArrayUtils.getEndingArray(input, startIndex);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEndingArrayOutOfBounds1() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {};
        int startIndex = 98;

        // when
        String[] actual = StringArrayUtils.getEndingArray(input, startIndex);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetEndingArrayOutOfBounds2() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {};
        int startIndex = -1;

        // when
        String[] actual = StringArrayUtils.getEndingArray(input, startIndex);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
