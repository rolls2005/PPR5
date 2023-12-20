package com.xx;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class LinkedList {
  java.util.LinkedList<Integer> linkedList;
  public void createFunction() {
    long variable = System.currentTimeMillis();
    linkedList = new java.util.LinkedList<>(fillList());
    System.out.println("Створення LinkedList: " + (System.currentTimeMillis() - variable));
  }
  
  private List<Integer> fillList() {
    var variable = IntStream.range(5, 6000000);
    return variable.boxed().toList();
  }
  public void readFunction() {
    long variable = System.currentTimeMillis();
    linkedList.get(15);
    System.out.println("Читання LinkedList: " + (System.currentTimeMillis() - variable));
  }
  public void updateFunction() {
    long variable = System.currentTimeMillis();
    linkedList.add(25002, 100);
    System.out.println("Оновлення LinkedList: " + (System.currentTimeMillis() - variable));
  }
  public void deleteFunction() {
    long variable = System.currentTimeMillis();
    linkedList.remove(23800);
    System.out.println("Делете LinkedList: " + (System.currentTimeMillis() - variable));
  }
  public void filterFunction() {
    Predicate<Integer> streamsPredicate = item -> item % 2 == 0;
    long variable = System.currentTimeMillis();
    new java.util.LinkedList<Integer>(linkedList.stream().filter(streamsPredicate).toList());
    System.out.println("Фільтрація LinkedList: " + (System.currentTimeMillis() - variable));
  }
  public void sortFunction() {
    long variable = System.currentTimeMillis();
    linkedList.sort(Comparator.reverseOrder());
    System.out.println("Сортування LinkedList: " + (System.currentTimeMillis() - variable));
  }
  public void findFunction() {
    long variable = System.currentTimeMillis();
    boolean b = linkedList.contains(10);
    System.out.println("Знаходження LinkedList: " + (System.currentTimeMillis() - variable));
  }
  public void concatFunction() {
    long variable = System.currentTimeMillis();
    Stream.concat(linkedList.stream(), IntStream.range(250, 400).boxed());
    System.out.println("Concat LinkedList: " + (System.currentTimeMillis() - variable));
  }
  public void reduceFunction() {
    long variable = System.currentTimeMillis();
    var b = linkedList.stream().reduce((x, y) -> x + y);
    System.out.println("Зменшити LinkedList: " + (System.currentTimeMillis() - variable));
  }
  public void matchFunction() {
    long variable = System.currentTimeMillis();
    boolean b = linkedList.stream().anyMatch(x -> x % 12 == 0);
    System.out.println("Match LinkedList: " + (System.currentTimeMillis() - variable));
  }
  public void countingFunction() {
    long variable = System.currentTimeMillis();
    long b = linkedList.stream().count();
    System.out.println("Підрахунок LinkedList: " + (System.currentTimeMillis() - variable));
  }
  public void sumFunction() {
    long variable = System.currentTimeMillis();
    linkedList.stream().mapToInt(Integer::intValue).sum();
    System.out.println("Сума LinkedList: " + (System.currentTimeMillis() - variable));
  }
  public void averageFunction() {
    long variable = System.currentTimeMillis();
    linkedList.stream().mapToInt(Integer::intValue).average();
    
    System.out.println("Середнє LinkedList: " + (System.currentTimeMillis() - variable));
    System.out.println("\n");
  }
}
