package com.timberglund.poetry.content;

import java.util.Arrays;
import java.util.stream.Stream;

public class Dream extends Poem {

  public String getAuthor() {
    return "John Donne";
  }

  public String getTitle() {
    return "The Dream";
  }

  public Stream<String> getLines() {
    String[] dream = {
      "Dear love, for nothing less than thee",
      "Would I have broke this happy dream;",
      "            It was a theme",
      "For reason, much too strong for fantasy,",
      "Therefore thou wak'd'st me wisely; yet",
      "My dream thou brok'st not, but continued'st it.",
      "Thou art so true that thoughts of thee suffice",
      "To make dreams truths, and fables histories;",
      "Enter these arms, for since thou thought'st it best,",
      "Not to dream all my dream, let's act the rest.,",
      "",
      "   As lightning, or a taper's light,",
      "Thine eyes, and not thy noise wak'd me;",
      "            Yet I thought thee",
      "(For thou lovest truth) an angel, at first sight;",
      "But when I saw thou sawest my heart,",
      "And knew'st my thoughts, beyond an angel's art,",
      "When thou knew'st what I dreamt, when thou knew'st when",
      "Excess of joy would wake me, and cam'st then,",
      "I must confess, it could not choose but be",
      "Profane, to think thee any thing but thee.",
      "",
      "   Coming and staying show'd thee, thee,",
      "But rising makes me doubt, that now",
      "            Thou art not thou.",
      "That love is weak where fear's as strong as he;",
      "'Tis not all spirit, pure and brave,",
      "If mixture it of fear, shame, honour have;",
      "Perchance as torches, which must ready be,",
      "Men light and put out, so thou deal'st with me;",
      "Thou cam'st to kindle, goest to come; then I",
      "Will dream that hope again, but else would die."
    };
    
    return Arrays.asList(dream).stream();
  }
}
