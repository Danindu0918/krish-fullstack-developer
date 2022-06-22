package designPattern.decorate;

public class carClass implements vehicle {
    @Override
    public void ride() {
        System.out.println("Vehicle : Car");
    }
}
