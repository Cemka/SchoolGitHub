import java.util.Scanner;

public class SchoolTasks {
    public static void Ski(Double p){
        double sumLen = 10, lenAll = 10;
        int count = 1;
        while (sumLen < 200){
            lenAll = lenAll + (lenAll * (p / 100));
            sumLen += lenAll;
            count++;
        }
        System.out.println("K = " + count);
        String tempSumLen = String.format("%.2f", sumLen);
        System.out.println("S = " + tempSumLen);
    }

    public static void Bank(Double p){
        int count = 0;
        double sum = 1000;
        while (sum < 1100){
            sum = sum + (sum * (p / 100));
            count++;
        }
        System.out.println();
        System.out.println("K = " + count);
        String tempSum = String.format("%.2f", sum);
        System.out.println("S = " + tempSum);
    }

    public int randomInt(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

    public double randomDouble(double min, int max){
        double x = (Math.random()*((max-min)+1))+min;
        return x;
    }

    public void randomFive(int a, int b){
        if (a > b){
            System.out.println("Введите коректное число");

        }
        else {
            for (int i = 0; i < 5; i++) {
                System.out.println(randomInt(a, b));
            }
        }
    }

}