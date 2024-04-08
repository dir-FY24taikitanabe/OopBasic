package company;

public class parttimeWorker implements Workable {
    protected final String name;
    private final Department department;
    
    public parttimeWorker(String name,Department department ) {
        
        this.name =name;
        this.department = department;
    }
    
    @Override
    public void work() {
        System.out.println("アルバイトで働くよ。名前："+name+slogan);
    }
        


}
