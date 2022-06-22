package designPattern.mvc;

public class employeeViewer {
    public void printEmployeeDetails(String name, String address, Integer age, Integer telNo, String jobRoll, Integer empNo){
        System.out.println("Employee :");
        System.out.println("Name :" + name);
        System.out.println("Address :" + address);
        System.out.println("AGe :" + age);
        System.out.println("Telephone No :" + telNo);
        System.out.println("Job Roll :" + jobRoll);
        System.out.println("Employee No :" + empNo);
    }
}
