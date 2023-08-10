package com.example.demo.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Write a Java function that takes an ArrayList of strings and a string value as input
//and returns the index of the first occurrence of the given string in the ArrayList. If the string is not found, the function should return -1.

public class SearchElementInArrayList {
	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<>();
		cities.add("New York");
		cities.add("London");
		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("Sydney");

		String target = "New York";

		int index = cities.indexOf(target);
		if (index != -1) {
			System.out.println("Element \"" + target + "\" found at index: " + index);
		} else {
			System.out.println("Element \"" + target + "\" not found in the ArrayList.");
		}

	}

}
