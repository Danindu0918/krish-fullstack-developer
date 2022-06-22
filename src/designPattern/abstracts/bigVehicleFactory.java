package designPattern.abstracts;

public class bigVehicleFactory extends abstractFactory{
    @Override
    vehicle getVehicle(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("Double Bus")){
            return new busClass();
        }else if (vehicleType.equalsIgnoreCase("SUV Car")){
            return  new carClass();
        }else if (vehicleType.equalsIgnoreCase("High roof Van")){
            return new vanClass();
        }
        return null;
    }
}
