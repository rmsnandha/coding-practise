package com.nk.java8;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamsPractise {

    public static void main(String[] args) {



    }


    public static void flatMap() {
        Stream<String[]> stream = Stream.of(new String[]{"A", "B"}, new String[]{"C", "D"});
        Stream<String> stringStream = stream.flatMap(Stream::of);
    }


    public static void groupBy() {

        Stream<Person> personStream = Stream.of(new Person("Sam", "chicago", 25),
                new Person("nanda", "chicago", 25),
                new Person("kumar", "dallas", 20)
        );

        Collector<? super Person, ?, ?> abc = Collectors.groupingBy(Person::getAge);
        Map<String, ?> collect = personStream.collect(Collectors.groupingBy(Person::getCity, abc));
        System.out.println(collect);

    }

    @Data
    @AllArgsConstructor
    public static class Person {
        public String name;
        public String city;
        public Integer age;
    }

}
