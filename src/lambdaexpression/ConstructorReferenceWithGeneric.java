package lambdaexpression;

interface MyFunc5<T> {
    MyClass3<T> func(T n);
}

class MyClass3<T> {
    private T val;

    MyClass3() { val = null; }
    MyClass3(T v) { val = v; }

    T getVal() { return val; }
}

public class ConstructorReferenceWithGeneric {
    public static void main(String[] args) {
        // Create a reference to the MyClass3<T> constructor.
        MyFunc5<Integer> myClassCons = MyClass3::new;

        // Create an instance of MyClass<T> via that constructor reference.
        MyClass3<Integer> mc = myClassCons.func(100);

        System.out.println("Val in mc is " + mc.getVal());
    }
}
