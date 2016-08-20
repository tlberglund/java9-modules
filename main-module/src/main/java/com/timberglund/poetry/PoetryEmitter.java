package com.timberglund.poetry;

import com.timberglund.logger.Logger;
import com.timberglund.poetry.content.Content;
import java.util.List;

public class PoetryEmitter {

   public static void main(String args[]) {
     Logger logger = new Logger();
     
     Content content = new Content();
     List<String> lines = content.getLines("daffodils");
     lines.forEach(line -> logger.log(line));
   }
}
