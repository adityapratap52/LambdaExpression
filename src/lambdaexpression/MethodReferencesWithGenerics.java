package lambdaexpression;

interface MyFunc3<T> {
    int func(T[] val, T v);
}

class MyArrayOps {
    static <T> int countMatching (T[] val, T v) {
        int count = 0;

        for (int i = 0; i < val.length; i++) {
            if (val[i] == v) count++;
        }

        return count;
    }
}

public class MethodReferencesWithGenerics {
    static  <T> int myOp(MyFunc3<T> f, T[] val, T v) {
        return f.func(val, v);
    }
    public static void main(String[] args) {
        Integer[] val = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] str = {"One", "Two", "Three", "Two"};
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, val, 4);
        System.out.println("Val contains " + count+ " 4s");

        count = myOp(MyArrayOps::<String>countMatching, str, "Two");
        System.out.println("str contains " + count+ " Twos");
    }
}
