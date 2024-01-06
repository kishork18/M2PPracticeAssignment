package com.masai.main;

import java.util.ArrayList;
import java.util.List;

public class StreamVsParallelStreamExample {
  public static void addition() {
	  List<Integer> numbers = new ArrayList<>();
      for (int i = 1; i <= 1000000; i++) {
          numbers.add(i);
      }
      long startTime = System.currentTimeMillis();
      long sumSequential = numbers.stream().reduce(0, Integer::sum);
      long endTime = System.currentTimeMillis();
      System.out.println("Sequential Stream Sum: " + sumSequential);
      System.out.println("Time taken using Stream: " + (endTime - startTime) + " ms");
      startTime = System.currentTimeMillis();
      long sumParallel = numbers.parallelStream().reduce(0, Integer::sum);
      endTime = System.currentTimeMillis();
      System.out.println("Parallel Stream Sum: " + sumParallel);
      System.out.println("Time taken using Parallel Stream: " + (endTime - startTime) + " ms");
  }
}
