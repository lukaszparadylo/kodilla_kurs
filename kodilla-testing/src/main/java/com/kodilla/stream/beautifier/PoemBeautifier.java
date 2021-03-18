package com.kodilla.stream.beautifier;

import java.util.Date;
import java.util.Random;

public class PoemBeautifier {
    public String beautify(String text, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(text).toUpperCase();
        result = result.replace('I','J');
        result +=" ";
        result += result.length();
        return result;
    }
}
