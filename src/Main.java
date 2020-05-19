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
    }
}


//Находим сумму элементов массива
//делим ее на 2
//если делится с остатком, - фолс
//если делится без отстатка, значит бежим по массиву с начала и
//        накапливаем новую сумму и сравниваем с половиной уже полученой суммы(halfSumm)
//если оно будет равно, - тру
//если наколенная сумма больше, фолс.

//{1,2,3,4,5,6}
//        {3,4,5,6,1,2} - 2 смещение
//{5,6,1,2,3,4} +2 смещение
//
//смотрим какое смещение, если отрицательное, дпустим -2, это значит
//что новый массив мы длолжны заполнять со 2го индекса исходного массива
//мы бежим со 2го элемента до конца массива, и добавляем элементы в новый массив.
//далее мы бежим с 0 элемента до 2го и добавляем эти же элементы в новый миассив
//добавляем элементы с помощью пуша.