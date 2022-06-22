package designPattern.decorate;

public abstract class vehicleDecorator implements vehicle {
    protected vehicle decoratedVehicle;

    public vehicleDecorator(vehicle decoratedVehicle){
        this.decoratedVehicle = decoratedVehicle;
    }

    public void ride(){
        decoratedVehicle.ride();
    }
}
