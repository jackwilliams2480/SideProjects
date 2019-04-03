class Child extends Parent 
{ 
    // new m1() method 
    // unique to Child class 
    private void m1() { System.out.println("From child m1()");} 
      
    // overriding method 
    // with more accessibility 
    public void m2() { System.out.println("From child m2()");} 
      
} 