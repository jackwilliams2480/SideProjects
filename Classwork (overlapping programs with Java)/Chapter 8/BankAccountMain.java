public class BankAccountMain{

    public static void main(){
        BankAccount ben = new BankAccount();
        ben.name = "ben";
        ben.deposit(80.00);
        BankAccount hal = new BankAccount();
        hal.name = "hal";
        hal.deposit(20.00);
        ben.transfer(hal, 20.00);
        //final values
        System.out.println(ben.toString());
        System.out.println(hal.toString());

        ben.transfer(hal, 10.00);
        //final values
        System.out.println(ben.toString());
        System.out.println(hal.toString());

        hal.transfer(ben, 60.00);
        //final values
        System.out.println(ben.toString());
        System.out.println(hal.toString());

    }

}