package com.example.demo.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

// Write a Java function that takes an ArrayList of strings and a string value as input. The
// function should remove all occurrences of the given string from the ArrayList.
public class RemoveElementInArrayList {
  public static void main(String[] args) {
    String del = "Apple";
    ArrayList<String> fruits = new ArrayList<String>();
    fruits.add("Orange");
    fruits.add("Apple");
    fruits.add("Mango");
    fruits.add("Apple");
    fruits.add("Papaya");

    fruits.removeIf(str -> str.equals(del));

    // fruits.remove(del);

    System.out.println("ArrayList after removing \"" + del + "\": " + fruits);
  }
}
