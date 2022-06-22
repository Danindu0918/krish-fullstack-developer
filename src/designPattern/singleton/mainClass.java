package designPattern.singleton;

//Singleton Design Pattern

public class mainClass {
    public static void main(String[] args){
        singleObject object = singleObject.getInstance();

        object.showMessage();

    }
}
