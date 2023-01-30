package complexConditions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        Tasks tasks = new Tasks(x,y);
        tasks.pointIsBelongingB();
        tasks.pointIsBelongingG();
        tasks.pointIsBelongingSecondBFirst();
    }
}
