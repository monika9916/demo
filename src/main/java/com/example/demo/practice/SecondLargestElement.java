package com.example.demo.practice;

import java.util.ArrayList;

// Find the Second Largest Element

public class SecondLargestElement {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>();

    numbers.add(10);
    numbers.add(5);
    numbers.add(10);
    numbers.add(20);
    numbers.add(15);

    int secondLargest = numbers.stream().distinct().sorted().skip(1).findFirst().orElse(-1);

    System.out.println("Second Largest Element: " + secondLargest);

    /*
     * 1. We convert the ArrayList to a stream using list.stream(). We remove
     * 2. duplicates from the stream using distinct() to ensure that we get only unique
     * elements.
     * 3. We sort the stream in reverse order using
     * sorted(Collections.reverseOrder()) to get elements in descending order.
     * 4. We skip the first element using skip(1) as it will be the largest element.
     * 5. Finally, we call findFirst() to get the first element from the stream, which
     * will be the second-largest element. If the stream is empty (no second-largest
     * element found), we use orElse(-1) to return -1 as the default value.
     */
  }
}
