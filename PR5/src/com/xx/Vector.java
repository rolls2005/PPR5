package com.xx;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import java.util.stream.Stream;
public class Vector {
  java.util.Vector<Integer> vector;
  public void createFunction() {
    long variable = System.currentTimeMillis();
    vector = new java.util.Vector<>(fillList());
    System.out.println("Створення Vector: " + (System.currentTimeMillis() - variable));
  }
  private List<Integer> fillList() {
    var variable = IntStream.range(3, 4000000);
    return variable.boxed().toList();
  }
  public void readFunction() {
    long variable = System.currentTimeMillis();
    vector.get(15);
    System.out.println("Читання Vector: " + (System.currentTimeMillis() - variable));
  }
  public void updateFunction() {
    long variable = System.currentTimeMillis();
    vector.add(25002, 100);
    System.out.println("Оновлення Vector: " + (System.currentTimeMillis() - variable));
  }
  public void deleteFunction() {
    long variable = System.currentTimeMillis();
    vector.remove(23800);
    System.out.println("Видалення Vector: " + (System.currentTimeMillis() - variable));
  }
  public void filterFunction() {
    Predicate<Integer> streamsPredicate = item -> item % 2 == 0;
    long variable = System.currentTimeMillis();
    new java.util.Vector<Integer>(vector.stream().filter(streamsPredicate).toList());
    System.out.println("Фільтрація Vector: " + (System.currentTimeMillis() - variable));
  }
  public void sortFunction() {
    long variable = System.currentTimeMillis();
    vector.sort(Comparator.reverseOrder());
    System.out.println("Сортування Vector: " + (System.currentTimeMillis() - variable));
  }
  public void findFunction() {
    long variable = System.currentTimeMillis();
    boolean b = vector.contains(10);
    System.out.println("Знаходження Vector: " + (System.currentTimeMillis() - variable));
  }
  public void concatFunction() {
    long variable = System.currentTimeMillis();
    Stream.concat(vector.stream(), IntStream.range(250, 40000).boxed());
    System.out.println("Concat Vector: " + (System.currentTimeMillis() - variable));
  }
  public void reduceFunction() {
    long variable = System.currentTimeMillis();
    var b = vector.stream().reduce((x, y) -> x + y);
    System.out.println(" Зменшення Vector: " + (System.currentTimeMillis() - variable));
  }
  public void matchFunction() {
    long variable = System.currentTimeMillis();
    boolean b = vector.stream().anyMatch(x -> x % 12 == 0);
    System.out.println("Match Vector: " + (System.currentTimeMillis() - variable));
  }
  public void countingFunction() {
    long variable = System.currentTimeMillis();
    long b = vector.stream().count();
    System.out.println("Підрахунок Vector: " + (System.currentTimeMillis() - variable));
  }
  
  public void sumFunction() {
    long variable = System.currentTimeMillis();
    vector.stream().mapToInt(Integer::intValue).sum();
    System.out.println("Сума Vector: " + (System.currentTimeMillis() - variable));
  }
  public void averageFunction() {
    long variable = System.currentTimeMillis();
    vector.stream().mapToInt(Integer::intValue).average();
    System.out.println("Середнє Vector: " + (System.currentTimeMillis() - variable));
    System.out.println("\n");
  }
}
