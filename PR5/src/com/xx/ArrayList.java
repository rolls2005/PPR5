package com.xx;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class ArrayList {
  java.util.ArrayList<Integer> arrayList;
  public void createFunction() {
    long variable = System.currentTimeMillis();
    arrayList = new java.util.ArrayList<>(fillList());
    System.out.println("Створення ArrayList: " + (System.currentTimeMillis() - variable));
  }
  private List<Integer> fillList() {
    var variable = IntStream.range(1, 5000000);
    return variable.boxed().toList();
  }
  public void readFunction() {
    
    long variable = System.currentTimeMillis();
    arrayList.get(15);
    System.out.println("Читати ArrayList" + (System.currentTimeMillis() - variable));
  }
  public void updateFunction() {
    long variable = System.currentTimeMillis();
    arrayList.add(25002, 100);
    System.out.println("Оновлення ArrayList: " + (System.currentTimeMillis() - variable));
  }
  public void deleteFunction() {
    long variable = System.currentTimeMillis();
    arrayList.remove(23800);
    System.out.println("Видалення ArrayList: " + (System.currentTimeMillis() - variable));
  }
  public void filterFunction() {
    Predicate<Integer> streamsPredicate = item -> item % 2 == 0;
    long variable = System.currentTimeMillis();
    new java.util.ArrayList<Integer>(arrayList.parallelStream().filter(streamsPredicate).toList());
    System.out.println("Фільтрація ArrayList: " + (System.currentTimeMillis() - variable));
  }
  public void sortFunction() {
    long variable = System.currentTimeMillis();
    arrayList.sort(Comparator.reverseOrder());
    System.out.println("Сортування ArrayList: " + (System.currentTimeMillis() - variable));
  }
  public void findFunction() {
    long variable = System.currentTimeMillis();
    boolean b = arrayList.contains(10);
    System.out.println("Знаходження ArrayList: " + (System.currentTimeMillis() - variable));
  }
  public void concatFunction() {
    long variable = System.currentTimeMillis();
    Stream.concat(arrayList.stream(), IntStream.range(250, 600).boxed());
    System.out.println("Concat ArrayList: " + (System.currentTimeMillis() - variable));
  }
  public void reduceFunction() {
    long variable = System.currentTimeMillis();
    var b = arrayList.parallelStream().reduce((x, y) -> x + y);
    System.out.println("Зменшити ArrayList: " + (System.currentTimeMillis() - variable));
  }
  public void matchFunction() {
    long variable = System.currentTimeMillis();
    boolean b = arrayList.parallelStream().anyMatch(x -> x % 12 == 0);
    System.out.println("Match ArrayList: " + (System.currentTimeMillis() - variable));
  }
  public void countingFunction() {
    long variable = System.currentTimeMillis();
    long b = arrayList.parallelStream().count();
    System.out.println("Підрахунок ArrayList: " + (System.currentTimeMillis() - variable));
  }
  public void sumFunction() {
    long variable = System.currentTimeMillis();
    arrayList.parallelStream().mapToInt(Integer::intValue).sum();
    System.out.println("Сума ArrayList: " + (System.currentTimeMillis() - variable));
  }
  public void averageFunction() {
    long variable = System.currentTimeMillis();
    arrayList.parallelStream().mapToInt(Integer::intValue).average();
    System.out.println("Середнє ArrayList: " + (System.currentTimeMillis() - variable));
    System.out.println("\n");
  }
}
