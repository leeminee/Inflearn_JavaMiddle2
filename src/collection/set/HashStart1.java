package collection.set;

import java.util.Arrays;

public class HashStart1 {

    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("inputArray : "+ Arrays.toString(inputArray));

        int search = 8;
        // 4번 반복 // O(n)
        for ( int input : inputArray) {
            if(search == input) {
                System.out.println(input);
            }
        }
    }
}
