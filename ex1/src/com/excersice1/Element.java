package com.excersice1;

public class Element {
  private int value;
  private Element next;

  public Element(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public Element getNext() {
    return this.next;
  }

  public void setNext(Element next) {
    this.next = next;
  }
}
