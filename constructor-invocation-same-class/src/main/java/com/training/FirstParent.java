package com.training;

public class FirstParent extends ParentOfFirstParent {
    private final int c;

    public FirstParent(int c) {
        super(c + 1);
        this.c = c;
    }

    @Override
    public String toString() {
        return "FirstParent{" +
                "c=" + c +
                "}, "
                + super.toString();
    }
}
