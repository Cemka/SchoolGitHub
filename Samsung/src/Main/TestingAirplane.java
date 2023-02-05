package Main;

public class TestingAirplane {
    public static void main(String[] args){
        Airplane airplane = new Airplane();
        Airplane.Fly fly = airplane.new Fly();

        airplane.setCountOfPassengers(300);
        System.out.println(airplane.getCountOfPassengers());
        fly.enableEngine();
        fly.disableEngine();
        airplane.fatalError();
        fly.disableEngine();
        airplane.fatalError();
        System.out.println(airplane.getCountOfTryingEngine());
    }
}
