package lambdaexpression;

interface  MyFun<R, T> {
    R func(T n);
}

class MyClass4<T> {
    private T val;

    MyClass4(T v) { val = v; }

    // It is not used by this program
    MyClass4() { val = null; }

    T getVal() { return val; }
}

class MyClass5 {
    String str;

    MyClass5(String s) { str = s; }

    // It is not used by this program
    MyClass5() { str = ""; }

    String getVal() { return str; }
}

public class ConstructorReferenceWithGenericPart2 {
    static <R,T> R myClassFactory(MyFun<R, T> cons, T v) {
        return cons.func(v);
    }
    public static void main(String[] args) {
        MyFun<MyClass4<Double>, Double> myClassCons = MyClass4<Double>::new;

        MyClass4<Double> mc = myClassFactory(myClassCons, 100.1);

        System.out.println("val in mc is " + mc.getVal());

        MyFun<MyClass5, String> myClassCons2 = MyClass5::new;

        MyClass5 mc2 = myClassFactory(myClassCons2, "Lambda");

        System.out.println("val in mc is " + mc2.getVal());
    }
}
