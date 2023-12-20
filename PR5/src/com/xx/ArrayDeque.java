package com.xx;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class ArrayDeque {
  
  java.util.ArrayDeque<Integer> arrayDeque;
  
  public void createFunction() {
    long variable = System.currentTimeMillis();
    arrayDeque = new java.util.ArrayDeque<>(fillList());
    System.out.println("Створення ArrayDeque: " + (System.currentTimeMillis() - variable));
  }
  
  private List<Integer> fillList() {
    var variable = IntStream.range(5, 6000000);
    return variable.boxed().toList();
  }
  
  public void readFunction() {
    long variable = System.currentTimeMillis();
    arrayDeque.peek();
    System.out.println("Читати ArrayDeque: " + (System.currentTimeMillis() - variable));
  }
  
  public void updateFunction() {
    long variable = System.currentTimeMillis();
    arrayDeque.add(150);
    System.out.println("Оновлення ArrayDeque: " + (System.currentTimeMillis() - variable));
  }
  
  public void deleteFunc() {
    long variable = System.currentTimeMillis();
    arrayDeque.remove(10);
    System.out.println("Видалення ArrayDeque: " + (System.currentTimeMillis() - variable));
  }
  
  public void filterFunction() {
    Predicate<Integer> streamsPredicate = item -> item % 2 == 0;
    long variable = System.currentTimeMillis();
    new java.util.ArrayDeque<Integer>(arrayDeque.stream().filter(streamsPredicate).toList());
    System.out.println("Фільтрація ArrayDeque: " + (System.currentTimeMillis() - variable));
  }
  
  public void sortFunction() {
    long variable = System.currentTimeMillis();
    arrayDeque.stream().sorted();
    System.out.println("Сортування ArrayDeque: " + (System.currentTimeMillis() - variable));
  }
  
  public void findFunction() {
    long variable = System.currentTimeMillis();
    boolean b = arrayDeque.contains(15);
    System.out.println("Знаходження ArrayDeque: " + (System.currentTimeMillis() - variable));
  }
  
  public void concatFunction() {
    long variable = System.currentTimeMillis();
    Stream.concat(arrayDeque.stream(), IntStream.range(250, 400).boxed());
    System.out.println("Concat ArrayDeque: " + (System.currentTimeMillis() - variable));
  }
  
  public void reduceFunction() {
    long variable = System.currentTimeMillis();
    var b = arrayDeque.stream().reduce((x, y) -> x + y);
    System.out.println("Зменшити ArrayDeque: " + (System.currentTimeMillis() - variable));
  }
  
  public void matchFunction() {
    long variable = System.currentTimeMillis();
    boolean b = arrayDeque.stream().anyMatch(x -> x % 12 == 0);
    System.out.println("Match ArrayDeque: " + (System.currentTimeMillis() - variable));
  }
  
  public void countingFunction() {
    
    long variable = System.currentTimeMillis();
    long b = arrayDeque.stream().count();
    System.out.println("Підрахунок ArrayDeque: " + (System.currentTimeMillis() - variable));
  }
  
  public void sumFunction() {
    long variable = System.currentTimeMillis();
    arrayDeque.stream().mapToInt(Integer::intValue).sum();
    System.out.println("Сума ArrayDeque: " + (System.currentTimeMillis() - variable));
  }
  
  public void averageFunction() {
    long variable = System.currentTimeMillis();
    arrayDeque.stream().mapToInt(Integer::intValue).average();
    System.out.println("Середнє ArrayDeque: " + (System.currentTimeMillis() - variable));
    System.out.println("\n");
  }
}
