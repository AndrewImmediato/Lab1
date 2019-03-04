package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

    @Test
    public void hasDuplicates_test1() {

        int[] arr = { 1, 2, 3, 4, 5 };
        boolean bExpected = false;
        boolean bActual = LatinSquare.hasDuplicates(arr);
        assertEquals(bExpected, bActual);

    }

    @Test
    public void hasDuplicates_test2() {

        int[] arr = { 1, 1, 3, 4, 5 };
        boolean bExpected = true;
        boolean bActual = LatinSquare.hasDuplicates(arr);
        assertEquals(bExpected, bActual);

    }


    
    @Test
    public void doesElementExist_Test1() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int iValue = 3;

        boolean bExpected = true;
        boolean bActual = LatinSquare.doesElementExist(arr, iValue);
                
        assertEquals(bExpected, bActual);
    }
        
    @Test
    public void doesElementExist_Test2() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int iValue = 8;
        boolean bExpected = false;
        boolean bActual = LatinSquare.doesElementExist(arr, iValue);
                
        assertEquals(bExpected, bActual);
    }

    @Test
    public void doesElementExist_Test3() {

        int[] arr = null;
        int iValue = 1;
        boolean bExpected = false;
        boolean bActual = LatinSquare.doesElementExist(arr, iValue);
                
        assertEquals(bExpected, bActual);

    }
    
    @Test
    public void hasAllValues1() {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {2,3,4,5,7,6,8,1,9};
        
        boolean bExpected = true;
        boolean bActual = LatinSquare.hasAllValues(arr1, arr2);
        assertEquals(bExpected, bActual);
    }
    
    @Test
    public void hasAllValues2() {
        int[] arr1 = {1,1,3,4,5,6,7,8,9};
        int[] arr2 = {2,3,4,5,7,6,8,1,9};
        
        boolean bExpected = false;
        boolean bActual = LatinSquare.hasAllValues(arr1, arr2);
        assertEquals(bExpected, bActual);
    }
    @Test
    public void getRow() {
        int[][] arr1 = new int [][]{
            {1,2,3,4,5,6,7,8,9},
            {2,3,4,5,6,7,8,9,1},
            {3,4,5,6,7,8,9,1,2},
            {4,5,6,7,8,9,1,2,3},
            {5,6,7,8,9,1,2,3,4},
            {6,7,8,9,1,2,3,4,5},
            {7,8,9,1,2,3,4,5,6},
            {8,9,1,2,3,4,5,6,7},
            {9,1,2,3,4,5,6,7,8}
        };
        LatinSquare rowTest = new LatinSquare(arr1);
        int[] bExpected = {3,4,5,6,7,8,9,1,2};
        int[] bActual = rowTest.getRow(3);
    }
    @Test
    public void getColumn() {
        int[][] arr1 = new int [][]{
            {1,2,3,4,5,6,7,8,9},
            {2,3,4,5,6,7,8,9,1},
            {3,4,5,6,7,8,9,1,2},
            {4,5,6,7,8,9,1,2,3},
            {5,6,7,8,9,1,2,3,4},
            {6,7,8,9,1,2,3,4,5},
            {7,8,9,1,2,3,4,5,6},
            {8,9,1,2,3,4,5,6,7},
            {9,1,2,3,4,5,6,7,8}
        };
        LatinSquare colTest = new LatinSquare(arr1);
        int[] bExpected = {1,2,3,4,5,6,7,8,9};
        int[] bActual = colTest.getColumn(0);
    }
    @Test
    public void isLatinSquare1() {
        int[][] arr1 = new int [][]{
         {1,2,3,4,5,6,7,8,9},
         {1,3,2,4,5,6,7,8,9},
         {1,2,3,4,5,6,7,8,9},
         {1,3,2,4,5,6,7,8,9},    
         {1,2,3,4,5,6,7,8,9},
         {1,3,2,4,5,6,7,8,9},
         {1,2,3,4,5,6,7,8,9},
         {1,3,2,4,5,6,7,8,9},
         {1,2,3,4,5,6,7,8,9},
         {1,3,2,4,5,6,7,8,9}
        };
        LatinSquare test1= new LatinSquare(arr1);
        boolean bExpected = false;
        boolean bActual = test1.isLatinSquare();
        assertEquals(bExpected, bActual);
    }
    @Test
    public void isLatinSquare2() {
        int[][] arr2 = new int [][]{
            {1,2,3,4,5,6,7,8,9},
            {2,3,4,5,6,7,8,9,1},
            {3,4,5,6,7,8,9,1,2},
            {4,5,6,7,8,9,1,2,3},
            {5,6,7,8,9,1,2,3,4},
            {6,7,8,9,1,2,3,4,5},
            {7,8,9,1,2,3,4,5,6},
            {8,9,1,2,3,4,5,6,7},
            {9,1,2,3,4,5,6,7,8}
        };
        LatinSquare test2= new LatinSquare(arr2);
        boolean bExpected = true;
        boolean bActual = test2.isLatinSquare();
        assertEquals(bExpected, bActual);
        //we couldn't figure out why latin square didn't return true

    }
    
}

