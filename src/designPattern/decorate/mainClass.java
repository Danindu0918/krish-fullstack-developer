package designPattern.decorate;

public class mainClass {
    public static void main(String[] args){
        vehicle bus = new busClass();
        vehicle redBus = new redVehicleDecorator(new busClass());

        vehicle redCar = new redVehicleDecorator(new carClass());
        System.out.println("Car with normal body");
        bus.ride();

        System.out.println("\n Bus has a red body");
        redBus.ride();

        System.out.println("\n Car has a red body");
        redCar.ride();
    }
}
