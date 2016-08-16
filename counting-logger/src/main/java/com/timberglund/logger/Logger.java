package com.timberglund.logger;

public class Logger {
  private static long lineCount = 0;
    
  public void log(String s) {
    System.out.printf("%8d %s\n", lineCount++, s);
  }
}
