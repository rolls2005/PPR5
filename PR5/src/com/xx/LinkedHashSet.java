package com.xx;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class LinkedHashSet {
  java.util.LinkedHashSet<Integer> linkedHashSet;
  public void createFunction() {
    long variable = System.currentTimeMillis();
    linkedHashSet = new java.util.LinkedHashSet<>(fillList());
    System.out.println("Створення LinkedHashSet: " + (System.currentTimeMillis() - variable));
  }
  private List<Integer> fillList() {
    var variable = IntStream.range(20, 3000000);
    return variable.boxed().toList();
  }
  public void readFunction() {
    long variable = System.currentTimeMillis();
    int readNum = linkedHashSet.stream().filter(num -> Objects.equals(num, 20)).findFirst().get();
    System.out.println("Читання LinkedHashSet: " + (System.currentTimeMillis() - variable));
  }
  public void updateFunction() {
    long variable = System.currentTimeMillis();
    linkedHashSet.add(30);
    System.out.println("Оновлення LinkedHashSet: " + (System.currentTimeMillis() - variable));
  }
  public void deleteFunction() {
    long variable = System.currentTimeMillis();
    linkedHashSet.remove(2800);
    System.out.println("Видалення LinkedHashSet: " + (System.currentTimeMillis() - variable));
  }
  public void filterFunction() {
    Predicate<Integer> streamsPredicate = item -> item % 2 == 0;
    long variable = System.currentTimeMillis();
    new java.util.LinkedHashSet<Integer>(linkedHashSet.stream().filter(streamsPredicate).toList());
    System.out.println("Фільтація LinkedHashSet: " + (System.currentTimeMillis() - variable));
  }
  public void sortFunction() {
    long variable = System.currentTimeMillis();
    var b = linkedHashSet.stream().sorted().toList();
    System.out.println("Сортуваня LinkedHashSet: " + (System.currentTimeMillis() - variable));
  }
  public void findFunction() {
    long variable = System.currentTimeMillis();
    boolean b = linkedHashSet.contains(25);
    System.out.println("Знаходження LinkedHashSet: " + (System.currentTimeMillis() - variable));
  }
  public void concatFunction() {
    long variable = System.currentTimeMillis();
    Stream.concat(linkedHashSet.stream(), IntStream.range(150, 1000).boxed());
    System.out.println("Concat LinkedHashSet: " + (System.currentTimeMillis() - variable));
  }
  public void reduceFunction() {
    long variable = System.currentTimeMillis();
    var b = linkedHashSet.stream().reduce((x, y) -> x + y);
    System.out.println("Зменшити LinkedHashSet: " + (System.currentTimeMillis() - variable));
    
  }
  public void matchFunction() {
    long variable = System.currentTimeMillis();
    boolean b = linkedHashSet.stream().anyMatch(x -> x % 10 == 0);
    System.out.println("Match LinkedHashSet: " + (System.currentTimeMillis() - variable));
  }
  public void countingFunction() {
    long variable = System.currentTimeMillis();
    long b = linkedHashSet.stream().count();
    System.out.println("Підрахунок LinkedHashSet: " + (System.currentTimeMillis() - variable));
  }
  public void sumFunction() {
    long variable = System.currentTimeMillis();
    linkedHashSet.stream().mapToInt(Integer::intValue).sum();
    System.out.println("Сума LinkedHashSet: " + (System.currentTimeMillis() - variable));
  }
  public void averageFunction() {
    long variable = System.currentTimeMillis();
    linkedHashSet.stream().mapToInt(Integer::intValue).average();
    System.out.println("Середнє LinkedHashSet: " + (System.currentTimeMillis() - variable));
    System.out.println("\n");
  }
}
