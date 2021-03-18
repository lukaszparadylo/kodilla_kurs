package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("Cosik",a->a));
        System.out.println(poemBeautifier.beautify("dlugopis",a->a));
        System.out.println(poemBeautifier.beautify("monitor",a->a));
        System.out.println(poemBeautifier.beautify("woda",a->a));
    }
}
