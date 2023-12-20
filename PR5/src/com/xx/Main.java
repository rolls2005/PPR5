package com.xx;
import java.util.Scanner;

public class Main {
  private static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    menu();
  }
  public static String menu() {
    String selection;
    System.out.println(
        "Виберіть пункти меню"+"\n"+
        "1 Vector "+"\n"+
        "2 TreeSet "+"\n"+
        "3 PriorityQueue "+"\n"+
        "4 LinkedList "+"\n"+
        "5 LinkedHashSet "+"\n"+
        "6 HashSet "+"\n"+
        "7 ArrayList "+"\n"+
        "8 ArrayDeque "+"\n"+
        "9 Вихід "+"\n");

    selection = input.next();
    switch (selection) {
      case "1":
        Vector vector = new Vector();
        vector.createFunction();
        vector.readFunction();
        vector.updateFunction();
        vector.deleteFunction();
        vector.filterFunction();
        vector.sortFunction();
        vector.findFunction();
        vector.concatFunction();
        vector.reduceFunction();
        vector.matchFunction();
        vector.countingFunction();
        vector.sumFunction();
        vector.averageFunction();
        menu();
        break;
      case "2":
        TreeSet treeSet = new TreeSet();
        treeSet.createFunction();
        treeSet.readFunction();
        treeSet.updateFunction();
        treeSet.deleteFunction();
        treeSet.filterFunction();
        treeSet.sortFunction();
        treeSet.findFunction();
        treeSet.concatFunction();
        treeSet.reduceFunction();
        treeSet.matchFunction();
        treeSet.countingFunction();
        treeSet.sumFunction();
        treeSet.averageFunction();
        menu();
        break;
      case "3":
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.createFunction();
        priorityQueue.readFunction();
        priorityQueue.updateFunction();
        priorityQueue.deleteFunction();
        priorityQueue.filterFunction();
        priorityQueue.sortFunction();
        priorityQueue.findFunction();
        priorityQueue.concatFunction();
        priorityQueue.reduceFunction();
        priorityQueue.matchFunction();
        priorityQueue.countingFunction();
        priorityQueue.sumFunction();
        priorityQueue.averageFunction();
        menu();
        break;
      case "4":
        LinkedList linkedList = new LinkedList();
        linkedList.createFunction();
        linkedList.readFunction();
        linkedList.updateFunction();
        linkedList.deleteFunction();
        linkedList.filterFunction();
        linkedList.sortFunction();
        linkedList.findFunction();
        linkedList.concatFunction();
        linkedList.reduceFunction();
        linkedList.matchFunction();
        linkedList.countingFunction();
        linkedList.sumFunction();
        linkedList.averageFunction();
        menu();
        break;
      case "5":
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.createFunction();
        linkedHashSet.readFunction();
        linkedHashSet.updateFunction();
        linkedHashSet.deleteFunction();
        linkedHashSet.filterFunction();
        linkedHashSet.sortFunction();
        linkedHashSet.findFunction();
        linkedHashSet.concatFunction();
        linkedHashSet.reduceFunction();
        linkedHashSet.matchFunction();
        linkedHashSet.countingFunction();
        linkedHashSet.sumFunction();
        linkedHashSet.averageFunction();
        menu();
        break;
      case "6":
        HashSet hashSet = new HashSet();
        hashSet.createFunction();
        hashSet.readFunction();
        hashSet.updateFunction();
        hashSet.deleteFunction();
        hashSet.filterFunction();
        hashSet.sortFunction();
        hashSet.findFunction();
        hashSet.concatFunction();
        hashSet.reduceFunction();
        hashSet.matchFunction();
        hashSet.countingFunction();
        hashSet.sumFunction();
        hashSet.averageFunction();
        menu();
        break;
      case "7":
        ArrayList arrayList = new ArrayList();
        arrayList.createFunction();
        arrayList.readFunction();
        arrayList.updateFunction();
        arrayList.deleteFunction();
        arrayList.filterFunction();
        arrayList.sortFunction();
        arrayList.findFunction();
        arrayList.concatFunction();
        arrayList.reduceFunction();
        arrayList.matchFunction();
        arrayList.countingFunction();
        arrayList.sumFunction();
        arrayList.averageFunction();
        menu();
        break;
      case "8":
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.createFunction();
        arrayDeque.readFunction();
        arrayDeque.updateFunction();
        arrayDeque.deleteFunc();
        arrayDeque.filterFunction();
        arrayDeque.sortFunction();
        arrayDeque.findFunction();
        arrayDeque.concatFunction();
        arrayDeque.reduceFunction();
        arrayDeque.matchFunction();
        arrayDeque.countingFunction();
        arrayDeque.sumFunction();
        arrayDeque.averageFunction();
        menu();
        break;
      case "9":
        System.exit(0);
        break;
      default:
        return selection = menu();
    }
    return selection;
  }
}
