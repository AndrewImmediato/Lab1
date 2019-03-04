package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

    private int[][] LatinSquare;

    public LatinSquare() {

    }

    public LatinSquare(int[][] puzzle) {
        super();
        LatinSquare = puzzle;
    }

    public int[][] getLatinSquare() {
        return LatinSquare;
    }

    public void setLatinSquare(int[][] latinSquare) {
        LatinSquare = latinSquare;
    }

    public static boolean hasDuplicates(int[] arr)
    {
        int[] arrCopy = Arrays.copyOf(arr, arr.length); 

        Arrays.sort(arrCopy);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arrCopy[i] == arrCopy[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean doesElementExist(int[] arr, int iValue) {
        boolean doesElementExist = false;
        
        if (arr == null)
            return false;
        
        for (int i : arr) {
            if (i == iValue) {
                doesElementExist = true;
                break;
            }
        }

        return doesElementExist;
    }
    public static boolean hasAllValues (int[] arr1, int[] arr2) {
        boolean hasAllValues = true;
        for (int j = 0; j < arr2.length; j++) {

        boolean bFound = false;

        for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] == arr2[j]) {
        bFound = true;
        break;
        }
        
        }
        if (bFound == false) {
        hasAllValues = false;
        break;
        }
        }
        
        return hasAllValues;
    }
    public int[] getColumn (int iCol) {
        int[] Col = new int[this.LatinSquare.length];
        for (int row = 0; row < this.LatinSquare.length; row++) {
            Col[row] = LatinSquare[row][iCol];
        }
        return Col;
    }
    public int[] getRow (int iRow) {
        return this.LatinSquare [iRow];
    }
    public boolean containsZero() {
        for (int i=0; i< LatinSquare.length; i++) {
            for (int j=0; j<LatinSquare.length; j++) {
                if (LatinSquare[i][j]== 0) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isLatinSquare() {
        for (int i=1;i<=9;i++) { 
            int y[]=this.getColumn(i);
            int x[]=this.getRow(i);
            if (hasDuplicates(x)==true) {
                return false;
            }
        
            if (hasDuplicates(y)==true) {

                return false;
            }
        
            for (int j=1;j<10;j++) {
                System.out.println(j);
                if (doesElementExist(x,j)==false){
                    System.out.println("values x");

                    return false;
                }
                    
                if (doesElementExist(y,j)==false){
                    System.out.println("values y");

                    return false;

                }
                if (hasAllValues(x,y)==false){
                    System.out.println("has all");

                    return false;
                }
            }

        }
        return true;
        //we couldn't figure out why this didn't return true
    }
    
}

