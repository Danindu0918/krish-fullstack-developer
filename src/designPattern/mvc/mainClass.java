package designPattern.mvc;

public class mainClass {
    public static void main(String[] args){
        employeeClass model = retriveEmployeeDatabase();

        employeeViewer viewer = new employeeViewer();

        employeeController controller = new employeeController(model, viewer);
        controller.updateView();

        controller.setName("Danindu");
        controller.updateView();

    }

    private static employeeClass retriveEmployeeDatabase(){
        employeeClass emp = new employeeClass();
        emp.setName("Gunasekara");
        emp.setAddress("Kalutara");
        emp.setAge(25);
        emp.setTelNo(+94719);
        emp.setJobRoll("Assocciate Engineer");
        emp.setEmpNo(8120933);

        return emp;
    }
}
