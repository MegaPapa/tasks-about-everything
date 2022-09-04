package com.megapapa.tasks;

import java.util.HashMap;

// Provided array of integers, find number of pairs which are equal to the provided sumValue
// So sum of two array numbers should be equal to sumValue, find number of this pairs
public class SumOfTwoIntegersInArray {

    public int numberOfPairs(int[] values, int sumValue) {

        var numberOfPairs = 0;

        var hashMap = new HashMap<>();
        for (int i = 0; i < values.length; i++) {

            hashMap.put(values[i], i);
        }

        for (int i = 0; i < values.length - 1; i++) {

            int temp = sumValue - values[i];
            var check = hashMap.get(temp);
            if ((check != null) && (!check.equals(i))) {
                numberOfPairs++;
            }
        }

        return numberOfPairs;
    }
}