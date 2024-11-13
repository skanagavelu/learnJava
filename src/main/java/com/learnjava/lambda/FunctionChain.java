package com.learnjava.lambda;

import java.util.List;
import java.util.function.Function;

public class FunctionChain {
  public static void main(String[] args) {
    List<String> items = List.of("one", "two", "three");
    items.stream()
        // String::length is function like str -> str.length()
        .map(Function.<String>identity().andThen(String::valueOf).andThen(String::length))
        .forEach(System.out::println);
  }
}
