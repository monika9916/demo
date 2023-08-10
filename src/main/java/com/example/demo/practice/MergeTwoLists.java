package com.example.demo.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Merge Two Lists

public class MergeTwoLists {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        
        
        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
        
        System.out.println("Merged List: " + mergedList);
	}
}
