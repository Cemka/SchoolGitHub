import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SchoolTasks schoolTasks = new SchoolTasks();
//        double pFirst = in.nextDouble();
//        double pSecond = in.nextDouble();
//        SchoolTasks.Ski(pFirst);
//        SchoolTasks.Bank(pSecond);
//        System.out.println();
        int a = in.nextInt();
        int b = in.nextInt();
        schoolTasks.randomFive(a,b);
    }

}