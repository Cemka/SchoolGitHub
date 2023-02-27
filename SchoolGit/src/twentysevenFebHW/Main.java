package twentysevenFebHW;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Task t = new Task();

        int []arr = {2,2,4,8,-2,4};
        int []arrSec = {-1,-2,-4};

        int []arrR = new int[10];
        for (int i = 0; i < arrR.length; i++) {
            arrR[i] = t.randomInt(1,100);
        }

        System.out.println(Arrays.toString(arrR));
        t.firstTask(arrR);
        t.thirdTask(arrR);
        System.out.println(t.min(arrR));
        System.out.println(t.max(arrR));
        System.out.println(t.gcdArray(arrR));
        System.out.println(t.countOfEnumNum(arrR));



    }
}

class Task{
    void firstTask(int []arr){
        int min = 999999999;
        int max = arr[0];
        int nothing = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max && arr[i] % 2 == 0 && arr[i] > 0){
                max = arr[i];
                nothing++;
            }
            if (arr[i] < min && arr[i] % 2 == 0 && arr[i] > 0){
                min = arr[i];
                nothing++;
            }
        }

        if (nothing > 0){
            System.out.println(min);
            System.out.println(max);
        }
        else
            System.out.println("In this array aren't enum and pol elements");
    }

    void thirdTask(int []arr){
        Arrays.sort(arr);

        System.out.println(arr[0] + "," + arr[1] + "," + arr[2]);
    }

    int max(int []arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    int min(int []arr){
        int min = 99999999;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

    int gcd(int a, int b){
        int count = 0;

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    int gcdArray(int []arr){
        int temp = gcd(arr[0], arr[1]);

        for (int i = 0; i < arr.length; i++) {
            temp = gcd(temp, arr[i]);
        }

        return temp;
    }

    int randomInt(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

    int countOfEnumNum(int []arr){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                count++;
            }
        }

        return count;
    }


}


