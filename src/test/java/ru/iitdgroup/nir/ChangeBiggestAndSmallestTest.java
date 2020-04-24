package ru.iitdgroup.nir;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChangeBiggestAndSmallestTest {

    @Test
    public void testGetMaxBigValues() {
        int[] testData2 = {1146,9999,55};
        assertEquals(ChangeBiggestAndSmallest.indexOfMax(testData2), 1);
    }

    @Test
    public void testGetMax() {
        int[] testData1 = {2,48,3,1,-5};
        assertEquals(ChangeBiggestAndSmallest.indexOfMax(testData1), 1);
    }

    @Test
    public void testGetMin() {
        int[] testData1 = {2,48,3,1,-5};
        assertEquals(ChangeBiggestAndSmallest.indexOfMin(testData1), 4);
    }


    }


