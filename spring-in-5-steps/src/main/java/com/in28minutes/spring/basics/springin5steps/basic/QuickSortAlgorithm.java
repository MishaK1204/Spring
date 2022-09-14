package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        // Logic for Quick sort algorithm
        System.out.println("Quick Sort Algorithm");
        return numbers;
    }
}
