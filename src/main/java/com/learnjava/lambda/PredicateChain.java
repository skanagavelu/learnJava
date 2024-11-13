package com.learnjava.lambda;

import java.util.List;
import java.util.function.Predicate;

public class PredicateChain {
  public static void main(String[] args) {
    List<String> items = List.of("one", "two", "three");

    // Create initial predicate like below
    Predicate<String> alwaysTrue = s -> true;
    items.stream()
        .filter(alwaysTrue.and(Predicate.not(String::isEmpty)).and(s -> s.startsWith("t")))
            // can not use method reference for s -> s.startsWith("t")
            // because this requires two reference s (object) and t (param),
            // so String::startsWith has ambiguous of where to use the stream value?
        .forEach(System.out::println);
  }
}
