package pw.artwhite;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by artwhite on 20/01/2018.
 */
public class Main {
    public static void main(String[] args) {
        Integer project1[] = {1, 1, 1, 1, 1};
        int timeOfProject1 = 3;
        System.out.println("Результат - " + checkProfit(project1, timeOfProject1));
        Integer project2[] = {11, 2};
        Arrays.sort(project2, Collections.reverseOrder());
        int timeOfProject2 = 4;
        System.out.println("Результат - " + checkProfit(project2, timeOfProject2));
        Integer project3[] = {8, 2, 9, 17, 4, 4, 10};
        int timeOfProject3 = 4;
        System.out.println("Результат - " + checkProfit(project3, timeOfProject3));
    }

    private static int checkProfit(Integer[] arr, int time) {
        int res = 0;
        int upTo;
        Arrays.sort(arr, Collections.reverseOrder());
        if (arr.length < time) {
            upTo = arr.length;
        } else {
            upTo = time;
        }

        for (int i = 0; i < upTo; i++) {
            res += arr[i];
            System.out.print(arr[i] + ", ");
        }

        return res;
    }

}
