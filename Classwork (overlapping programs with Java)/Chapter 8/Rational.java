import java.util.*;
public class Rational {
    private int numerator;
    private int denominator;
    public Rational() {
        this(0,1);
    }
 
    public Rational(int numerator, int denominator) {
        if(denominator==0) {
            throw new IllegalArgumentException("Denominator cannot equal 0!");
        }
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public String toString() {

        if(this.denominator==1) {
            return ""+this.numerator;
        }else if(this.denominator==-1) {
            return""+ (-this.numerator);
        }

        return (this.numerator + "/" +this.denominator);
    }

    public void GCF() {
        int gcf=1;
        boolean negative=false;
        if(this.numerator<0&&this.denominator>0||this.denominator<0&&numerator>0){
            negative=true;
        }
        this.numerator=Math.abs(this.numerator);
        this.denominator=Math.abs(this.denominator);
        System.out.println(negative);
        for(int i=2;i<=this.numerator;i++){
            if(this.numerator%i==0){
                for(int j=2;j<=this.denominator;j++){
                    if(this.denominator%j==0){
                        if(j==i){
                            gcf=j;

                        }
                    }
                }
            }
        }  
        this.numerator/=gcf;
        this.denominator/=gcf;
        if(negative==true){
            this.numerator*=-1;
        }
    }
 
    public Rational multiply(Rational r)  {
        this.numerator *= r.numerator;
        this.denominator *= r.denominator;
        this.GCF();
        return new Rational(this.numerator,this.denominator);
    }

    public Rational divide(Rational r)  {
        if (this.denominator * r.numerator == 0)  {
            throw new IllegalArgumentException();
        }

        this.numerator *= r.denominator;
        this.denominator *= r.numerator;
        this.GCF();
        return new Rational(this.numerator,this.denominator);
    }

    public Rational add(Rational r)  {
        this.numerator = (this.numerator*r.denominator) + (this.denominator*r.numerator);
        this.denominator =(this.denominator*r.denominator);
        this.GCF();
        return new Rational(this.numerator,this.denominator);
    }
    

    public Rational subtract(Rational r)  {
        this.numerator = (this.numerator*r.denominator) - (this.denominator*r.numerator);
        this.denominator =(this.denominator*r.denominator);
        this.GCF();
        return new Rational(this.numerator,this.denominator);
    }
}