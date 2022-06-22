package designPattern.mvc;

public class employeeController {
    private employeeClass model;
    private employeeViewer view;

    public employeeController(employeeClass model, employeeViewer view) {
        this.model = model;
        this.view = view;
    }

    public void setName(String name){
        model.setName(name);
    }

    public void setAddress(String address){
        model.setAddress(address);
    }

    public void setAge(Integer age){
        model.setAge(age);
    }

    public void setTelNo(Integer telNo){
        model.setTelNo(telNo);
    }

    public void setJobRoll(String jobRoll){
        model.setJobRoll(jobRoll);
    }

    public void setEmpNo(Integer empNo){
        model.setEmpNo(empNo);
    }

    public void getName(){
        model.getName();
    }

    public void getAddress(){
        model.getAddress();
    }

    public void getAge(){
        model.getAge();
    }

    public void getTelNo(){
        model.getTelNo();
    }

    public void getJobRoll(){
        model.getJobRoll();
    }

    public void getEmpNo(){
        model.getEmpNo();
    }

    public void updateView(){
        view.printEmployeeDetails(model.getName(),
                model.getAddress(),
                model.getAge(),
                model.getTelNo(),
                model.getJobRoll(),
                model.getEmpNo());
    }
}
