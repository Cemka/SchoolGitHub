package twentysevenFebKW;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task t = new Task();
        int []arr = new int[10];
        int k = 2;
        int m = 4;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = t.randomInt(1,20);
        }

        System.out.println(Arrays.toString(arr));
        t.seventh(arr);
        t.eight(arr, k, m);

    }

}

class Task{
    
    int[] reverse(int []arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
        return arr;
    }

    int randomInt(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

    void seventh(int []arr){
        int len = arr.length;

        int []tempFir = Arrays.copyOfRange(arr, 0, len / 2);
        int []tempSec = Arrays.copyOfRange(arr, len / 2, len);


        System.out.println(Arrays.toString(reverse(tempFir)));
        System.out.println(Arrays.toString(reverse(tempSec)));
    }

    void eight(int []arr, int k, int m){
        int []temp = Arrays.copyOfRange(arr, k, m);

        System.out.println(Arrays.toString(reverse(temp)));
    }
}
