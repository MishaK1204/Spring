package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        // Logic for Bubble sort algorithm
        System.out.println("Bubble Sort Algorithm");
        return numbers;
    }
}
