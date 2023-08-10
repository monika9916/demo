package com.example.demo.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

// Write a Java function that takes an ArrayList of integers as input and returns the maximum
// element present in the list.

public class MaxElementInArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(10);
    numbers.add(50);
    numbers.add(2000);
    numbers.add(15);
    int max = numbers.stream().max(Comparator.naturalOrder()).orElseThrow();

    Optional<Integer> maxx = numbers.stream().min(Comparator.naturalOrder());
    System.out.println("Maximum element: " + max);
    System.out.println("Maximum element: " + maxx);
  }
}
