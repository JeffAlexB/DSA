package main.java.app.kata;

public class LonelyNumbers {
    /*
numbersNeedFriendsToo(22733) ➞ 2277733
// The number can be split into groups 22, 7, and 33.
// 7 appears on its own.
// Put 7s on both sides to create 777.
// Put the numbers together and return the result.

numbersNeedFriendsToo(4666) ➞ 444666
numbersNeedFriendsToo(544) ➞ 55544
numbersNeedFriendsToo(123) ➞ 111222333
numbersNeedFriendsToo(56657) ➞ 55566555777
numbersNeedFriendsToo(33) ➞ 33
* */
    public String numbersNeedFriendsToo(long number){
        //number into string, char or list
        //loop over input
        //current at loop(i)
        //left and right pointers
        //compare right if in bounds
        //compare left in bounds
        //!= left || right -> append * 3
        //else, append current

        String input = Long.toString(number);
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            // System.out.println(current);
            char right = '\0'; //null character
            if (i < input.length() - 1) {
                right = input.charAt(i + 1);
            }
            char left = '\0'; //null character
            if (i > 0) {
                left = input.charAt(i-1);
            }
            if (current != left && current != right) {
                output += "" + current + current + current;
            } else {
                output += "" + current;
            }
        }
        return output;
    }
}