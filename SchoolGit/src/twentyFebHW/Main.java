package twentyFebHW;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Task t = new Task();
//        int n = 5;
//        int arr[] = t.firstTask(n, 1, 2);
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]);
//        }
//        System.out.println();
//        t.secondTask(5);
//        t.fourthTask(10);
//        t.sixthTask(121);
//        t.fiveTask(5);
        t.seventhTask(20);
        System.out.println();
        t.eightyTask(20);
    }
}
class Task{
    int[] firstTask(int n, int fir, int del){
        int arr[] = new int[n];
        arr[0] = fir;
        for (int i = 1; i < arr.length; i++){
            arr[i] += del + arr[i-1];
        }
        return arr;
    }

    void secondTask(int n){
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2;
        }

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) Math.pow(arr[i], i + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    void fourthTask(int n){
        String []arr = new String[n];
        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            arr[i] = Integer.toString(j);
        }
        List list = Arrays.asList(arr);
        Collections.shuffle(list);
        System.out.println(list);

    }

    int randomInt(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

    void sixthTask(int n){
        int []arr = new int [n];
        int countOfEvenNum = 0;
        int countOfOddNum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomInt(20,100);
            if (arr[i] % 2 == 0){
                countOfEvenNum += arr[i];
            }
            else{
                countOfOddNum += arr[i];
            }
        }
        System.out.println(countOfEvenNum + " " + countOfOddNum);
    }

    void fiveTask(int n){
        String []arr = new String[n];
        arr[0] = "5";

        for (int i = 1; i < arr.length; i++) {
            arr[i] = Integer.toString(i);
        }

        List list = Arrays.asList(arr);
        Collections.shuffle(list);
        System.out.println(list);

    }

    void seventhTask(int n){
        int []arr = new int[n];
        int count = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomInt(1000,2000);
            temp = (arr[i] % 100) / 10;

            if (temp % 2 == 0){
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(count);
    }

    void eightyTask(int n){
        int []arr = new int[n];
        int count = 0;
        int countOver = 0;
        int sum = 0;
        int sumOver = 0;
        double avr = 0;
        double avrOver = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomInt(0, 100);
            if (arr[i] < 50){
                count++;
                sum += arr[i];
            }
            else{
                countOver++;
                sumOver += arr[i];
            }
        }

        avr = sum / count;
        avrOver = sumOver / countOver;

        List list = new ArrayList<>();

        System.out.println(avr);
        System.out.println(avrOver);
        String [] tempArr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = Integer.toString(arr[i]);

        }

        list = Arrays.asList(tempArr);
        System.out.println(list);


    }
}