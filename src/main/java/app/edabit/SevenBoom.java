package main.java.app.edabit;

public class SevenBoom {
    /** Create a function that takes an array of numbers and return "Boom!"
    if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".
     */
    public String SevenBoom(int[] nums) {
        for (int element : nums) {
            if (String.valueOf(element).contains("7")) {
                //System.out.println(element);
                return "Boom!";
            }
        }
        return "there is no 7 in the array";
    }
}
