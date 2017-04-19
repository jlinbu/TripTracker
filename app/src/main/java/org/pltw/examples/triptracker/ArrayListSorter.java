package org.pltw.examples.triptracker;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by jlinburg on 4/19/17.
 */
public class ArrayListSorter {

    public static void insertionSort(ArrayList list) {

        for (int j = 1; j < list.size(); j++) {
            Comparable temp = (Comparable)list.get(j);
            int possibleIndex = j;

            while (possibleIndex > 0 && temp.compareTo(list.get(possibleIndex - 1)) < 0) {
                list.set(possibleIndex, list.get(possibleIndex - 1));
                possibleIndex--;
            }
            list.set(possibleIndex, temp);

        }
        Log.i("Sorter", "Array Sorted");
    }
}
