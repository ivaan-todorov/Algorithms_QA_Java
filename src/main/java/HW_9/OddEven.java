package HW_9;

public class OddEven {

    public String oddEven(long x) {
        if (x > Integer.MIN_VALUE && x < Integer.MAX_VALUE) {
            if (x % 2 == 0) {

                return "Even";
            } else {

                return "Odd";
            }
        }

        return "Undefined";
    }


}
