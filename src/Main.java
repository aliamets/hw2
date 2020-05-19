import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Main {
    static Random random;

    public static void main(String[] args) {
//Задание №1
        /*System.out.println("Задание №1");
        random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 0){
                arr[i] =1;
            }else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));*/
//Задание №2
      /*  System.out.println("Задание №2");
        int[] arr1 = new int[8];
        int x = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 3;
            System.out.printf("%4d", arr1[i]);
        }*/
//Задание №3
      /*  System.out.println("Задание №3");
        int[] arr = new int[]{1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] < 6){
                arr[i] *= 2;
            }
           }
        System.out.println(Arrays.toString(arr));*/

//Задание №4

       /* System.out.println("Задание №4");
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i + j == arr.length - 1) {
                    arr[i][j] = 1;
                    System.out.printf("%4d", arr[i][j]);
                } else {
                    arr[i][j] = 0;
                    System.out.printf("%4d", (arr[i][j]));
                }
            }
            System.out.println();*/


        //Задание №5
      /*  System.out.println("Задание №5*");
        int[] arr = new int[]{61, 48, 20, 28, 39, 51};
        int min = arr [0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);*/
//Задание 6**

        /*int[] arr = new int[]{3, 1, 1, 2, 1};
        boolean result = splittableArray(arr);
        System.out.println(result);*/
    }

   /* public static boolean splittableArray(int[] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        if (summ % 2 == 1) {
            return false;
        }
        int halfSumm = (summ / 2);
        int summ2 = 0;
        for (int i = 0; i < arr.length; i++) {
            summ2 += arr[i];
            if (halfSumm == summ2) {
                return true;
            } else if (summ2 > halfSumm) {
                return false;
            }
        }
        return false;
    }*/

}

