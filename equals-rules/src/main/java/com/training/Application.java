package com.training;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        System.out.println("reflexive: " + application.reflexive());
        System.out.println("symmetry: " + application.symmetry());
        System.out.println("transitive: " + application.transitive());
        System.out.println("consistent: " + application.consistent());
    }

    public boolean reflexive() {
        ExampleClass a = new ExampleClass(0, 0);
        return a.equals(a);
    }

    public boolean symmetry() {
        ExampleClass a = new ExampleClass(1, 1);
        ExampleClass b = new ExampleClass(1, 1);
        if(a.equals(b)){
            return b.equals(a);
        }
        return false;
    }

    public boolean transitive() {
        ExampleClass a = new ExampleClass(2, 2);
        ExampleClass b = new ExampleClass(2, 2);
        ExampleClass c = new ExampleClass(2, 2);
        if(a.equals(b) && b.equals(c)){
            return a.equals(c);
        }
        return false;
    }

    public boolean consistent() {
        ExampleClass a = new ExampleClass(3, 3);
        ExampleClass b = new ExampleClass(3, 3);
        if(a.equals(b)){
            return a.equals(b);
        }
        return false;
    }
}
