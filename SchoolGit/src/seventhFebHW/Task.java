package seventhFebHW;

public class Task {
    public boolean nDivFiveAndNoDivThree(int n){
        if (n % 5 == 0 && n % 3 != 0){
            return true;
        }
        else
            return false;
    }
}
class Main{
    public static void main(String[] args){
        Task t = new Task();
        System.out.println(t.nDivFiveAndNoDivThree(125));
    }
}
