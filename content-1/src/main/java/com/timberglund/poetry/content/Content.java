package com.timberglund.poetry.content;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Content {
  private Map<String, List<String>> poems = new HashMap<String, List<String>>();
  
  public Content() {
    poems.put("daffodils", new Daffodils().getLines());
  }
  
  
  public List<String> getLines(String poemName) {
    return poems.get(poemName);
  }
}
