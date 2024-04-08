package company;
//オブジェクトの設定を行う
public class ObjectSample {

    public static void main(String[] args) {

        var salesDepartment = new Department("eigyou", "xx", 1000000);
        Employee sales = new Sales("suzuki", salesDepartment, "kachou", 100);
                
        sales.report();
        sales.report(2);
        sales.joinMeeting();
        
        System.out.println("");
        
        var devDepartment = new Department("kaihatu", "yy", 0);
        var engineer = new Engineer("tanaka", devDepartment, "一般社員", 88,"java");
                
        engineer.report();
        engineer.joinMeeting();
        engineer.developsoftware();
        
        Employee projectManager = new Engineer("佐藤", devDepartment , "PM", 99, "java");
        projectManager.report();
        projectManager.joinMeeting();
        if (projectManager instanceof Engineer) {//developsoftwareメゾットを呼び出す
            
            ((Engineer)projectManager).developsoftware();
            
        }
        
        System.out.println("");
        var parttimeWorker = new parttimeWorker("田邊", salesDepartment);
                
                ((Workable)sales).work();
                ((Workable)engineer).work();
                ((Workable)projectManager).work();
                ((Workable)parttimeWorker).work();
                
    }

}
