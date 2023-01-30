package homeWorkExam;


public class Task {
    public void firstTask(int n){
        int count = 0;
        int temp = 0;
        for (int i = 1; i <= 200; i++){
            count = 0;
            for(int j = 1; j <= 200; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if (count == n){
                System.out.println(i);
            }
        }
    }

    public void secondTask(){
        for (int x = 0; x < 100; x++){
            for (int y = 0; y < 100; y++){
                for (int z = 0; z < 100; z++){
                    if (x*x - y == z*z){
                        System.out.println(x + " " + y + " " + z);
                    }
                }
            }
        }
    }

    public void thirstTask(){
        for (int i = 999; i < 9999; i++){
            if (i % 133 == 125 && i % 134 == 111){
                System.out.println(i);
            }
        }
    }

    public void fourthTask(int a){
        int temp = a;
        int secondTemp = 0;
        int reversed = 0;

        while(a > 0){
            secondTemp = a % 10;
            reversed = reversed * 10 + secondTemp;
            a /= 10;
        }

        if (temp == reversed){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }

    public void fiveTaskMin(){
        for (int i = 1; i < 1000; i++) {
            int l = 0, m = 0, x = i;
            while (x > 0) {
                l = l + 1;
                m = m + x % 10;
                x = x / 10;
            }
            if (l == 3 && m == 6){
                System.out.println(i);
                break;
            }
        }
    }
    public void fiveTaskMax(){
        for (int i = 600; i < 1000; i++) {
            int l = 0, m = 0, x = i;
            while (x > 0) {
                l = l + 1;
                m = m + x % 10;
                x = x / 10;
            }
            if (l == 3 && m == 6){
                System.out.println(i);
                break;
            }
        }
    }
}
