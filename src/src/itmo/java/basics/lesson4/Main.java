package src.itmo.java.basics.lesson4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[]{3,-3,7,4,5,4,3};

        // 1 Часть
        oddNuber();

        division();

        if(sum(in) == true){
            System.out.println("Результат: true");
        }else{
            System.out.println("Результат: false");
        }

        if(moreLess(in) == true){
            System.out.println("Результат: true");
        }else {
            System.out.println("Результат: false");
        }

        if(firstRLastNumberContains(arr) == true) {
            System.out.println("true.");
        }else{
            System.out.println("false.");
        }
        finding(arr);



        int[] array = new int[]{1,2,3,4,5,6,7,8};
        int[] arrChange = new int[]{5,6,7,2};
        int[] uniqe = new int[]{1,5,2,3,0,2,4,3,5,7,4,8};

        sorted(array);

        arrayInput(in);

        firstNLastNumberChange(arrChange);

        uniqArray(uniqe);

        randomArray();

    }

    public static void oddNuber(){
        for( int i = 1; i < 101;i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
    public static void division(){
        for( int i = 1; i < 101;i++){
            if(i % 3 == 0){
                System.out.println("Делится на 3: " + i);
            }
            if(i % 5 == 0){
                System.out.println("Делится на 5: " + i);
            }
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Делится и на 3 и на 5: " + i);
            }

        }
    }
    public static boolean sum(Scanner in){

        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.println("Введите третье число: ");
        int sum = in.nextInt();

        if(num1 + num2 == sum){
            return true;
        }
        return false;
    }
    public static boolean moreLess(Scanner in){

        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.println("Введите третье число: ");
        int num3 = in.nextInt();

        if(num1 < num2 && num2 < num3){
            return true;
        }
        return false;
    }
    public static boolean firstRLastNumberContains(int[] arr){

        System.out.println("Массив: " + Arrays.toString(arr));
        if(arr[0] == 3 || arr[arr.length-1]==3){
            return true;
        }
        return false;
    }
    public static void finding(int[] arr){
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == 1 || arr[i] == 3){
                System.out.println("Массив содержит число - " + arr[i]);
            }
        }
    }
    public static void sorted(int[] arr){
        System.out.println("Массив: " + Arrays.toString(arr));
        boolean status = true;
        for(int i = 0 ; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                status = false;
                break;
            }
        }
        if(status == true){
            System.out.println("OK");
        }else{
            System.out.println("Please, try again");
        }
    }

    public static void arrayInput(Scanner in){
        System.out.println("Array length: ");
        int arrLen = in.nextInt();
        int[] ints = new int[arrLen];
        for(int i = 0 ; i < ints.length; i++){
            ints[i] = in.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(ints));

    }
    public static void firstNLastNumberChange(int[] arr){

        System.out.println("Array 1: " + Arrays.toString(arr));
        int[] changedArr = ChangeArray(arr);
        System.out.println("Array 2: " + Arrays.toString(changedArr));
    }

    public static void uniqArray(int[] arr){
        System.out.println("Массив уникальности: " + Arrays.toString(arr));

        for (int i = 0 ; i < arr.length; i++){
            boolean uniq = false;
            for(int j = 0 ; j < arr.length;j++){
                if(arr[i] == arr[j] && i != j){
                    uniq=false;
                    break;
                }
                uniq=true;
            }
            if(uniq == true){
                System.out.println("Уникальное число: " + arr[i]);
                break;
            }
        }
    }
    public static void randomArray(){
        Random random = new Random();
        int[] randArray = new int[10];
        for (int i = 0 ; i < randArray.length;i++){
            randArray[i] = random.nextInt(100);
        }
        System.out.println("Рандомный массив: " + Arrays.toString(randArray));
        int[] result = Sorting(randArray);
        System.out.println(Arrays.toString(result));
    }
    public static int[] ChangeArray(int[] arr){
        int c = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = c;
        return arr;
    }

    public static int[] Sorting(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = new int[mid];

        int[] right;

        if (arr.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + i];
        }

        left = Sorting(left);
        right = Sorting(right);

        return Parts(left, right);


    }

    private static int[] Parts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];

            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }

        return result;
    }
}