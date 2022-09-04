package com.megapapa;

import com.megapapa.sorts.MergeSort;
import com.megapapa.sorts.QuickSort;
import com.megapapa.tasks.SumOfTwoIntegersInArray;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {

        var quickSort = new QuickSort();
        IntStream.of(quickSort.sort(new int[]{45,12,85,32,89,39,69,44,42,1,6,8}))
                .forEach(System.out::println);

//        var sumOfTwo = new SumOfTwoIntegersInArray();
//        var result = sumOfTwo.numberOfPairs(new int[]{0, 1, 3, 0}, 3);
//        System.out.println(result);

//        var mergeSort = new MergeSort();
//        var sortedArray = mergeSort.sort(new int[]{45,12,85,32,89,39,69,44,42,1,6,8});
//
//        IntStream.of(sortedArray)
//                .forEach(System.out::println);
    }
}
