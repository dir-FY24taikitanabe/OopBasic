package company;

public abstract class Employee implements Workable {

    //フィールド
    protected final String name;
    protected final Department department;
    private final String position;
    protected int employeeId;
    //コンストラクター
    public Employee(String name, Department department, String position, int employeeId )
    {
        this.name = name ;
        this.department = department;
        this.position = position;
        this.employeeId =  employeeId;
        
       
    }
    //報告メソッド
        public void report(int times) {
            
            System.out.println(times+ "回目の報告をする。役職" +position+ "名前" +name);
                    
        }
        
        public void report() {
            report(1);
            
        }
    //kaigi
        public abstract void joinMeeting();
      
        //hatarakuyo
        @Override
        public void work() {
            System.out.println("正社員として働くよ。名前："+name +slogan);
        }
}
