package com.nk.java8;

import lombok.Data;

import java.util.function.Function;

public class Functions {

    public String name = "nanda";

    public Function<? , ?>  test() {
        return (e)-> { this.name = "apple";  return ""; };
    }

}

@Data
class Info {
    public int age;

    public Function<Integer, Integer> power(int x) {
        return n -> x ^ n;
    }

}
