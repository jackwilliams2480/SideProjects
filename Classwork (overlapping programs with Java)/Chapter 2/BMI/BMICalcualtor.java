public class BMICalcualtor{
    public static void main(){
     //delcare variables
     double height;
     double weight;        
     double bmi; 
     
     //compute bmi
     height = 70;
     weight = 195;
     bmi = weight / (height * height) * 703;
     
     //print results
     System.out.println("Current BMI:");
     System.out.println(bmi);     
    }
}