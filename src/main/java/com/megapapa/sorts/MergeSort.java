package com.megapapa.sorts;

import java.util.Arrays;

public class MergeSort {

    public int[] sort(int[] values) {

        if (values.length == 1) {

            return values;
        }

        int middle = values.length / 2;

        int[] left = Arrays.copyOfRange(values, 0, middle);
        int[] right = Arrays.copyOfRange(values, middle, values.length);

        int[] leftToMerge = sort(left);
        int[] rightToMerge = sort(right);

        return merge(leftToMerge, rightToMerge);
    }

    // ascending sort
    private int[] merge(int[] left, int[] right) {

        int leftIndex = 0;
        int rightIndex = 0;

        int[] mergeResult = new int[left.length + right.length];
        int loadedValues = 0;

        while (loadedValues != left.length + right.length) {

            // put all rights into mergeResult
            if (leftIndex == left.length) {

                for (int i = rightIndex; i < right.length; i++) {

                    mergeResult[loadedValues] = right[i];
                    loadedValues++;
                }

                break;
            }

            // put all lefts into mergeResult
            if (rightIndex == right.length) {

                for (int i = leftIndex; i < left.length; i++) {

                    mergeResult[loadedValues] = left[i];
                    loadedValues++;
                }

                break;
            }

            if (left[leftIndex] <= right[rightIndex]) {

                mergeResult[loadedValues] = left[leftIndex];
                leftIndex++;
            } else {

                mergeResult[loadedValues] = right[rightIndex];
                rightIndex++;
            }

            loadedValues++;
        }

        return mergeResult;
    }
}
