package lambdaexpression;

interface MyNumber {
    double getValue();
}

public class LambdaDemoWithoutParameter {
    public static void main(String[] args) {
        MyNumber myNumber;
        myNumber = () -> 123.45;

        System.out.println("A fixed value: " + myNumber.getValue());

        // Here, a more complex expression is used.
        myNumber = () -> Math.random() * 100;

        System.out.println("A random value: " + myNumber.getValue());
        System.out.println("Another random value: " + myNumber.getValue());

        // A lambda expression must be compatible with the method
        // defined by the functional interface. Therefore, this won't work;
//        myNumber = () -> "123.03";
    }
}
