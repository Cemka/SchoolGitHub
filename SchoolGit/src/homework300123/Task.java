package homework300123;

public class Task {
    public int gcdFirst(int a, int b){
        int count = 0;
        if (b == 0) {
            return a;
        }
        return gcdFirst(b, a % b);
    }

    void twentyTwo(int arr[]){
        int sum = 0;
        int equal = 1;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            equal *= arr[i];
        }
        System.out.println(sum + " " + equal);
    }

    long fact(int n){
        int i = 0;
        long fact = 1;
        while (i != n){
            i++;
            fact *= i;
        }
        return fact;
    }

}
