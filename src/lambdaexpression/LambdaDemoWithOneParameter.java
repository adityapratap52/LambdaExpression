package lambdaexpression;

interface NumericTest {
    boolean test (int n);
}

public class LambdaDemoWithOneParameter {
    public static void main(String[] args) {
        // A lambda expression that tests if a number is even.
        NumericTest isEven = n -> (n % 2) == 0;
//        NumericTest isEven = (n) -> (n % 2) == 0;
//        NumericTest isEven = (int n) -> (n % 2) == 0;   // both are same
//        NumericTest isEven = (double n) -> (n % 2) == 0;   // You can't use this type

        if (isEven.test(10)) System.out.println("10 is even");
        if (!isEven.test(9)) System.out.println("9 is not even");

        // Now, use a lambda expression that tests if s number is non-negative.
        NumericTest isNonNeg = (n) -> n >= 0;

        if (isNonNeg.test(1)) System.out.println("1 is non-negative");
        if (!isNonNeg.test(-1)) System.out.println("-1 is negative");
    }
}
