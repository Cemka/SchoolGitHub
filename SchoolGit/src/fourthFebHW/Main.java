package fourthFebHW;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tasks t= new Tasks();

        t.lenOfLine(1,2,4,4);
    }
}

class Tasks {
    void lenOfLine(int x, int y, int x1, int y1){
        double sqrX = Math.pow(x1 - x, 2);
        double sqrY = Math.pow(y1 - y, 2);
        double sumOfSqr = sqrX + sqrY;
        System.out.println(Math.sqrt(sumOfSqr));
    }

}

