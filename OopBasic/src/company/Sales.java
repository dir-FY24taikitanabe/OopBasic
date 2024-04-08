package company;

public class Sales extends Employee {
    
    public Sales(String name,Department department,String position,int employeeId) {
        super(name,department,position,employeeId);
    }
    @Override
    public void joinMeeting() {
        department.meeting();
        System.out.println("営業として、上記の会議に出席するよ。部署："+ department.getname()+"名前："+name);
    }
}
