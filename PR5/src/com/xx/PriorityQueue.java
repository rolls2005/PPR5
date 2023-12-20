package com.xx;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class PriorityQueue {
  java.util.PriorityQueue<Integer> priorityQueue;
  public void createFunction() {
    long variable = System.currentTimeMillis();
    priorityQueue = new java.util.PriorityQueue<>(fillList());
    System.out.println("Створення PriorityQueue: " + (System.currentTimeMillis() - variable));
  }
  private List<Integer> fillList() {
    var variable = IntStream.range(1, 5000000);
    return variable.boxed().toList();
  }
  public void readFunction() {
    long variable = System.currentTimeMillis();
    priorityQueue.peek();
    System.out.println("Читання PriorityQueue: " + (System.currentTimeMillis() - variable));
  }
  public void updateFunction() {
    long variable = System.currentTimeMillis();
    priorityQueue.add(65);
    System.out.println("Оновлення PriorityQueue: " + (System.currentTimeMillis() - variable));
  }
  public void deleteFunction() {
    long variable = System.currentTimeMillis();
    priorityQueue.remove(161);
    System.out.println("Видалення PriorityQueue: " + (System.currentTimeMillis() - variable));
  }
  
  public void filterFunction() {
    Predicate<Integer> streamsPredicate = item -> item % 2 == 0;
    long variable = System.currentTimeMillis();
    new java.util.PriorityQueue<Integer>(priorityQueue.stream().filter(streamsPredicate).toList());
    System.out.println("Фільтрація PriorityQueue: " + (System.currentTimeMillis() - variable));
  }
  public void sortFunction() {
    long variable = System.currentTimeMillis();
    var b = priorityQueue.stream().sorted();
    System.out.println("Сортування PriorityQueue: " + (System.currentTimeMillis() - variable));
  }
  public void findFunction() {
    long variable = System.currentTimeMillis();
    boolean b = priorityQueue.contains(10);
    System.out.println("Знаходження PriorityQueue: " + (System.currentTimeMillis() - variable));
  }
  public void concatFunction() {
    long variable = System.currentTimeMillis();
    Stream.concat(priorityQueue.stream(), IntStream.range(250, 900).boxed());
    System.out.println("Concat PriorityQueue: " + (System.currentTimeMillis() - variable));
  }
  public void reduceFunction() {
    long variable = System.currentTimeMillis();
    var b = priorityQueue.stream().reduce((x, y) -> x + y);
    System.out.println("Зменшення PriorityQueue: " + (System.currentTimeMillis() - variable));
  }
  public void matchFunction() {
    long variable = System.currentTimeMillis();
    boolean b = priorityQueue.stream().anyMatch(x -> x % 15 == 0);
    System.out.println("Match PriorityQueue: " + (System.currentTimeMillis() - variable));
  }
  public void countingFunction() {
    long variable = System.currentTimeMillis();
    long b = priorityQueue.stream().count();
    System.out.println("Підрахунок PriorityQueue: " + (System.currentTimeMillis() - variable));
  }
  public void sumFunction() {
    long variable = System.currentTimeMillis();
    priorityQueue.stream().mapToInt(Integer::intValue).sum();
    System.out.println("Сума PriorityQueue: " + (System.currentTimeMillis() - variable));
  }
  public void averageFunction() {
    long variable = System.currentTimeMillis();
    priorityQueue.stream().mapToInt(Integer::intValue).average();
    System.out.println("Середнє PriorityQueue: " + (System.currentTimeMillis() - variable));
    System.out.println("\n");
  }
}
