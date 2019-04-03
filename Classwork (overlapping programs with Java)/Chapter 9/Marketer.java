public class Marketer extends Employee{

    public Marketer(){
        this("");
    }

    public Marketer(String name){
        super(name);
    }
    
    public double getSalary(){
        return super.getSalary() + 10000.0;
    }
    
    public void advertise()
    { 
        System.out.println("Act now, while supplies last!"); 
    } 
}