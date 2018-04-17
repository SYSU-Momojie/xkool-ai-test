package ai.xkool;

import java.util.Arrays;

public class LongestIncrement {

    public static Integer[] find(Integer[] arr, int step) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        int ansHeadPos = 0;
        int ansLength = 1;
        int currentHeadPos = 0;
        int currentLength = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + step) {
                currentLength++;
            } else {
                currentHeadPos = i;
                currentLength = 1;
            }

            if (currentLength > ansLength) {
                ansHeadPos = currentHeadPos;
                ansLength = currentLength;
            }
        }

        return Arrays.copyOfRange(arr, ansHeadPos, ansHeadPos + ansLength);
    }
}
