package nineteentnFebHW;

public class Main {
    public static void main(String[] args){
        Task t = new Task();
        t.numOfDev(8);
        System.out.println(t.nIsCube(8));

    }
}

class Task{
    void numOfDev(int n){
        int count = 1;
        for(int i = 1; i < n; i++){
            if (n % i == 0){
                count++;
            }
        }
        System.out.println(count);
    }

    boolean nIsCube(int n){
        double cqrtN = Math.cbrt(n);
        int cqrtNInt = (int) Math.cbrt(n);
        if (cqrtN == cqrtNInt){
            return true;
        }
        else
            return false;
    }

}
