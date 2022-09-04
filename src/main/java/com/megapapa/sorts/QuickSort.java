package com.megapapa.sorts;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {

    public int[] sort(int[] values) {

        if (values.length <= 1) {

            return values;
        }

        int pivotElementIndex = ThreadLocalRandom.current().nextInt(0, values.length);;
        int pivotElement = values[pivotElementIndex];
        var lowerElems = new ArrayList<>();
        var higherElems = new ArrayList<>();

        for (int i = 0; i < values.length; i++) {

            if (values[i] <= pivotElement) {

                lowerElems.add(values[i]);
            } else{

                higherElems.add(values[i]);
            }
        }

        var sortedLower = sort(lowerElems.stream().mapToInt(i -> (int) i).toArray());
        var sortedHigher = sort(higherElems.stream().mapToInt(i -> (int) i).toArray());
        int[] result = new int[sortedLower.length + sortedHigher.length];

        for (int i = 0; i < sortedLower.length; i++) {

            result[i] = sortedLower[i];
        }

        for (int i = 0; i < sortedHigher.length; i++) {

            result[i + sortedLower.length] = sortedHigher[i];
        }

        return result;
    }
}
