package designPattern.abstracts;

public class vehicleFactory extends abstractFactory{
    @Override
    vehicle getVehicle(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("Bus")){
            return new busClass();
        }else if (vehicleType.equalsIgnoreCase("Car")){
            return  new carClass();
        }else if (vehicleType.equalsIgnoreCase("Van")){
            return new vanClass();
        }
        return null;
    }
}
