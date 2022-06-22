package designPattern.decorate;

public class redVehicleDecorator extends vehicleDecorator {
    public redVehicleDecorator(vehicle decoratedVehicle) {
        super(decoratedVehicle);
    }

    @Override
    public void ride() {
        decoratedVehicle.ride();
        setRedBody(decoratedVehicle);
    }

    private void setRedBody(vehicle decoratedVehicle){
        System.out.println("Body Color : Red");
    }
}
