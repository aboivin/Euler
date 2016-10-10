package fr.boivina.euler;

import java.util.stream.IntStream;

public class Problem1 {

    public static int sumOf3and5belowGivenNumber(int limit) {
        return IntStream.range(1, limit).filter(i -> i%3 == 0 || i%5 == 0).sum();
    }
}
