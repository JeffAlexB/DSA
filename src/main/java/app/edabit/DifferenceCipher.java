package app.edabit;

public class DifferenceCipher {

    public String decrypt(int[] cipherText) {
        String resultString = "";
        ///
        ///     step 1: the first element is a char code
        ///     firstChar = charOf(inputArray[0])
        ///     resultString = resultString + firstChar
        ///
        ///     step 2: rebuild each next char using differences
        ///     previousCode = inputArray[0]
        ///
        ///     for i from 1 to length(inputArray)-1:
        ///         nextCode = previousCode + inputArray[i]
        ///         nextChar = charOf(nextCode)
        ///
        ///         resultString = resultString + nextChar
        ///         previousCode = nextCode
        ///
        return resultString;
    }

    public static int[] encrypt(String plainText) {
        int[] resultArray = new int[plainText.length()];
        ///
        ///     step 1: store the character code of the first char
        ///     firstCharCode = codeOf(inputString[0])
        ///     append resultArray with firstCharCode
        ///
        ///     step 2: for each remaining char
        ///     for i from 1 to length(inputString)-1:
        ///         currentCode = codeOf(inputString[i])
        ///         previousCode = codeOf(inputString[i-1])
        ///
        ///         difference = currentCode - previousCode
        ///         append resultArray with difference
        ///
        return resultArray;
    }
}
