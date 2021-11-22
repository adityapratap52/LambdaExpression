package lambdaexpression;

interface MyFunc2<T> {
    boolean func (T v1, T v2);
}

// A class that stores the temperature high for a day.
class HighTemp {
    private int hTemp;

    HighTemp (int ht) { hTemp = ht; }

    // Return true if the invoking HighTemp object has the same
    // temperature as ht2.
    boolean highThanTemp (HighTemp ht2) {
        return hTemp >= ht2.hTemp;
    }

    // Return true if the invoking HighTemp object has a temperature
    // that is less than ht2.
    boolean lessThanTemp (HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

public class InstanceMethodWithObjectRef {
    static <T> int counter (T[] val, MyFunc2<T> f, T v) {
        int count = 0;

        for (int i = 0; i < val.length; i++) {
            if (f.func(val[i], v)) count++;
        }

        return count;
    }
    public static void main(String[] args) {
        int count;

        // Create an array of HighTemp objects.
        HighTemp[] weekDayHighs = { new HighTemp(89), new HighTemp(82),
                                    new HighTemp(90), new HighTemp(89),
                                    new HighTemp(89), new HighTemp(91),
                                    new HighTemp(84), new HighTemp(83)};

        // Use counter() with arrays of the class HighTemp.
        count = counter(weekDayHighs, HighTemp::highThanTemp, new HighTemp(89));
        System.out.println(count + " days had a high of 89");

        // Now, create and use another array of HighTemp objects.
        HighTemp[] weekDayHighs2 = { new HighTemp(32), new HighTemp(12),
                                    new HighTemp(14), new HighTemp(19),
                                    new HighTemp(18), new HighTemp(12),
                                    new HighTemp(-1), new HighTemp(13)};

        count = counter(weekDayHighs2, HighTemp::highThanTemp, new HighTemp(12));
        System.out.println(count + " days had a high of 12");

        // Now, use lessThanTemp() to find days when temperature was less
        // than a specified value.
        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println(count + " days had a high less than 89");

        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println(count + " days had a high less than 19");
    }
}
