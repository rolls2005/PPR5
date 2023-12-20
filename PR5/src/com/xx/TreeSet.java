package com.xx;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class TreeSet {
  java.util.TreeSet<Integer> treeSet;
  public void createFunction() {
    long variable = System.currentTimeMillis();
    treeSet = new java.util.TreeSet<>(fillList());
    System.out.println("Створення TreeSet: " + (System.currentTimeMillis() - variable));
  }
  private List<Integer> fillList() {
    var variable = IntStream.range(1, 1000000);
    return variable.boxed().toList();
  }
  public void readFunction() {
    long variable = System.currentTimeMillis();
    treeSet.first();
    System.out.println("Читання TreeSet: " + (System.currentTimeMillis() - variable));
  }
  public void updateFunction() {
    long variable = System.currentTimeMillis();
    treeSet.add(34);
    System.out.println("Оновлення TreeSet: " + (System.currentTimeMillis() - variable));
  }
  public void deleteFunction() {
    long variable = System.currentTimeMillis();
    treeSet.remove(900);
    System.out.println("Видалення TreeSet: " + (System.currentTimeMillis() - variable));
  }
  public void filterFunction() {
    Predicate<Integer> streamsPredicate = item -> item % 2 == 0;
    long variable = System.currentTimeMillis();
    new java.util.TreeSet<Integer>(treeSet.stream().filter(streamsPredicate).toList());
    System.out.println("Фільтрація TreeSet: " + (System.currentTimeMillis() - variable));
  }
  public void sortFunction() {
    long variable = System.currentTimeMillis();
    var b = treeSet.stream().sorted().collect(Collectors.toSet());
    System.out.println("Сортування TreeSet: " + (System.currentTimeMillis() - variable));
  }
  public void findFunction() {
    long variable = System.currentTimeMillis();
    var b = treeSet.contains(36);
    System.out.println("Знаходження TreeSet: " + (System.currentTimeMillis() - variable));
  }
  
  public void concatFunction() {
    long variable = System.currentTimeMillis();
    Stream.concat(treeSet.stream(), IntStream.range(250, 1200).boxed());
    System.out.println("Concat TreeSet: " + (System.currentTimeMillis() - variable));
  }
  public void reduceFunction() {
    long variable = System.currentTimeMillis();
    var b = treeSet.stream().reduce((x, y) -> x + y);
    System.out.println("Зменшення TreeSet: " + (System.currentTimeMillis() - variable));
  }
  public void matchFunction() {
    long variable = System.currentTimeMillis();
    var b = treeSet.stream().anyMatch(x -> x % 20 == 0);
    System.out.println("Match TreeSet: " + (System.currentTimeMillis() - variable));
  }
  public void countingFunction() {
    long variable = System.currentTimeMillis();
    long b = treeSet.stream().count();
    System.out.println("Підрахунок TreeSet: " + (System.currentTimeMillis() - variable));
  }
  public void sumFunction() {
    long variable = System.currentTimeMillis();
    treeSet.stream().mapToInt(Integer::intValue).sum();
    System.out.println("Сума TreeSet: " + (System.currentTimeMillis() - variable));
  }
  public void averageFunction() {
    long variable = System.currentTimeMillis();
    treeSet.stream().mapToInt(Integer::intValue).average();
    System.out.println("Середнє TreeSet: " + (System.currentTimeMillis() - variable));
    System.out.println("\n");
  }
}
