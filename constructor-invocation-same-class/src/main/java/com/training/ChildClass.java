package com.training;

public class ChildClass extends FirstParent {
    private int a;
    private int b;

    private ChildClass() {
        super(3);
        b = 2;
    }

    public ChildClass(int a) {
        this();
        this.a = a;
    }

    @Override
    public String toString() {
        return "ChildClass{" +
                "a=" + a +
                ", b=" + b +
                "}, "
                + super.toString();
    }
}
