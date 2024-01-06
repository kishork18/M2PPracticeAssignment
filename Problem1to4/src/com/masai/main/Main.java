package com.masai.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.masai.entity.Employee;

public class Main {
  static List<Employee> filterList(List<Employee> list){
	  
	  return list.stream().filter(e->(e.getId()%2!=0 && e.getName().charAt(0)=='A' && e.getAge()%2==0) ).toList();
  }
  static List<String> findLongestStrings(List<String> list){
	  int max= list.stream().mapToInt(String::length).max().orElse(0);
	  List<String> MaxList= list.stream().filter(s->s.length()==max).toList();
	  return MaxList;
	  
  }
  public static void main(String [] args) {
	  List<Employee> employeeList = new ArrayList<>();
      employeeList.add(new Employee(1, "John", 30, "123 Main St"));
      employeeList.add(new Employee(2, "Alice", 28, "456 Oak St"));
      employeeList.add(new Employee(3, "Bob", 35, "789 Pine St"));
      employeeList.add(new Employee(4, "Andrew", 25, "321 Elm St"));
      employeeList.add(new Employee(5, "Anna", 32, "654 Birch St"));
      employeeList.add(new Employee(6, "Alex", 40, "987 Cedar St"));
      employeeList.add(new Employee(7, "Megan", 27, "135 Maple St"));
      employeeList.add(new Employee(8, "Aaron", 34, "246 Walnut St"));
      employeeList.add(new Employee(9, "Sophie", 29, "579 Cherry St"));
      employeeList.add(new Employee(10, "David", 31, "802 Pineapple St"));
//      System.out.println(filterList(employeeList));
      List<Integer> numbers = new ArrayList<>();
      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      numbers.add(4);
      numbers.add(5);
      numbers.add(6);
      numbers.add(7);
      numbers.add(8);
      numbers.add(9);
      numbers.add(10);
      List<Integer> evenList= numbers.stream().filter(n->n%2==0).toList();
      int SquardValueSum= evenList.stream().mapToInt(n->n*n).sum();
//      System.out.println("Even List of Number: "+ evenList);
//      System.out.println("Sum of Squar of evenNumber: "+ SquardValueSum);
      List<String> stringList = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "pear", "melon");

      // Find and print the longest strings
      List<String> longestStrings = findLongestStrings(stringList);
//      System.out.println("Longest string(s): " + longestStrings);
      StreamVsParallelStreamExample.addition();
 
  }
}
