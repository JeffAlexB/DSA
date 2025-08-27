package app.edabit;     

public class IntegerDigits {
    /**
     * Create a function that recursively counts the integer's number of digits.
     */
    public int count(int num) {
        int absNum = Math.abs(num);
        if (absNum < 10) {
            return 1;
        } else {
            return 1 + count(absNum / 10);
        }
    }
}
