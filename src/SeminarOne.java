import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class SeminarOne {
    static Random r = new Random();
    public static void checkSum(int a, int b){


        boolean isBetween = a + b >= 10 && a + b <= 10 ? true : false;
        System.out.println(isBetween);
    }
    public static void printString(int a, String b){
        System.out.printf("string %s will be printed %d times\n", b, a);
        for (int i = 0; i <= a; i++) {
            System.out.println(b);
        }
    }

    public static void checkYear(int year){
        boolean isLeap = year % 4 == 0 ? true : false;
        System.out.println(isLeap);
    }
    public static int[] createArray(int len, int init){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = init;
        }
        return arr;
    }
    public static void checkPositive(int val){
        String isPositive = val > 0 ? "Positive" : "Negative"; // is it the string view of true/false, this more understood
        System.out.printf("number %d is %b", val, isPositive);
    }

    public  void findDiagonals(int cols, int rows){
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = r.nextInt(1,10);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int maxInd = arr.length -1;
        System.out.println("Главная: ");
        for (int i = maxInd; i >= 0; i--) {
            System.out.printf(  arr[i][i] + " ");
        }
        System.out.println();

        System.out.println("Побочная: ");
        for (int i = maxInd; i >= 0; i--) {
            System.out.printf( +  arr[i][maxInd - i] + " ");
        }

    }

    public static void findMaxAndMin(int[] array){

        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            else if (array[i] < min) min = array[i];
        }
        System.out.printf("minimal = %d; maximal = %d", min, max);
    }

    public static int[] arrayCreation(int count){
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = r.nextInt(0,100);
        }
        return arr;
    }

    public void replaceIndex(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) array[i] = 1;
            else array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }

    public  void findPrefix(String[] arr){
        if (arr.length ==0) System.out.println("");
        String prefix = arr[0];
        for (var str : arr){
            while (str.indexOf(prefix) != 0){

            prefix = prefix.substring(0, prefix.length() -1);
            if (prefix.isBlank()) System.out.println("");
            }
        }
        System.out.println(prefix);
    }

    public void indexMultiplyByTwo(int size){
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1,10);
            System.out.print( arr[i] + " ");
            if (arr[i] < 6) arr[i] *= 2;
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

}
