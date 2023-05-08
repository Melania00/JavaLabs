package ua.lviv.iot.algo.part1.labs.writers;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HyphenatedWords{
    private final String text;

    public HyphenatedWords(String text) {
        this.text = text;
    }

    public List<String> findHyphenatedWords() {
        List<String> hyphenWords = new LinkedList<String>();
        Pattern pattern = Pattern.compile("\\b\\w+-\\w+\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            hyphenWords.add(matcher.group());
        }
        Collections.sort(hyphenWords);
        return hyphenWords;
    }

    public static void main(String[] args) {
        String text = "In the world of business, it's important to stay up-to-date with the latest technologies and strategies.%n" +
                " One way to do this is by attending industry-leading conferences and events.%n" +
                " These events offer a unique opportunity to network with like-minded professionals and gain valuable " +
                "insights into the latest trends.%n Another key aspect of successful business is effective communication.%n" +
                " This includes not only clear and concise verbal communication, but also well-written documents such" +
                " as reports, proposals, and presentations.%n By using appropriate hyphenated words, you can ensure that" +
                " your audience fully understands your message and is more likely to take action.%n Remember to stay" +
                " hyphenated and stay ahead of the game.";
        HyphenatedWords hyphenWordsFinder = new HyphenatedWords(text);
        List<String> hyphenWords = hyphenWordsFinder.findHyphenatedWords();
        for (String word : hyphenWords) {
            System.out.println(word);
        }
    }
}
