package lambdaexpression;

interface StringFunc2 {
    String func (String n);
}

// This class defines a static method called strReverse ().
class MyStringOps {
    // A static method that reverses a String.
    static String strReverse (String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }
}

public class MethodReferencesToStaticMethods {
    // This method has a functional interface as the type of
    // its first parameter. Thus, it can be passed any instance
    // of that interface, including a method reference.
    static String stringOp (StringFunc2 sf, String s) {
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Original string: " + inStr);
        System.out.println("String reversed: " + outStr);
    }
}
