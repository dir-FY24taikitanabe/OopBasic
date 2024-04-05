package company;

public class ObjectSample {

    public static void main(String[] args) {

        var department = new Department("eigyou", "xx", 1000000);
        var employee = new Employee("suzuki", department, "kachou", 100);
                
        employee.report();
        employee.report(2);
        employee.joinMeeting();
        
        System.out.println("");
        
        var devDepartment = new Department("kaihatu", "yy", 0);
        var engineer = new Employee("tanaka", devDepartment, "ipann shainn", 88);
                
        engineer.report();
        engineer.joinMeeting();
                
    }

}
