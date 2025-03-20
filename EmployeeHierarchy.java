class Employee{
    protected String name;
    protected String address;
    protected double salary;
    protected String jobtitle;

    public Employee(String name, String address, double salary, String jobtitle){
        this.name=name;
        this.address=address;
        this.salary=salary;
        this.jobtitle=jobtitle;
    }
    public double CalculateBonus(){
        return salary*0.10;
    }
    public void GenerateReport(){
        System.out.println("Employee:"+name);
        System.out.println("Job Title:"+jobtitle);
        System.out.println("Salary:"+salary);
        System.out.println("Bonus Claim:"+CalculateBonus());
    }
}
class Manager extends Employee{
    private int numProjects;
    public Manager(String name, String address, double salary, int numProjects){
        super(name, address, salary, "Manager");
        this.numProjects=numProjects;
    }
    @Override public double CalculateBonus(){
        return salary * 0.15;
    }
    public void ManageProjects(){
        System.out.println(name+" is managing "+numProjects+" projects.");
    }
}
class Developer extends Employee{
    private String techstack;
    public Developer(String name, String address, double salary, String techstack){
        super(name, address, salary, "Developer");
        this.techstack=techstack;
    }
    @Override public double CalculateBonus(){
        return salary * 0.12;
    }
    public void WorkonProject(){
        System.out.println(name+" is working on a project using "+techstack+".");
    }
}
class Programmer extends Employee{
    private int CodeWritten;
    public Programmer(String name, String address, double salary,int CodeWritten){
        super(name, address, salary, "Programmer");
        this.CodeWritten=CodeWritten;
    }

    @Override
    public double CalculateBonus() {
        return salary * 0.10;
    }
    public void DebugCode(){
        System.out.println(name+" is debugging "+CodeWritten+" lines of code.");
    }
}
public class EmployeeHierarchy{
    public static void main(String[] args) {
        Manager mgr=new Manager("Anshita", "Pune",80000,5);
        Developer dev=new Developer("Yash","satara",60000,"Java,Python");
        Programmer pro=new Programmer("Riya","delhi",50000, 10000);
        System.out.println("----------Employee Reports----------");
        mgr.GenerateReport();
        mgr.ManageProjects();
        System.out.println("------------------------------------");
        dev.GenerateReport();
        dev.WorkonProject();
        System.out.println("------------------------------------");
        pro.GenerateReport();
        pro.DebugCode();
    }
}
