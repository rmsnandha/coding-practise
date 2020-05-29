package com.nk.algo;

import lombok.Data;
import lombok.ToString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ComparatorMain {

    @Data
    @ToString
    static class Info {
        public String fitsName;
        public String lastName;

        public Info(String fitsName, String lastName) {
            this.fitsName = fitsName;
            this.lastName = lastName;
        }
    }


    public static void main(String[] args) {

        Comparator<Info> first = (o1, o2) -> {
            System.out.println(" first comparator");
            return o1.fitsName.compareTo(o2.fitsName);
        };

        Comparator<Info> second = (o1, o2) -> {
            System.out.println("second comparator");
            return o1.lastName.compareTo(o2.lastName);
        };

        first.thenComparing(second);


        Stream<Info> sorted = Arrays.asList(new Info("X", "B"), new Info("B", "C")).stream()
                .sorted(Comparator.comparing(i -> i.fitsName));


        sorted.forEach(System.out::println);

    }

}


