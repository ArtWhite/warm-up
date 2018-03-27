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
        int profitOfProject1 = checkProfit(project1, timeOfProject1);
        Integer project2[] = {11, 2};
        Arrays.sort(project2, Collections.reverseOrder());
        int timeOfProject2 = 4;
        int profitOfProject2 = checkProfit(project2, timeOfProject2);
        Integer project3[] = {8, 2, 9, 17, 4, 4, 10};
        int timeOfProject3 = 4;
        int profitOfProject3 = checkProfit(project3, timeOfProject3);

        System.out.println(profitOfProject1);
        System.out.println(profitOfProject2);
        System.out.println(profitOfProject3);

        int[] profits = {profitOfProject1, profitOfProject2, profitOfProject3};

        int maxProfit = checkBestProfit(profits);
        System.out.println("Лучший профит - " + maxProfit + " - " + profits[maxProfit]);
    }

    public static int checkBestProfit(int[] profits) {
        int max = 0;
        int numOfMax = 0;
        for (int i = 0; i < profits.length; i++){
            if(max < profits[i]){
                max = profits[i];
                numOfMax = i;
                System.out.println("Профит " + i + " - " + profits[i]);
            }
        }
        return numOfMax;
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
            System.out.println(arr[i]);
        }
        return res;
    }

}
