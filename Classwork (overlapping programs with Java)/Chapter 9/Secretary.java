public class Secretary extends Employee 
{ 

    public Secretary(){
        this("");
    }
    
    public Secretary(String name){
         super(name);
    }
    
    public void takeDictation(String text)
    { 
        System.out.println("Dictating text: " + text); 
    } 
}  
