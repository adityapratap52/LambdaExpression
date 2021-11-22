package lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MyClass {
    private int val;

    MyClass(int v) { val = v; }
    int getVal() { return  val; }
}

public class UseMethodReference {
    static int compareMC(MyClass a, MyClass b) {
//        int store = a.getVal() - b.getVal();
//        System.out.println(a.getVal()+ " and " + b.getVal() + " = " + store);
        return a.getVal() - b.getVal();
    }
    public static void main(String[] args) {
        List<MyClass> al = new ArrayList<>();

        al.add(new MyClass(5));
        al.add(new MyClass(4));
        al.add(new MyClass(2));
        al.add(new MyClass(9));
        al.add(new MyClass(3));
        al.add(new MyClass(7));

        MyClass maxValObj = Collections.max(al, UseMethodReference::compareMC);
        System.out.println("Maximum value is: " + maxValObj.getVal());
    }
}
