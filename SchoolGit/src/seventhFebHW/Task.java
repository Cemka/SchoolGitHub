package seventhFebHW;

public class Task {
    public static boolean nDivFiveAndNoDivThree(int n){
        if (n % 5 == 0 && n % 3 != 0){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args){
        System.out.println(nDivFiveAndNoDivThree(5));
    }
}
