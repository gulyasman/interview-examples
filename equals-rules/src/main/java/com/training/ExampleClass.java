package com.training;

public class ExampleClass {
    private final int firstInt;
    private final int secondInt;

    public ExampleClass(int firstInt, int secondInt) {
        this.firstInt = firstInt;
        this.secondInt = secondInt;
    }

    @Override
    public boolean equals(Object o) {
        // Self check
        if (this == o) return true;
        // Null check
        if (o == null) return false;
        // Cast
        ExampleClass e = (ExampleClass) o;
        // Corresponding fields check
        return this.firstInt == e.firstInt
                && this.secondInt == e.secondInt;
    }
}
