package com.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        System.out.println(new Application().getDoubleBraceInitializedList());
    }

    private List<String> getDoubleBraceInitializedList() {
        List<String> strings = new ArrayList<>() {
            {
                add("First string");
                add("Second string");
                add("Third string");
            }
        };
        return strings;
    }
}
