package lambdaexpression;

interface StringFunc {
    String func (String n);
}

public class BlockLambdaPart2 {
    public static void main(String[] args) {
        // This block lambda reverses the characters in a string.
        StringFunc reverse = (str) -> {
            String result = "";

            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        System.out.println("Lambda reversed is: " + reverse.func("Lambda"));
        System.out.println("Expression reversed is: " + reverse.func("Expression"));
    }
}
