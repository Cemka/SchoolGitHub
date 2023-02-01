package firstFeb;


import java.util.Scanner;

public class Main {
    static String intToOctal;
    static int octalToInt;
    static String intToHex;
    static int hexToInt;

    static int octal = 8;
    static int hex = 16;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tasks tasks = new Tasks();

        System.out.println(tasks.countOfNum(123));
        System.out.println(tasks.som(10, 15));

        intToOctal = Integer.toOctalString(123);
        System.out.println(intToOctal);
        octalToInt = Integer.parseInt(intToOctal, octal);
        System.out.println(octalToInt);

        intToHex = Integer.toHexString(123);
        System.out.println(intToHex);
        hexToInt = Integer.parseInt(intToOctal, hex);
        System.out.println(hexToInt);

    }
}

class Tasks {
    int countOfNum(int a){
        int count = 0;
        while (a > 0){
            a /= 10;
            count++;
        }
        return count;
    }

    int som (int a, int b){
        int temp = 0;
        for (int i = 1; true; i++){
            if (i % a == 0 && i % b == 0){
                temp = i;
                break;
            }
        }
        return temp;
    }
}

