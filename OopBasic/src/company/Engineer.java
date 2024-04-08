package company;
//エンジニアが持つフィールド、コンストラクター、メソッドの定義を行う
public class Engineer extends Employee {
    
    String programmingLanguage;
    
    public Engineer(String name,Department department,String position
            ,int employeeId,String programmingLanguage ) {
        super(name,department,position, employeeId);//クラスの継承
        this.programmingLanguage = programmingLanguage;
    }

    public void developsoftware() {
        System.out.println("ソフトウェアの開発するよ。名前："+name+"プログラム言語"+programmingLanguage);
    }
    @Override//オーバーライド
    public void joinMeeting() {
        department.meeting();
        System.out.println("技術的な準備を行い、上記の会議に参加。名前："+name);
    }
}
