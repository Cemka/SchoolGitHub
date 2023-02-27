package mcko;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        int temp = Integer.parseInt(task(n), 2);
        while(temp < 53){
            temp = Integer.parseInt(task(n), 2);
            n++;
            System.out.println(temp);
            System.out.println(n);
        }

//        long tem = 0;
//        int count = 0;
//        long temper = 333333;
//        while (temper > 0){
//            tem = temper % 10;
//            temper /= 10;
//            if (tem == 3){
//                count++;
//            }
//        }
//        System.out.println(count);





    }

    static String task(int n){
        String temp = Integer.toBinaryString(n);
        int countOne = 0;
        int tempNum = 0;

        if(n % 2 == 0){
//            System.out.println(temp);
            temp = temp + 10;
//            System.out.println(temp + "after");
        }
        else {
//            System.out.println(temp + "odd");
            temp = temp + 11;
//            System.out.println(temp + "after");
        }

        int tempInt = Integer.parseInt(temp);

        while(tempInt > 0){
            tempNum = tempInt % 10;
            tempInt /= 10;
            if(tempNum == 1){
                countOne++;
            }
        }

        if (countOne % 2 == 0){
            temp += 0;
        }
        else
            temp += 1;

        return temp;
    }

    static String taskSec(){
        long temp =  (long) (Math.pow(16,23) + Math.pow(4,12) - Math.pow(32,6));
        return Long.toString(temp, 4);
    }
}

