package com.example.demo.practice;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.stream.Collectors;

public class ReverseString {

  public static void main(String[] args) {
    String input = "Hello";
    String rev = strRev(input);
    System.out.println(rev);
  }

  private static String strRev(String input) {
    return input
        .chars() // Convert string to an IntStream of character codes
        .mapToObj(c -> String.valueOf((char) c)) // Convert character codes back to strings
        .collect(
            Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                  java.util.Collections.reverse(list); // Reverse the list of strings
                  return String.join("", list); // Join the strings back to a single reversed string
                }));
  }
  // Loop
  /*
   * private static String strRev(String input) { int len = input.length(); String
   * str = ""; for (int i = len-1; i>=0; i--) { str = str + (input.charAt(i)); }
   * return str; }
   */
}
