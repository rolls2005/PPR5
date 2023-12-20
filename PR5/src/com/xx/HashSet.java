package com.xx;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class HashSet {
  java.util.HashSet<Integer> hashSet;
  public void createFunction() {
    long variable = System.currentTimeMillis();
    hashSet = new java.util.HashSet<>(fillList());
    System.out.println("Створення ArrayList: " + (System.currentTimeMillis() - variable));
  }
  private List<Integer> fillList() {
    var variable = IntStream.range(15, 2000000);
    return variable.boxed().toList();
  }
  public void readFunction() {
    long variable = System.currentTimeMillis();
    hashSet.stream().filter(num -> Objects.equals(num, 20)).findFirst().get();
    System.out.println("Читати HashSet: " + (System.currentTimeMillis() - variable));
  }
  public void updateFunction() {
    long variable = System.currentTimeMillis();
    hashSet.add(23);
    System.out.println("Оновленн яHashSet: " + (System.currentTimeMillis() - variable));
  }
  public void deleteFunction() {
    long variable = System.currentTimeMillis();
    hashSet.remove(23800);
    System.out.println("Видалення HashSet: " + (System.currentTimeMillis() - variable));
  }
  public void filterFunction() {
    Predicate<Integer> streamsPredicate = item -> item % 2 == 0;
    long variable = System.currentTimeMillis();
    new java.util.HashSet<Integer>(hashSet.stream().filter(streamsPredicate).toList());
    System.out.println("Фільтрація HashSet: " + (System.currentTimeMillis() - variable));
  }
  
  public void sortFunction() {
    long variable = System.currentTimeMillis();
    var b = hashSet.stream().sorted().collect(Collectors.toSet());
    System.out.println("Сортування HashSet: " + (System.currentTimeMillis() - variable));
  }
  public void findFunction() {
    long variable = System.currentTimeMillis();
    hashSet.contains(25);
    System.out.println("Знаходження HashSet: " + (System.currentTimeMillis() - variable));
  }
  public void concatFunction() {
    long variable = System.currentTimeMillis();
    Stream.concat(hashSet.stream(), IntStream.range(250, 1000).boxed());
    System.out.println("Concat HashSet: " + (System.currentTimeMillis() - variable));
  }
  public void reduceFunction() {
    long variable = System.currentTimeMillis();
    var b = hashSet.stream().reduce((x, y) -> x + y);
    System.out.println("Зменшити HashSet: " + (System.currentTimeMillis() - variable));
  }
  public void matchFunction() {
    long variable = System.currentTimeMillis();
    boolean b = hashSet.stream().anyMatch(x -> x % 10 == 0);
    System.out.println("Match HashSet: " + (System.currentTimeMillis() - variable));
  }
  public void countingFunction() {
    long variable = System.currentTimeMillis();
    long b = hashSet.stream().count();
    System.out.println("Підрахунок HashSet: " + (System.currentTimeMillis() - variable));
  }
  public void sumFunction() {
    long variable = System.currentTimeMillis();
    hashSet.stream().mapToInt(Integer::intValue).sum();
    System.out.println("Сума HashSet: " + (System.currentTimeMillis() - variable));
  }
  public void averageFunction() {
    long variable = System.currentTimeMillis();
    hashSet.stream().mapToInt(Integer::intValue).average();
    System.out.println("Середнє HashSet: " + (System.currentTimeMillis() - variable));
    System.out.println("\n");
  }
}
