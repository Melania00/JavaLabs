package ua.lviv.iot.algo.part1.labs.writers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class HyphenatedWordsTest {

    @Test
    public void findHyphenatedWords_emptyText_returnsEmptyList() {
        HyphenatedWords hyphenatedWords = new HyphenatedWords("");
        ArrayList<String> hyphenated = hyphenatedWords.findHyphenatedWords();
        Assertions.assertEquals(0, hyphenated.size());
    }

    @Test
    public void findHyphenatedWords_textWithNoHyphens_returnsEmptyList() {
        String text = "This text has no hyphens.";
        HyphenatedWords hyphenatedWords = new HyphenatedWords(text);
        ArrayList<String> hyphenated = hyphenatedWords.findHyphenatedWords();
        Assertions.assertEquals(0, hyphenated.size());
    }

    @Test
    public void findHyphenatedWords_textWithHyphens_returnsHyphenatedWords() {
        String text = "This is a text with some hyphenated-words.";
        HyphenatedWords hyphenatedWords = new HyphenatedWords(text);
        ArrayList<String> hyphenated = hyphenatedWords.findHyphenatedWords();
        Assertions.assertEquals(1, hyphenated.size());
        Assertions.assertEquals("hyphenated-words", hyphenated.get(0));
    }

    @Test
    public void findHyphenatedWords_textWithMultipleHyphens_returnsSortedHyphenatedWords() {
        String text = "This is a text with some hyphenated-words and some other re-used-words.";
        HyphenatedWords hyphenatedWords = new HyphenatedWords(text);
        ArrayList<String> hyphenated = hyphenatedWords.findHyphenatedWords();
        Assertions.assertEquals(2, hyphenated.size());
        Assertions.assertEquals("hyphenated-words", hyphenated.get(0));
        Assertions.assertEquals("re-used", hyphenated.get(1));
    }

}
