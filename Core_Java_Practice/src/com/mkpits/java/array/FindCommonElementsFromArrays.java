package src.com.mkpits.java.array;
//Java Program to example of find common elements from arrays.

import java.util.ArrayList;
public class FindCommonElementsFromArrays {
    public static void main(String[] args) {
            ArrayList objArray = new ArrayList();
            ArrayList objArray2 = new ArrayList();
            objArray2.add(0,"common1");
            objArray2.add(1,"common2");
            objArray2.add(2,"notcommon");
            objArray2.add(3,"notcommon1");
            objArray.add(0,"common1");
            objArray.add(1,"common2");
            objArray.add(2,"notcommon2");
            System.out.println("Array elements of array1"+objArray);
            System.out.println("Array elements of array2"+objArray2);
            objArray.retainAll(objArray2);
            System.out.println("Array1 after retaining common elements of array2 & array1"+objArray);
        }
    }