package Main;

public class Airplane {
    static int engines = 4;
    static String planeName = "Ilyushin-96";
    private int countOfPassengers;
    static int maxCountOfPassengers = 400;

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    Fly f = new Fly();

    public int getCountOfTryingEngine() {
        return f.getCountOfTryingEngine();
    }

    public class Fly{
        int percentOfPower;
        double height;
        public int countOfTryingEngine;

        void enableEngine(){
            System.out.println("Engines are starting");
        }

        void disableEngine(){
            System.out.println("Engines has disabled");
            countOfTryingEngine++;
        }

        void setPercentOfPower(int percentOfPower){
            this.percentOfPower = percentOfPower;
        }

        int getPercentOfPower(){
            return percentOfPower;
        }

        void setHeight(double height){
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public int getCountOfTryingEngine(){
            return  this.countOfTryingEngine;
        }


    }

    public void fatalError(){
        class Errors{
            void checkProblemWithEngine(){
                if (getCountOfTryingEngine() > 1){
                    System.out.println("Engines are OK");
                }
                else
                    System.out.println("It's trouble with engines");
            }

            void checkProblemWithCountOfPassengers(){
                if (getCountOfPassengers() > maxCountOfPassengers){
                    System.out.println("It's overload");
                }
                else
                    System.out.println("It's all OK with passengers");
            }
        }
        Errors errors = new Errors();
        errors.checkProblemWithCountOfPassengers();
        errors.checkProblemWithEngine();
    }



}