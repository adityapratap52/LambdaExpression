package lambdaexpression;

interface MyFunc4 {
    MyClass2 func(int n);
}

class MyClass2 {
    private int val;

    MyClass2() { val = 0; }
    MyClass2(int v) { val = v; }

    int getVal() { return  val; }
}

public class ConstructorReferences {
    public static void main(String[] args) {
        // new refers to the parameterized constructor in MyClass2,
        // not the default constructor.
        MyFunc4 myClassCons = MyClass2::new;

        // Create an instance of MyClass2 via that constructor reference.
        MyClass2 mc = myClassCons.func(100);

        System.out.println("Val in mc is " + mc.getVal());
    }
}
