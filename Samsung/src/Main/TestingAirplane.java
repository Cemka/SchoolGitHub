package Main;

public class TestingAirplane {
    public static void main(String[] args){
        Airplane airplane = new Airplane();
        Airplane.Fly fly = airplane.new Fly();

        airplane.setCountOfPassengers(300);
        System.out.println(airplane.getCountOfPassengers() + "\n");
        fly.enableEngine();
        fly.disableEngine();System.out.println();
        airplane.fatalError();System.out.println();
        fly.disableEngine();
        airplane.fatalError();System.out.println();
        airplane.resetErrorOfEngine();
        airplane.setCountOfPassengers(500);
        airplane.fatalError();

    }
}
