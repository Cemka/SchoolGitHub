package twelweFebHW;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tasks t= new Tasks();
        int n = 123;
        int tempNum = 0;
        int count = 0;

        t.countOfEvenNumWithOut(n);
        System.out.println(t.countOfEvenNum(n));

        while (n > 0){
            tempNum = n % 10;
            n /= 10;
            if (tempNum % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

        System.out.println(t.isNotEvenNumInNum(123));

    }
}

class Tasks {
    public void countOfEvenNumWithOut(int n){
        int tempNum = 0;
        int count = 0;

        while (n > 0){
            tempNum = n % 10;
            n /= 10;
            if (tempNum % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }

    public int countOfEvenNum(int n){
        int tempNum = 0;
        int count = 0;

        while (n > 0){
            tempNum = n % 10;
            n /= 10;
            if (tempNum % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public boolean isNotEvenNumInNum(int n) {
        int tempNum = 0;
        int count = 0;


        while (n > 0){
            tempNum = n % 10;
            n /= 10;
            if (tempNum % 2 != 0){
                count++;
            }
        }
        if (count > 0){
            return true;
        }
        else
            return false;

    }
}

