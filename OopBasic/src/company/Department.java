package company;

public class Department {

    private final String name;
    private final String departmentId;
    private int budget;
    
    
    public Department(String name, String departmentId, int budget) {
        this.name =name;
        this.departmentId = departmentId;
        this.budget = budget;
    }
    
    public void meeting() {
        
        System.out.println("部内会議開催するよ。部署："+name +"予算"+budget);;
    }
    public String getname() {
        return name;
    }
    public double getBudget() {
        return budget;
       
    }
    
    public void setBudget(int budget) {
        if (budget<0) {
            throw new IllegalArgumentException("予算はまいなすにできないよ");
                    
        }
        this.budget = budget; 
    }
}

