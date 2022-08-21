package com.example.iterator_patterns;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min = 0;
    protected int max =0;
    public Randoms(int min, int max) {
        this.min = min;
        this.max = max + 1;
        this.random = new Random(max);


    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(min, max);
            }
        };
    }



}