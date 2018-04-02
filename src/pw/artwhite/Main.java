package pw.artwhite;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by artwhite on 20/01/2018.
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите длинну массива - ");
        int countOfLines = sc.nextInt();
        String numberLine = "";
        for (int i = 0; i < countOfLines; i++){
            System.out.print("Введите через запятую оплату за задачу - ");
            numberLine = sc.next();
            String[] project = numberLine.split("\\s*,\\s*");
            System.out.print("Сколько можем выполнить? - ");
            int timeOfProject = sc.nextInt();
            int maxProfit = checkProfit(project, timeOfProject);
            System.out.println("Результат - " + maxProfit);
        }
    }

    private static int checkProfit(String[] arr, int time) {
        int res = 0;
        int upTo;
        Arrays.sort(arr, Collections.reverseOrder());
        if (arr.length < time) {
            upTo = arr.length;
        } else {
            upTo = time;
        }

        for (int i = 0; i < upTo; i++) {
            res += Integer.parseInt(arr[i]);
            System.out.print(arr[i] + ", ");
        }

        return res;
    }

}
