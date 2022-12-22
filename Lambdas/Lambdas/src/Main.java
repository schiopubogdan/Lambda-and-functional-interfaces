public class Main {
    public static void main(String[] args) {
        greet(new MyInterface() {
            @Override
            public void print(String message) {
                System.out.println("Inner class: " + message);
            }
        });
        greet( x -> System.out.println("Lambda expression: " + x));
    }
    public static void  greet(MyInterface myInterface) {
        myInterface.print("Hello world!");
    }
}