package com.xjav.threex.lang.cnp3X;

public class cnp {
  private Object copiedText;
  public static void copy(Object input) {
    this.copiedText = input;
  }
  public static void copy(int start, Object input) {
    this.copiedText = input.substring(start);
  }
  public static void copy(int start, int end, Object input) {
    this.copiedText = input.substring(start, end);
  }
  public static Object paste() {
    return copiedText;
  }
}
