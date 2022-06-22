package designPattern.abstracts;

//AbstractFactory Design Pattern

public class mainClass {
    public static void main(String[] args){
        abstractFactory vehicleFactory = factroryProducer.getFactory(false);

        vehicle vehicle1 = vehicleFactory.getVehicle("Bus");
        vehicle1.ride();

        vehicle vehicle2 = vehicleFactory.getVehicle("Car");
        vehicle2.ride();

        vehicle vehicle3 = vehicleFactory.getVehicle("Van");
        vehicle3.ride();

        abstractFactory vehicleFactory1 = factroryProducer.getFactory(true);

        vehicle vehicle4 = vehicleFactory1.getVehicle("Bus");
        vehicle4.ride();

        vehicle vehicle5 = vehicleFactory1.getVehicle("Car");
        vehicle5.ride();

        vehicle vehicle6 = vehicleFactory1.getVehicle("Van");
        vehicle6.ride();
    }
}
