package HW_9;

public class AreNumbersEqual {

    public int areNumbersEqual(int x, int y) {
        if (x < y) {

            return -1;
        } else if (x > y) {

            return 1;
        }

        return 0;
    }

}
