public class Lawyer extends Employee
{
    public Lawyer(){
        this("");
    }

    public Lawyer(String name){
        super(name);
    }
    
    // overrides getVacationDays from Employee class 
    public int getVacationDays()
    { 
        return 15; 
    } 

    // overrides getVacationForm from Employee class 
    public String getVacationForm() 
    { 
        return "pink"; 
    }

    public void sue()
    { 
        System.out.println("I'll see you in court!"); 
    } 

}
