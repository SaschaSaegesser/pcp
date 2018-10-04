package com.excersice1;

import java.util.LinkedList;

public class Stack {
  public static LinkedList<Element> list = new LinkedList<Element>();

  public void push(Element e) {
    list.add(e);
    if (list.size() > 1) {
      list.get(list.size() - 1).setNext(e);
    }
  }

  public Element top() {
    if (list.size() > 0) {
      return list.getLast();
    }
    return null;
  }

  public boolean pop() {
    if (list.size() > 0) { // Can't pop when stack is empty
      list.remove(list.size() - 1);
      // Remove the reference of the previous Element
      list.get(list.size() - 2).setNext(null);
      return true;
    }
    return false;
  }

  public void print() {
    if (list.isEmpty()) {
      System.out.println("print - Stack is empty");
    } else {
      System.out.print("print - Stack contains: ");
      int i = list.size() - 1;
      while (i >= 0) {
        System.out.print(list.get(i).getValue() + ", ");
        i--;
      }
      System.out.print("top Element = " + this.top().getValue());
      System.out.println();
    }
  }

  public boolean isEmpty() {
    if (list.size() == 0) {
      return true;
    }
    return false;
  }

  public int size() {
    return list.size();
  }
}
