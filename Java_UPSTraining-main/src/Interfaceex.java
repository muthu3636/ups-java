interface MyInterface {
    void abstractMethod();


    default void defaultMethod() {
        System.out.println("This is a default method");
    }


    static void staticMethod() {
        System.out.println("This is a static method");
    }
}

class MyClass implements MyInterface {
    public void abstractMethod() {
        System.out.println("This is the implementation of the abstract method");
    }
}

public class Interfaceex{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.abstractMethod();
        obj.defaultMethod();
        MyInterface.staticMethod();
    }
}
