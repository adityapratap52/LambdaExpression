package lambdaexpression;

interface NumericTest2 {
    boolean test (int n, int d);
}

public class LambdaDemoWithTwoParameters {
    public static void main(String[] args) {
        // This lambda expression determines if one number is
        // a factor of another.
        NumericTest2 isFactor = (n, d) -> (n % d)  == 0;
//        NumericTest2 isFactor = (int n, int d) -> (n % d)  == 0;       // Both are same
//        NumericTest2 isFactor = (int n, d) -> (n % d)  == 0;          // You can't use this type
//        NumericTest2 isFactor = (int n, double d) -> (n % d)  == 0;       // You can't use this type

        if (isFactor.test(10, 2)) System.out.println("2 is a factor of 10");
        if (!isFactor.test(10, 3)) System.out.println("3 is not a factor of 10");
    }
}
